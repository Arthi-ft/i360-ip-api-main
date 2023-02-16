package com.ft.models.jpa;

/* 
import com.fintuple.common.annotations.Column;
import com.fintuple.common.annotations.Table;
import com.fintuple.common.beans.EntityUserAddlAttributes;
*/

//import java.sql.Timestamp;
import lombok.Data;


@Data
//@Table(name = "investor_manager_linkage")
public class InvestorManagerLinkage {

    //@Column(name = "iml_id")
    private Integer imlId;   //pK

    //@Column(name = "entity_user_id")
    private String entityUserId;    //fk

    //@Column(name = "investor_id")
    private String investorId;     //fK


    
}
