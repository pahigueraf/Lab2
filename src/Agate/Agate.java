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
public class Agate {
    private TreeMap<String,Client> clients;
    private TreeMap<String,AgateStaffMember> staff;
        
    public Agate() {
        this.clients = new TreeMap<>();
        this.staff = new TreeMap<>();
    }
    
    public boolean addClient(Client client)
    {
        this.clients.put(client.getClientName(),client);
        return true;
    }
    
    public boolean addAgateStaffMember(AgateStaffMember member)
    {
        this.staff.put(member.getAgateMemberName(), member);
        return true;
    }       
    
    public AgateStaffMember searchPossibleContactByName(String name)
    {
        AgateStaffMember tmp=null;
                  
        if (this.staff.containsKey(name))
        {
            if(this.staff.get(name)instanceof ClientContact)
                tmp = staff.get(name);

        }

        return tmp;
    }
    
    public AgateStaffMember searchPossibleProjectManagerByName(String name)
    {
        AgateStaffMember tmp=null;
                  
        if (this.staff.containsKey(name))
        {
            if(this.staff.get(name)instanceof AdvertisingProjectManager)
                tmp = staff.get(name);

        }

        return tmp;
    }
    public Client searchClient(String name)
    {
        Client tmp=null;
                  
        if (this.clients.containsKey(name))
        {

            tmp = clients.get(name);

        }

        return tmp;
    }
    public AgateStaffMember searchProjectWorker(String name)
    {
        AgateStaffMember tmp=null;
                  
        if (this.staff.containsKey(name))
        {
            if(!(this.staff.get(name) instanceof AdvertisingProjectManager))
                tmp = staff.get(name);

        }

        return tmp;
    }
    public TreeMap<String, Client> getClients() {
        return clients;
    }

    public void setClients(TreeMap<String, Client> clients) {
        this.clients = clients;
    }

    public TreeMap<String, AgateStaffMember> getStaff() {
        return staff;
    }

    public void setStaff(TreeMap<String, AgateStaffMember> staff) {
        this.staff = staff;
    }
    
    
    
    
}
