/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.Calendar;

/**
 *
 * @author pahf33
 */
public class Worker {
    private int payrollNumber;
    private String name;
    private String address;
    private String phone;
    private boolean availability;
    private Calendar availableDate;
    
    private TimeSheet timeSheet;

    public Worker(int payrollNumber, String name, String address, String phone, boolean availability) {
        this.payrollNumber = payrollNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.timeSheet = new TimeSheet();
        this.availability = availability;
        this.availableDate = Calendar.getInstance();
    }

    @Override
    public String toString() {
        return "Worker{" + "payrollNumber=" + payrollNumber + ", name=" + name + ", address=" + address + ", phone=" + phone + ", availability=" + availability + ", availableDate=" + availableDate.toString() + ", timeSheet=" + timeSheet.toString() + '}';
    }
    
    
    public int getPayrollNumber() {
        return payrollNumber;
    }

    public void setPayrollNumber(int payrollNumber) {
        this.payrollNumber = payrollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public TimeSheet getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Calendar getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Calendar availableDate) {
        this.availableDate = availableDate;
    }
    
    
}
