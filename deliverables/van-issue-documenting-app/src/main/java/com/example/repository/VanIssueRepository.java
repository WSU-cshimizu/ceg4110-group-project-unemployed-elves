package com.example.repository;

import com.example.model.VanIssue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VanIssueRepository extends JpaRepository<VanIssue, Long> {
    VanIssue findTopByOrderByDatetimeDesc();
}
