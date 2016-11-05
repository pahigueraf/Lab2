/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class AdvertisingProject {
    private String projectTitle;
    private Calendar theorethicalStartDate;
    private Calendar theorethicalEndDate;
    private double theorethicalCost;
    
    private String state;
    
    private Calendar realStartDate;
    private Calendar realEndDate;
    private double realCost; 
    
    private boolean projectPayment;
    private Calendar projectPaymentDate;
    
    private AgateStaffMember projectManager;
    private TreeMap<String,AgateStaffMember> projectWorkers;
    
    private TreeMap<String,Commercial> commercials;
    private TreeMap<String,Notes> notes;

    public AdvertisingProject(String projectTitle, Calendar theorethicalStartDate, Calendar theorethicalEndDate, double theorethicalCost, AgateStaffMember projectManager) {
        this.projectTitle = projectTitle;
        this.theorethicalStartDate = theorethicalStartDate;
        this.theorethicalEndDate = theorethicalEndDate;
        this.theorethicalCost = theorethicalCost;        
        this.projectManager = projectManager;
        this.commercials = new TreeMap<>();
        this.notes = new TreeMap<>();
        this.projectWorkers = new TreeMap<>();
        this.state = "Active";
    }

    
    
    public boolean addCommercial(Commercial commercial)
    {
        this.commercials.put(commercial.getCommercialName(),commercial);
        return true;
    }
    
    public boolean addNotes(Notes note)
    {
        this.notes.put(note.getNoteTitle(),note);
        return true;
    }
    
    public boolean addWorker(AgateStaffMember workers)
    {
        this.projectWorkers.put(workers.getAgateMemberName(),workers);
        return true;
    }
    
    public Commercial searchCommercialbyName(String name)
    {
        Commercial tmp=null;
                  
        if (this.commercials.containsKey(name))
        {            
            tmp = this.commercials.get(name);

        }

        return tmp;
    }
    public Notes searchNotebyName(String name)
    {
        Notes tmp=null;
                  
        if (this.notes.containsKey(name))
        {            
            tmp = this.notes.get(name);

        }

        return tmp;
    }
    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Calendar getTheorethicalStartDate() {
        return theorethicalStartDate;
    }

    public void setTheorethicalStartDate(Calendar theorethicalStartDate) {
        this.theorethicalStartDate = theorethicalStartDate;
    }

    public Calendar getTheorethicalEndDate() {
        return theorethicalEndDate;
    }

    public void setTheorethicalEndDate(Calendar theorethicalEndDate) {
        this.theorethicalEndDate = theorethicalEndDate;
    }

    public double getTheorethicalCost() {
        return theorethicalCost;
    }

    public void setTheorethicalCost(double theorethicalCost) {
        this.theorethicalCost = theorethicalCost;
    }

    public Calendar getRealStartDate() {
        return realStartDate;
    }

    public void setRealStartDate(Calendar realStartDate) {
        this.realStartDate = realStartDate;
    }

    public Calendar getRealEndDate() {
        return realEndDate;
    }

    public void setRealEndDate(Calendar realEndDate) {
        this.realEndDate = realEndDate;
    }

    public double getRealCost() {
        return realCost;
    }

    public void setRealCost(double realCost) {
        this.realCost = realCost;
    }

    public boolean isProjectPayment() {
        return projectPayment;
    }

    public void setProjectPayment(boolean projectPayment) {
        this.projectPayment = projectPayment;
    }

    public Calendar getProjectPaymentDate() {
        return projectPaymentDate;
    }

    public void setProjectPaymentDate(Calendar projectPaymentDate) {
        this.projectPaymentDate = projectPaymentDate;
    }

    public AgateStaffMember getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(AgateStaffMember projectManager) {
        this.projectManager = projectManager;
    }

    public TreeMap<String, AgateStaffMember> getProjectWorkers() {
        return projectWorkers;
    }

    public void setProjectWorkers(TreeMap<String, AgateStaffMember> projectWorkers) {
        this.projectWorkers = projectWorkers;
    }

    public TreeMap<String, Commercial> getCommercials() {
        return commercials;
    }

    public void setCommercials(TreeMap<String, Commercial> commercials) {
        this.commercials = commercials;
    }

    public TreeMap<String, Notes> getNotes() {
        return notes;
    }

    public void setNotes(TreeMap<String, Notes> notes) {
        this.notes = notes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
