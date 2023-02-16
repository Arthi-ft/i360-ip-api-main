package com.ft.service;

import com.ft.models.jpa.InvestorProfile;
import com.ft.repository.InvestorProfileRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorProfileService implements InvestorService {

    private InvestorProfileRepository investorProfileRepository;

    public InvestorProfileService(InvestorProfileRepository investorProfileRepository) {
        this.investorProfileRepository = investorProfileRepository;
    }

    @Override
    public List<InvestorProfile> searchInvestorProfile(String query) {
        List<InvestorProfile> investorProfile=investorProfileRepository.searchInvestor_profile(query);
        return investorProfile;
    }

    @Override
    public InvestorProfile createInvestorProfile(InvestorProfile investorProfile) {
        return investorProfileRepository.save(investorProfile);
    }
}
