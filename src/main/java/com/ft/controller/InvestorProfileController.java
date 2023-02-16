package com.ft.controller;


import com.ft.models.jpa.InvestorProfile;
import com.ft.service.InvestorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investor_profile/search")
public class InvestorProfileController {

    private InvestorService investorService;

    public InvestorProfileController(InvestorService investorService) {
        this.investorService = investorService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<InvestorProfile>> searchInvestorProfile(@RequestParam("query") String query){
        return ResponseEntity.ok(investorService.searchInvestorProfile(query));
    }
    @PostMapping
    public InvestorProfile createInvestorProfile(@RequestBody InvestorProfile investorProfile){
        return investorService.createInvestorProfile(investorProfile);
    }
}
