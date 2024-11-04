package com.example.controller;

import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private LoginService service;
    @GetMapping("/login")
    public String showLoginPage(ModelMap model) {
        return "login";
    }
    @PostMapping("/login")
    public String showWelcomePage(ModelMap model,
                                  @RequestParam String name,
                                  @RequestParam String surname,
                                  @RequestParam String driverID,
                                  @RequestParam String phoneNumber) {

        boolean isValidUser = service.validateUser(name, surname, driverID, phoneNumber);

        if (!isValidUser) {
            model.put("errorMessage", "Access Denied, Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("surname", surname);
        model.put("driverID", driverID);
        model.put("phone", phoneNumber);

        return "welcome";
    }

    @GetMapping("/logout")
    public String showLogoutPage(ModelMap model) {
        return "login";
    }
}
