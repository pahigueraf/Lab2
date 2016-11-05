/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agate;

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
        Agate agate = new Agate();
        boolean loopEnd = false;
        System.out.println("Welcome to Agate ");
        while(loopEnd ==false)
        {
            Scanner sn = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("Press: 1.Register employee, 2.Register Client, 3.Create Advertising Project"
                    + "4.Projects Information, 5.Agate Information 6(or other number).Close ");
            int election = sn.nextInt();
            switch (election) {
                case 1:
                    System.out.println("Press:Register 1.office director, 2.Finance Director, 3.Accounting Director, 4.Accounting Responisble, "
                            + "5.IT Director, 6.Writers, 7.Publishers, 8.Audio Technicians, 9.Photographers, "
                            + "10.Resource Bibliotecarian, 11.Network Support Technician, 12.Bails Manager, 13.Typist, 14.Shopping Assistants,"
                            + " 15.Recepcionist, 16.File Manager, 17.Secretary, 18.Administrative, 19.StaffSubDirector");
                    System.out.println("Deposit name, address, phone, wage an rate time worked");
                    String name;
                    String address;
                    String phone;
                    double wage;
                    double rateTimeWorked;
                    int election2 = sn.nextInt();
                    switch (election2) {
                        case 1:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember officeDirector= new OfficeDirector(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(officeDirector);
                            System.out.println("Ok!");
                            break;
                        case 2:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember financeDirector= new FinanceDirector(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(financeDirector);
                            System.out.println("Ok!");
                            break;
                        case 3:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember accountingDirector= new AccountingDirector(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(accountingDirector);
                            System.out.println("Ok!");
                            break;
                        case 4:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember accountingResponsible= new AccountingResponsible(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(accountingResponsible);
                            System.out.println("Ok!");
                            break;
                        case 5:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember itDirector= new ITDirector(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(itDirector);
                            System.out.println("Ok!");
                            break;
                        case 6:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember writer= new Writers(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(writer);
                            System.out.println("Ok!");
                            break;
                        case 7:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember publisher= new Publishers(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(publisher);
                            System.out.println("Ok!");
                            break;
                        case 8:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember audioTechnician= new AudioTechnicians(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(audioTechnician);
                            System.out.println("Ok!");
                            break;
                        case 9:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember photographer= new Photographers(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(photographer);
                            System.out.println("Ok!");
                            break;
                        case 10:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember resourceBibliotecarian= new ResourceBibliotecarian(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(resourceBibliotecarian);
                            System.out.println("Ok!");
                            break;
                        case 11:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember networkSupportTechnician= new NetworkSupportTechnician(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(networkSupportTechnician);
                            System.out.println("Ok!");
                            break;
                        case 12:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember bailsManager= new BailsManager(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(bailsManager);
                            System.out.println("Ok!");
                            break;
                        case 13:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember typist= new Typist(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(typist);
                            System.out.println("Ok!");
                            break;
                        case 14:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember shoppingAsistant= new ShoppingAsistant(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(shoppingAsistant);
                            System.out.println("Ok!");
                            break;
                        case 15:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember receptionist= new Receptionist(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(receptionist);
                            System.out.println("Ok!");
                            break;
                        case 16:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember fileManager= new FileManager(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(fileManager);
                            System.out.println("Ok!");
                            break;
                        case 17:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember secretary= new Secretary(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(secretary);
                            System.out.println("Ok!");
                            break;
                        case 18:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember administrative= new Administrative(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(administrative);
                            System.out.println("Ok!");
                            break;
                        case 19:
                            name = sn.next();
                            address = sn.next();
                            phone = sn.next();
                            wage = sn.nextDouble();
                            rateTimeWorked = sn.nextDouble();
                            AgateStaffMember staffSubDirector= new StaffSubDirector(name, address, phone, wage, rateTimeWorked);
                            agate.addAgateStaffMember(staffSubDirector);
                            System.out.println("Ok!");
                            break;                                                  
                        default:
                            throw new AssertionError();
                    }
                        
                    
                    break;
                case 2:
                    System.out.println("Deposit name, addres, phone, city and name of main contact");
                    String clientName;
                    String clientAdress;
                    String clientPhone;
                    String clientCity;
                    String clientMainContact;
                    clientName =sn.next();
                    clientAdress =sn.next();
                    clientPhone =sn.next();
                    clientCity =sn.next();
                    clientMainContact = sn.next();
                    Client client = new Client(clientName, clientAdress, clientPhone, clientCity, (ClientContact) agate.searchPossibleContactByName(clientMainContact));
                    agate.addClient(client);
                    System.out.println("Ok!");
                    break;
                case 3:
                    
                    String clientName1;
                    String projectTitle;
                    Calendar theorethicalStartDate = Calendar.getInstance();
                    Calendar theorethicalEndDate = Calendar.getInstance();
                    double theorethicalCost;
                    String projectManager;
                    
                    System.out.println("Deposit client name, project title, project manager, year, month and "
                            + "day of theorethical Start date, year, month and day of theorethical end date, "
                            + "theorethical cost");
                    clientName1= sn.next();
                    projectTitle = sn.next();
                    projectManager = sn.next();
                    theorethicalStartDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                    theorethicalEndDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                    theorethicalCost = sn.nextDouble();
                                        
                    AdvertisingProject project = new AdvertisingProject(projectTitle, theorethicalStartDate, theorethicalEndDate, theorethicalCost, agate.searchPossibleProjectManagerByName(projectManager));
                    agate.searchClient(clientName1).addProject(project);
                    System.out.println("Ok!");
                    
                    boolean loopEnd2 = false;
                    while(loopEnd2 == false)
                    {   
                        System.out.println("Would you like to add a worker in the project?s/n");
                        if (sn.next().equals("y"))
                        {
                            System.out.println("Deposit worker name");
                            String workerName = sn.next();
                            project.addWorker(agate.searchProjectWorker(workerName));
                            System.out.println("Ok!");                            
                        }
                        else
                            loopEnd2 = true;
                    }
                    boolean loopEnd3 = false;
                    while(loopEnd3 == false)
                    {   
                        System.out.println("Would you like to create an commercial?s/n");
                        if (sn.next().equals("y"))
                        {
                            System.out.println("Deposit commercial name and year, month an day of publicacion of commercial");
                            String commercialName = sn.next();
                            Calendar publicationDate = Calendar.getInstance();
                            publicationDate.set(sn.nextInt(),sn.nextInt(), sn.nextInt());
                            project.addCommercial(new Commercial(commercialName, publicationDate));
                            System.out.println("Ok!");
                        }
                        else
                            loopEnd3 = true;
                    }
                    break;
                case 4:
                     boolean loopEnd4 = false;
                    while(loopEnd4 == false)
                    {   
                        System.out.println("Would you like to do?");
                        System.out.println("1.Add worker to project 2.Add commercial to project 3.Modify project information"
                                + " 4.Modify commercial information 5.Add note to project 6.Search note "
                                + "7.See all notes to project 8.See all workers to project 9.See project manager"
                                + "10.(or other number).close");
                        System.out.println("Deposit client name and project name");
                        String clientName2 = sn.next();
                        Client client2 = agate.searchClient(clientName2);
                        String projectName = sn.next();
                        AdvertisingProject project2= client2.searchProjectByName(projectName);
                        if (sn.next().equals(1))
                        {                            
                            System.out.println("Deposit worker name and year");
                            String workerName2 = sn.next();
                            project2.addWorker(agate.searchProjectWorker(workerName2));
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(2))
                        {
                            System.out.println("Deposit commercial name and year, month and day of publicacion of commercial");
                            String commercialName = sn.next();
                            Calendar publicationDate = Calendar.getInstance();
                            publicationDate.set(sn.nextInt(),sn.nextInt(), sn.nextInt());
                            project2.addCommercial(new Commercial(commercialName, publicationDate));
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(3))
                        {                            
                            System.out.println("Would you like to do?");
                            System.out.println("1.Modify theorethical end date 2.Modify real dates and costs"
                                    + " 3.Modify payment staments 4 or other number. Close");
                            Calendar calendar = Calendar.getInstance();
                            switch (sn.nextInt()) {
                                case 1:
                                    System.out.println("Deposit year, month and day of theorethical end date");
                                    calendar.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                                    project2.setTheorethicalEndDate(calendar);                                    
                                    System.out.println("Ok!");
                                    break;
                                case 2:
                                    System.out.println("Deposit year month and day of real start date, year month and day"
                                            + "of real end date and real cost of project");
                                    calendar.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                                    project2.setRealStartDate(calendar);
                                    calendar.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                                    project2.setRealEndDate(calendar);
                                    project2.setRealCost(sn.nextDouble());
                                    System.out.println("Ok!");
                                    break;
                                case 3:
                                    System.out.println("Did already the client pay?y/n");
                                    if(sn.next().equals("y"))
                                    {
                                        System.out.println("deposit year month and day of payment date");
                                        project2.setProjectPayment(true);
                                        project2.setState("Finalized");
                                        calendar.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                                        project2.setProjectPaymentDate(calendar);
                                        System.out.println("Ok!");
                                    }
                                default:
                                    continue;
                            }
                        }
                        else if (sn.next().equals(4))
                        {
                            System.out.println("deposit commercial name");
                            String commercialName = sn.next();                            
                            project2.searchCommercialbyName(commercialName).setState("Finalized");
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(5))
                        {
                            System.out.println("deposit note title, year month and day of note creation, contents of note"
                                    + "and creator name");
                            String noteTitle = sn.next();
                            Calendar noteDate= Calendar.getInstance();
                            noteDate.set(sn.nextInt(), sn.nextInt(), sn.nextInt());
                            String note= sn.next();
                            String creator = sn.next();
                                                        
                            Notes note1 = new Notes(noteTitle, noteDate, agate.searchProjectWorker(creator),note);
                            project2.addNotes(note1);
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(6))
                        {
                            System.out.println("Deposit note title");
                            String noteName = sn.next();                                                        
                            System.out.println(project2.searchNotebyName(noteName).getNote());
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(7))
                        {
                            for (Notes note2:project2.getNotes().values() ) {
                                System.out.println(note2.toString());
                            }
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(8))
                        {
                            for (AgateStaffMember worker2:project2.getProjectWorkers().values() ) {
                                System.out.println(worker2.toString());
                            }
                            System.out.println("Ok!");
                        }
                        else if (sn.next().equals(9))
                        {
                            System.out.println(project2.getProjectManager().toString());
                            System.out.println("Ok!");
                        }
                        else
                            loopEnd4 = true;
                    }
                    break;
                case 5:
                    
                    boolean loopEnd5 = false;
                    while(loopEnd5 ==false)
                    {
                        System.out.println("Would you like to do?");
                        System.out.println("1.See all clients of Agate, 2.See all workers of Agate,");
                        switch (sn.nextInt()) {
                            case 1:
                                for (Client client2:agate.getClients().values() ) {
                                    System.out.println(client2.toString());
                                }
                                break;
                            case 2:
                                for (AgateStaffMember worker2:agate.getStaff().values() ) {
                                    System.out.println(worker2.toString());
                                }
                                break;
                            default:
                                loopEnd5=false;
                        }
                    }
                    break;
                default:
                    break;
            }
            
        }
    }
    
}
