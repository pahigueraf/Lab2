/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

import java.util.Calendar;

/**
 *
 * @author pahf33
 */
public class Notes {
    private String noteTitle;
    private Calendar noteDate;
    private String note;
    
    private AgateStaffMember noteCreator;

    public Notes(String noteTitle, Calendar noteDate, AgateStaffMember noteCreator, String note) {
        this.noteTitle = noteTitle;
        this.noteDate = noteDate;
        this.note = note;
        this.noteCreator = noteCreator;
    }

    @Override
    public String toString() {
        return "Notes{" + "noteTitle=" + noteTitle + ", noteDate=" + noteDate + ", note=" + note + ", noteCreator=" + noteCreator.getAgateMemberName() + '}';
    }

    

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public Calendar getNoteDate() {
        return noteDate;
    }

    public void setNoteDate(Calendar noteDate) {
        this.noteDate = noteDate;
    }

    public AgateStaffMember getNoteCreator() {
        return noteCreator;
    }

    public void setNoteCreator(AgateStaffMember noteCreator) {
        this.noteCreator = noteCreator;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
