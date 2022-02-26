package com.tc.sp.domain;

public class DomainOrder {
    private int id;
    
    private String oderNo;

    private Domain domain;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOderNo() {
        return oderNo;
    }

    public void setOderNo(String oderNo) {
        this.oderNo = oderNo;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }
}
