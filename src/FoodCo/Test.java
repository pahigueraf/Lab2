/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodCo;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author pahf33
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        Programming foodCo = new Programming();
        Calendar calendar= Calendar.getInstance();
        boolean loopEnd = false;
        while(loopEnd==false)
        {
            System.out.println("Would you like to do?");
            System.out.println("1.Register worker, 2.Register supervisor, 3.Create Line, 4.Creat work"
                    + "5.Create and add failure to works, 6.Show information of workers, 7.Show information of supervisors,"
                    + "8.Show information of Lines, 9.Show information of works, 10.Create programming, "
                    + "11.Fill Time sheets, 12 or other number. Close");
            switch (sn.nextInt()) {
                case 1:
                    System.out.println("Deposit payroll Numbre, name,address, phone, availability(true/false),");
                    int payrollNumber = sn.nextInt();
                    String name = sn.next();
                    String address= sn.next();
                    String phone=sn.next();
                    boolean availability = sn.nextBoolean();
                    Worker worker = new Worker(payrollNumber, name, address, phone, availability);
                    foodCo.addWorker(worker);
                    break;
                case 2:
                    System.out.println("Deposit payroll number, name,address and phone");
                    int payrollNumber2 = sn.nextInt();
                    String name1=sn.next();
                    String address1=sn.next();
                    String phone1=sn.next();
                    Supervisor supervisor = new Supervisor(payrollNumber2,name1, address1, phone1);
                    foodCo.addSupervisor(supervisor);
                    break;
                case 3:
                    System.out.println("Deposit line number and production date");
                    int lineNumber= sn.nextInt();
                    calendar.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                    Line line = new Line(lineNumber, calendar);
                    foodCo.addLine(line);
                    break;
                case 4:
                    System.out.println("Deposit work number, year month day hour and minute of start work, "
                            + "year month day hour and minut of ending work");
                    int workNumber = sn.nextInt();
                    Calendar startDate = Calendar.getInstance();
                    Calendar endDate = Calendar.getInstance();
                    startDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt(),sn.nextInt(),sn.nextInt());
                    endDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt(),sn.nextInt(),sn.nextInt());
                    Works work = new Works(workNumber, startDate, endDate);
                    foodCo.addWork(work);
                case 5:
                    System.out.println("deposit failure number, year month and day of failure, number of stopped hours,"
                            + "number of stopedd minutes, and failure description");
                    int failureNumber= sn.nextInt();
                    Calendar failureDate=Calendar.getInstance();
                    failureDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                    int stoppedHours=sn.nextInt();
                    int stoppedMinutes=sn.nextInt();
                    String failureDescription=sn.next();
                    Failure failure = new Failure(failureNumber, failureDate, stoppedHours, stoppedMinutes, failureDescription);                    
                    foodCo.getWorks().get(sn.nextInt()).addFailure(failure);
                    break;
                case 6:
                    for (Worker worker1 : foodCo.getWorkers().values()) {
                        System.out.println(worker1.toString());
                    }
                    break;
                case 7:
                    for (Supervisor supervisor1 : foodCo.getSupervisors().values()) {
                        System.out.println(supervisor1.toString());
                    }
                    break;
                case 8:
                    for (Line line1 : foodCo.getLines().values()) {
                        System.out.println(line1.toString());
                    }
                    break;
                case 9:
                    for (Works work1 : foodCo.getWorks().values()) {
                        System.out.println(work1.toString());
                    }
                    break;    
                case 10:
                    System.out.println("Deposit line number, work number and payroll number supervisor");
                    int lineNumber1=sn.nextInt(); 
                    int workNumber1=sn.nextInt(); 
                    int supervisorPayrollNumber =sn.nextInt();
                    foodCo.createProgramming(lineNumber1, workNumber1, supervisorPayrollNumber);
                    System.out.println("Add workers. ");
                    boolean endLoop2=false;
                    while(endLoop2 ==false)
                    {
                        System.out.println("Deposit worker number");
                        int workerNumber = sn.nextInt();
                        foodCo.searchWork(workNumber1).addWorker(foodCo.searchWorker(workerNumber));
                        System.out.println("Would you like to add other worker?y/n");
                        if(sn.next()=="n")
                            endLoop2=true;
                    }
                    break;
                case 11:
                    int workerNumber2 = sn.nextInt();
                    
                    break;
                default:
                    loopEnd=true;
            }
        }
    }
    
}
