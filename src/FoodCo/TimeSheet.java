/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author pahf33
 */
public class TimeSheet {
    private ArrayList<Calendar> date;
    private ArrayList<Integer> lineNumber;
    private ArrayList<Integer> workNumber;
    private ArrayList<Integer> hoursProduced;
    private ArrayList<Integer> minutesProduced;
    private ArrayList<Integer> inactivityHours;
    private ArrayList<Integer> inactivityMinutes;
    private ArrayList<Integer> hoursNotWorked;
    private ArrayList<Integer> minutesNotWorked;
    private ArrayList<String> code;
    
    private int totalHours;
    private int totalMinutes;
    private int totalInactivityHours;
    private int totalInactivityMinutes;
    private int totalHoursNotWorked;
    private int totalMinutesNotWorked;

    public TimeSheet() {
        this.date = new ArrayList<>();
        this.lineNumber = new ArrayList<>();
        this.workNumber = new ArrayList<>();
        this.hoursProduced = new ArrayList<>();
        this.minutesProduced = new ArrayList<>();
        this.inactivityHours = new ArrayList<>();
        this.inactivityMinutes = new ArrayList<>();
        this.hoursNotWorked = new ArrayList<>();
        this.minutesNotWorked = new ArrayList<>();
        this.code = new ArrayList<>();
        
        this.totalHours = 0;
        this.totalMinutes = 0;
        this.totalInactivityHours = 0;
        this.totalInactivityMinutes = 0;
        this.totalHoursNotWorked = 0;
        this.totalMinutesNotWorked = 0;
    }

    @Override
    public String toString() {
        String string="";
        for (int i = 0; i < date.size(); i++) {
            string+="{" + "date=" + date.get(i) + ", lineNumber=" + lineNumber.get(i) + ", workNumber=" + workNumber.get(i) + ", hoursProduced=" + hoursProduced.get(i) + ", minutesProduced=" + minutesProduced.get(i) + ", inactivityHours=" + inactivityHours.get(i) + ", inactivityMinutes=" + inactivityMinutes.get(i) + ", hoursNotWorked=" + hoursNotWorked.get(i) + ", minutesNotWorked=" + minutesNotWorked.get(i) + ", code=" + code.get(i) + "}\n";
        }
        string+="{ totalHours=" + totalHours + ", totalMinutes=" + totalMinutes + ", totalInactivityHours=" + totalInactivityHours + ", totalInactivityMinutes=" + totalInactivityMinutes + ", totalHoursNotWorked=" + totalHoursNotWorked + ", totalMinutesNotWorked=" + totalMinutesNotWorked + '}';
        return string; 
    }

    public ArrayList<Calendar> getDate() {
        return date;
    }

    public void setDate(ArrayList<Calendar> date) {
        this.date = date;
    }

    public ArrayList<Integer> getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(ArrayList<Integer> lineNumber) {
        this.lineNumber = lineNumber;
    }

    public ArrayList<Integer> getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(ArrayList<Integer> workNumber) {
        this.workNumber = workNumber;
    }

    public ArrayList<Integer> getHoursProduced() {
        return hoursProduced;
    }

    public void setHoursProduced(ArrayList<Integer> hoursProduced) {
        this.hoursProduced = hoursProduced;
    }

    public ArrayList<Integer> getMinutesProduced() {
        return minutesProduced;
    }

    public void setMinutesProduced(ArrayList<Integer> minutesProduced) {
        this.minutesProduced = minutesProduced;
    }

    public ArrayList<Integer> getInactivityHours() {
        return inactivityHours;
    }

    public void setInactivityHours(ArrayList<Integer> inactivityHours) {
        this.inactivityHours = inactivityHours;
    }

    public ArrayList<Integer> getInactivityMinutes() {
        return inactivityMinutes;
    }

    public void setInactivityMinutes(ArrayList<Integer> inactivityMinutes) {
        this.inactivityMinutes = inactivityMinutes;
    }

    public ArrayList<Integer> getHoursNotWorked() {
        return hoursNotWorked;
    }

    public void setHoursNotWorked(ArrayList<Integer> hoursNotWorked) {
        this.hoursNotWorked = hoursNotWorked;
    }

    public ArrayList<Integer> getMinutesNotWorked() {
        return minutesNotWorked;
    }

    public void setMinutesNotWorked(ArrayList<Integer> minutesNotWorked) {
        this.minutesNotWorked = minutesNotWorked;
    }

    public ArrayList<String> getCode() {
        return code;
    }

    public void setCode(ArrayList<String> code) {
        this.code = code;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getTotalInactivityHours() {
        return totalInactivityHours;
    }

    public void setTotalInactivityHours(int totalInactivityHours) {
        this.totalInactivityHours = totalInactivityHours;
    }

    public int getTotalInactivityMinutes() {
        return totalInactivityMinutes;
    }

    public void setTotalInactivityMinutes(int totalInactivityMinutes) {
        this.totalInactivityMinutes = totalInactivityMinutes;
    }

    public int getTotalHoursNotWorked() {
        return totalHoursNotWorked;
    }

    public void setTotalHoursNotWorked(int totalHoursNotWorked) {
        this.totalHoursNotWorked = totalHoursNotWorked;
    }

    public int getTotalMinutesNotWorked() {
        return totalMinutesNotWorked;
    }

    public void setTotalMinutesNotWorked(int totalMinutesNotWorked) {
        this.totalMinutesNotWorked = totalMinutesNotWorked;
    }
    
    
}
