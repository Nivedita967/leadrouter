package com.example.leadrouter.services;

import com.example.leadrouter.models.Lead;
import com.example.leadrouter.repositories.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {
    
    @Autowired
    private LeadRepository leadRepository;
    
    @Autowired
    private RoutingService routingService;

    public Lead createLead(Lead lead) {
        Lead savedLead = leadRepository.save(lead);
        routingService.processLeadRouting(savedLead);
        return savedLead;
    }
}
