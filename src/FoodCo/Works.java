/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class Works {
    private int workNumber;
    private Calendar startDate;
    private Calendar endDate;   
    
    private Worker[] workers;
    private TreeMap<Integer,Failure> failures;

    public Works(int workNumber, Calendar startDate, Calendar endDate) {
        this.workNumber = workNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        
        this.workers = new Worker[20];
        this.failures = new TreeMap<>();
    }

    @Override
    public String toString() {
        String tmp ="";
        String tmp2="";
        for (int i = 0; i < 20; i++) {
            tmp+=" "+workers[i].getName();
        }
        for (Failure f : this.failures.values()) {
            tmp2+=" "+failures.toString();
        }
        return "Works{" + "workNumber=" + workNumber + ", startDate=" + startDate.toString() + ", endDate=" + endDate.toString() + ", workers=" +tmp + ", failures=" + tmp2 + '}';
    }
    
    public boolean addWorker(Worker worker)
    {
        for (int i = 0; i < 20; i++) {
            if(workers[i]==null)
                workers[i]=worker;
            else
                System.out.println("No more workers!");
        }
        return true;
    }
    public boolean addFailure(Failure failure)
    {
        if(!(this.failures.containsKey(failure.getFailureNumber())))
        {
            this.failures.put(failure.getFailureNumber(), failure);
        }
        return true;
    }
    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    public TreeMap<Integer, Failure> getFailures() {
        return failures;
    }

    public void setFailures(TreeMap<Integer, Failure>failures) {
        this.failures = failures;
    }
    
    
}
