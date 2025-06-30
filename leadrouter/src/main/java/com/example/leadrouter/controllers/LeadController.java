package com.example.leadrouter.controllers;

import com.example.leadrouter.models.Lead;
import com.example.leadrouter.services.LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/leads")
public class LeadController {
    
    @Autowired
    private LeadService leadService;

    @PostMapping
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }
}