package com.example.service;

import com.example.model.VanIssue;
import com.example.repository.VanIssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VanIssueService {

    @Autowired
    private VanIssueRepository vanIssueRepository;

    public void saveVanIssue(VanIssue vanIssue) {
        try {
            vanIssueRepository.save(vanIssue);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to save van issue to the database", e);
        }
    }


}
