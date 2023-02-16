package com.ft.models.jpa;

/* 
import com.fintuple.common.annotations.Column;
import com.fintuple.common.annotations.Table;
import com.fintuple.common.beans.EntityUserAddlAttributes;
*/
//import java.sql.Timestamp;
import lombok.*;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "investor_profile")
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    //@Column(name = "ip_id")
    private Integer ipId;   // primary key

    //@Column(name = "investor_id")
    private String investorId;    // primary key

    //@Column(name = "investor_profile_status")
    private String investorProfileStatus;    

    //@Column(name = "investor_pan", encrypt = true)
    private String investorPan;

    //@Column(name = "investor_email_address", encrypt = true)
    private String investorEmailAddress;

    //@Column(name = "investor_mobile_number", encrypt = true)
    private String investorMobileNumber;

    //@Column(name = "investor_basic_profile", encrypt = true)
    private String investorBasicProfile;

    //@Column(name = "investor_kyc_data", encrypt = true)
    private String investorKYCData;

    //@Column(name = "investor_other_profile_data", encrypt = true)
    private String investorOtherProfile;

    //@Column(name = "investor_documents", encrypt = true)
    private String investorDocuments;

    //@Column(name = "is_visible")
    private Integer isVisible;

    //@Column(name = "is_deleted")
    private Integer isDeleted;

    //@CreationTimeStamp
    private LocalDateTime dateCreated;

    //@UpdateTimeStamp
    private LocalDateTime dateUpdated;
    
}
