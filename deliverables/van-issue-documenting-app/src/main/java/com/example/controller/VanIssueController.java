package com.example.controller;

import com.example.model.VanIssue;
import com.example.service.VanIssueService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class VanIssueController {

    @Autowired
    VanIssueService vanIssueService;


    @GetMapping("/welcome")
    public String showWelcomePage(ModelMap model) {
        return "welcome";
    }

    @PostMapping("/submit-van-issue")
    public String submitVanIssue(
            @RequestParam String vin,
            @RequestParam String licensePlate,
            @RequestParam String issueDescription,
            @RequestParam String datetime,
            @RequestParam List<String> issueRegion,
            @RequestParam String licenseState,
            HttpSession session,
            Model model) {

        String driverID = (String) session.getAttribute("driverID");

        if (datetime.contains("T")) {
            datetime = datetime.replace("T", " ");
        }

        if (datetime.length() == 16) {
            datetime += ":00";
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime issueDatetime = LocalDateTime.parse(datetime, formatter);

        String beautifiedDatetime = issueDatetime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm a"));

        String issueRegionStr = String.join(", ", issueRegion);

        VanIssue vanIssue = new VanIssue(vin, licensePlate, licenseState, issueRegionStr, issueDescription, driverID);
        vanIssue.setDatetime(issueDatetime);

        vanIssueService.saveVanIssue(vanIssue);

        model.addAttribute("driverID", driverID);
        model.addAttribute("vin", vin);
        model.addAttribute("licensePlate", licensePlate);
        model.addAttribute("issueDescription", issueDescription);
        model.addAttribute("licenseState", licenseState);
        model.addAttribute("issueRegion", issueRegionStr);
        model.addAttribute("datetime", beautifiedDatetime);

        return "van-issue-success";
    }
}

