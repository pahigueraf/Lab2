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
public class StaffSubDirector extends AgateStaffMember{
    
    public StaffSubDirector(String agateMemberName, String agateMemberAddress, String agateMemberPhone, double wage, double rateTimeWorked) {
        super(agateMemberName, agateMemberAddress, agateMemberPhone, wage, rateTimeWorked);
        this.workArea = "Management Area";
    }
    
}
