/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

/**
 *
 * @author pahf33
 */
public class AgateStaffMember {
    private String agateMemberName;
    private String agateMemberAddress;
    private String agateMemberPhone;
    
    protected double wage;
    protected double rateTimeWorked;
    protected String workArea;

    public AgateStaffMember(String agateMemberName, String agateMemberAddress, String agateMemberPhone, double wage, double rateTimeWorked) {
        this.agateMemberName = agateMemberName;
        this.agateMemberAddress = agateMemberAddress;
        this.agateMemberPhone = agateMemberPhone;
        this.wage = wage;
        this.rateTimeWorked = rateTimeWorked;
    }

    @Override
    public String toString() {
        return "AgateStaffMember{" + "agateMemberName=" + agateMemberName + ", agateMemberAddress=" + agateMemberAddress + ", agateMemberPhone=" + agateMemberPhone + ", wage=" + wage + ", rateTimeWorked=" + rateTimeWorked + ", workArea=" + workArea + '}';
    }

    public String getAgateMemberName() {
        return agateMemberName;
    }

    public void setAgateMemberName(String agateMemberName) {
        this.agateMemberName = agateMemberName;
    }

    public String getAgateMemberAddress() {
        return agateMemberAddress;
    }

    public void setAgateMemberAddress(String agateMemberAddress) {
        this.agateMemberAddress = agateMemberAddress;
    }

    public String getAgateMemberPhone() {
        return agateMemberPhone;
    }

    public void setAgateMemberPhone(String agateMemberPhone) {
        this.agateMemberPhone = agateMemberPhone;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getRateTimeWorked() {
        return rateTimeWorked;
    }

    public void setRateTimeWorked(double rateTimeWorked) {
        this.rateTimeWorked = rateTimeWorked;
    }

    public String getWorkArea() {
        return workArea;
    }

    public void setWorkArea(String workArea) {
        this.workArea = workArea;
    }
    
    
}
