/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

/**
 *
 * @author pahf33
 */
public class Supervisor {
    private int payrollNumber;
    private String name;
    private String address;
    private String phone;
    
    private Line line;

    public Supervisor(int payrollNumber,String name, String address, String phone) {
        this.payrollNumber = payrollNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Supervisor { payrollNumber=" + payrollNumber+ "name=" + name + ", address=" + address + ", phone=" + phone + ", line=" + line.getLineNumber() + '}';
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

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public int getPayrollNumber() {
        return payrollNumber;
    }

    public void setPayrollNumber(int payrollNumber) {
        this.payrollNumber = payrollNumber;
    }
    
    
}
