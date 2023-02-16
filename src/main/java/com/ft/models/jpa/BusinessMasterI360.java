package com.ft.models.jpa;
/* 
import com.fintuple.common.annotations.Column;
import com.fintuple.common.annotations.Table;
import com.fintuple.common.beans.EntityUserAddlAttributes;
*/

//import java.sql.Timestamp;
import lombok.Data;


@Data
//@Table(name = "business_master_i360")
public class BusinessMasterI360 {

        //@Column(name = "primary_master_data_type")
        private String primaryMasterDataType;   //pK

        //@Column(name = "master_type")
        private String masterType;    //pK
    
        //@Column(name = "master_type_filter")
        private String masterTypeFilter;    
    
        //@Column(name = "master_description")
        private String masterDescription;
    
        //@Column(name = "sequence_number")
        private Integer sequenceNumber;
    
        //@Column(name = "is_active")
        private Integer isActive;
    

    
}
