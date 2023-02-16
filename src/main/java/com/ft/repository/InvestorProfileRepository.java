package com.ft.repository;

import com.ft.models.jpa.InvestorProfile;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


public interface InvestorProfileRepository extends JpaRepository<InvestorProfile, Long> {

    @Query("SELECT investor_id FROM InvestorProfile WHERE"+
            "investor_id.name LIKE CONCAT('%',:query,'%')")

    List<InvestorProfile> searchInvestor_profile (String query);

    @Query(value = "SELECT * FROM investor_profile WHERE"+
            "investor_id.name LIKE CONCAT('%',:query,'%')",nativeQuery = true)
    List<InvestorProfile> searchInvestor_profileSQL (String query);





}
