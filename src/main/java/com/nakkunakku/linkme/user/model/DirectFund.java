package com.nakkunakku.linkme.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DirectFund {
    String userId;
    String phoneNum;
    String socialSecurityNum;
    
    public DirectFund(RequestAddUser requestAddUser) {
        this.userId = requestAddUser.getId();
        this.phoneNum = requestAddUser.getDirectFund().getPhoneNum();
        this.socialSecurityNum = requestAddUser.getDirectFund().getSocialSecurityNum();
    }
    
    public DirectFund(RequestUpdateUser requestUpdateUser) {
        this.userId = requestUpdateUser.getId();
        this.phoneNum = requestUpdateUser.getDirectFund().getPhoneNum();
        this.socialSecurityNum = requestUpdateUser.getDirectFund().getSocialSecurityNum();
    }
}
