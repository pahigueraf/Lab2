/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class Client {
    private String clientName;
    private String clientAdress;
    private String clientPhone;
    private String clientCity;
    
    private TreeMap<String,AdvertisingProject> projects; 
    private AgateStaffMember mainContact;

    public Client(String clientName, String clientAdress, String clientPhone, String clientCity, AgateStaffMember mainContact) {
        this.clientName = clientName;
        this.clientAdress = clientAdress;
        this.clientPhone = clientPhone;
        this.clientCity = clientCity;
        
        this.projects = new TreeMap<>();
        this.mainContact = mainContact;
    }

    @Override
    public String toString() {
        
        System.out.println("Client{" + "clientName=" + clientName + ", clientAdress=" + clientAdress + ", clientPhone=" + clientPhone + ", clientCity=" + clientCity + ", projects="
                 + ", mainContact=" + mainContact.getAgateMemberName() + '}');
        System.out.println("Projects Titles:");
        for (AdvertisingProject note2:projects.values() ) {
            System.out.println(note2.getProjectTitle());
        }
        return "Ok!";
    }
    
    public boolean addProject(AdvertisingProject project)
    {
        this.projects.put(project.getProjectTitle(),project);
        return true;
    }
    
    public AdvertisingProject searchProjectByName(String name)
    {
        AdvertisingProject tmp=null;
                  
        if (this.projects.containsKey(name))
        {            
            tmp = this.projects.get(name);

        }

        return tmp;
    }
    
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAdress() {
        return clientAdress;
    }

    public void setClientAdress(String clientAdress) {
        this.clientAdress = clientAdress;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public TreeMap<String, AdvertisingProject> getProjects() {
        return projects;
    }

    public void setProjects(TreeMap<String, AdvertisingProject> projects) {
        this.projects = projects;
    }

    public AgateStaffMember getMainContact() {
        return mainContact;
    }

    public void setMainContact(AgateStaffMember mainContact) {
        this.mainContact = mainContact;
    }
    
    
    
}
