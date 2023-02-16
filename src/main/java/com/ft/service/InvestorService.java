package com.ft.service;

import com.ft.models.jpa.InvestorProfile;

import java.util.List;

public interface InvestorService {
     List<InvestorProfile> searchInvestorProfile(String query);

    InvestorProfile createInvestorProfile(InvestorProfile investorProfile);
}
