/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class Commercial {
    private String commercialName;
    private Calendar publicationDate;
    
    private String state;
    
    private TreeMap<String,Notes> commercialNotes;

    public Commercial(String commercialName, Calendar publicationDate) {
        this.commercialName = commercialName;
        this.publicationDate = publicationDate;
        this.commercialNotes = new TreeMap<>();
        this.state = "Active";
    }

    
    
    public boolean addCommecialNote(Notes note)
    {
        if (!(this.commercialNotes.containsKey(note.getNoteTitle())))
        {
            this.commercialNotes.put(note.getNoteTitle(), note);
            
        }
        return true;
    }

    public String getCommercialName() {
        return commercialName;
    }

    public void setCommercialName(String commercialName) {
        this.commercialName = commercialName;
    }

    public Calendar getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Calendar publicationDate) {
        this.publicationDate = publicationDate;
    }

    public TreeMap<String, Notes> getCommercialNotes() {
        return commercialNotes;
    }

    public void setCommercialNotes(TreeMap<String, Notes> commercialNotes) {
        this.commercialNotes = commercialNotes;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
