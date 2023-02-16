package com.ft.models.jpa;

/* 
import com.fintuple.common.annotations.Column;
import com.fintuple.common.annotations.Table;
import com.fintuple.common.beans.EntityUserAddlAttributes;
*/
import java.sql.Timestamp;
import lombok.Data;


@Data
//@Table(name = "investor_relationship")
public class InvestorRelationship {

    //@Column(name = "ir_id")
    private Integer ipId;   // primary key

    //@Column(name = "investor_id")
    private String investorId;    //FK

    //@Column(name = "relationship_entity_id")
    private String relationshipEntityId;    

    //@Column(name = "investor_relationship_type")
    private String investorRelationshipType;

    //@Column(name = "investor_relationship_status")
    private String investorRelationshipStatus;

    //@Column(name = "investor_relationship_start_dt")
    private Timestamp investorRelationshipStartDT;

    //@Column(name = "is_deleted")
    private Integer isDeleted;

    
}



