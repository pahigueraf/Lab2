/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class Line {
    private int lineNumber;
    private Calendar date;
    
    private Supervisor supervisor;
    private TreeMap<Integer,Works> works;
    private int neccesaryIngredients;

    public Line(int lineNumber, Calendar date) {
        this.lineNumber = lineNumber;
        this.date = date;
        this.supervisor = null;
        this.works = new TreeMap<>();
    }

    @Override
    public String toString() {
        String tmp="";
        for (Works work : this.works.values()) {
            tmp+=" "+work.toString();
        }

        return "Line{" + "lineNumber=" + lineNumber + ", date=" + date + ", supervisor=" + supervisor.getName() + ",\n works=" + tmp + ", neccesaryIngredients=" + neccesaryIngredients + '}';
    }
    
    public boolean addWork(Works work)
    {
        this.works.put(work.getWorkNumber(), work);
        return true;
    }
    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public TreeMap<Integer, Works> getWorks() {
        return works;
    }

    public void setWorks(TreeMap<Integer, Works> works) {
        this.works = works;
    }

    public int getNeccesaryIngredients() {
        return neccesaryIngredients;
    }

    public void setNeccesaryIngredients(int neccesaryIngredients) {
        this.neccesaryIngredients = neccesaryIngredients;
    }
    
    
}
