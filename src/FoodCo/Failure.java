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
public class Failure {
    private int failureNumber;
    private Calendar failureDate;
    private int stoppedHours;
    private int stoppedMinutes;
    private String failureDescription;

    public Failure(int failureNumber, Calendar failureDate, int stoppedHours, int stoppedMinutes, String failureDescription) {
        this.failureNumber = failureNumber;
        this.failureDate = failureDate;
        this.stoppedHours = stoppedHours;
        this.stoppedMinutes = stoppedMinutes;
        this.failureDescription = failureDescription;
    }

    @Override
    public String toString() {
        return "Failure{" + "failureNumber=" + failureNumber + ", failureDate=" + failureDate.toString() + ", stoppedHours=" + stoppedHours + ", stoppedMinutes=" + stoppedMinutes + ", failureDescription=" + failureDescription + '}';
    }
    
    
    public int getFailureNumber() {
        return failureNumber;
    }

    public void setFailureNumber(int failureNumber) {
        this.failureNumber = failureNumber;
    }

    public Calendar getFailureDate() {
        return failureDate;
    }

    public void setFailureDate(Calendar failureDate) {
        this.failureDate = failureDate;
    }

    public int getStoppedHours() {
        return stoppedHours;
    }

    public void setStoppedHours(int stoppedHours) {
        this.stoppedHours = stoppedHours;
    }

    public int getStoppedMinutes() {
        return stoppedMinutes;
    }

    public void setStoppedMinutes(int stoppedMinutes) {
        this.stoppedMinutes = stoppedMinutes;
    }

    public String getFailureDescription() {
        return failureDescription;
    }

    public void setFailureDescription(String failureDescription) {
        this.failureDescription = failureDescription;
    }
    
    
}
