package com.example.controller;

import com.example.service.LoginService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {

    @Autowired
    protected LoginService service;

   @GetMapping("/login")
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @PostMapping("/login")
    public String showWelcomePage(HttpSession session,
                                  ModelMap model,
                                  @RequestParam String name,
                                  @RequestParam String surname,
                                  @RequestParam String driverID,
                                  @RequestParam String phoneNumber) {

        boolean isValidUser = service.validateUser(name, surname, driverID, phoneNumber);

        if (!isValidUser) {
            model.put("errorMessage", "Access Denied: Invalid Driver Credentials. ");
            return "login";
        }
        session.setAttribute("driverID", driverID);

        model.put("name", name);
        model.put("surname", surname);
        model.put("driverID", driverID);
        model.put("phone", phoneNumber);

        return "redirect:/welcome";
    }

    @GetMapping("/logout")
    public String showLogoutPage(ModelMap model) {
        return "login";
    }
}
