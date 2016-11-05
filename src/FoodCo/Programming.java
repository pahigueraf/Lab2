/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author pahf33
 */
public class Programming {
    private TreeMap<Integer,Line> lines;
    private TreeMap<Integer,Supervisor> supervisors;
    private TreeMap<Integer,Worker> workers;
    private TreeMap<Integer,Works> works;

    public Programming() {
        this.lines = new TreeMap<>();
        this.supervisors = new TreeMap<>();
        this.workers = new TreeMap<>();
        this.works = new TreeMap<>();
    }
    
    public void createProgramming(int lineNumber, int workNumber, int supervisorName)
    {
        Line lineTmp = searchLine(lineNumber);
        lineTmp.addWork(works.get(workNumber));
        lineTmp.setSupervisor(supervisors.get(supervisorName));
    }
    
    public Line searchLine(int lineNumber)
    {
        return lines.get(lineNumber);
    }
     public Worker searchWorker(int workerNumber)
    {
        return workers.get(workerNumber);
    }
     public Works searchWork(int workNumber)
    {
        return works.get(workNumber);
    } 
    public boolean addWorker(Worker worker)
    {
        this.workers.put(worker.getPayrollNumber(), worker);
        return true;
    }
    
    public boolean addWork(Works work)
    {
        this.works.put(work.getWorkNumber(), work);
        return true;
    }
    
    public boolean addLine(Line line)
    {
        this.lines.put(line.getLineNumber(), line);
        return true;
    }
    
    public boolean addSupervisor(Supervisor supervisor)
    {
        this.supervisors.put(supervisor.getPayrollNumber(),supervisor);
        return true;
    }
    
    public TreeMap<Integer, Line> getLines() {
        return lines;
    }

    public void setLines(TreeMap<Integer, Line> lines) {
        this.lines = lines;
    }

    public TreeMap<Integer, Supervisor> getSupervisors() {
        return supervisors;
    }

    public void setSupervisors(TreeMap<Integer, Supervisor> supervisors) {
        this.supervisors = supervisors;
    }

    public TreeMap<Integer, Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(TreeMap<Integer, Worker> workers) {
        this.workers = workers;
    }

    public TreeMap<Integer, Works> getWorks() {
        return works;
    }

    public void setWorks(TreeMap<Integer, Works> works) {
        this.works = works;
    }
    
    
}
