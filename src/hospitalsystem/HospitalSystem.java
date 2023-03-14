package hospitalsystem;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class HospitalSystem {

  static   HospitalSentosaManager ml=new HospitalSentosaManager("HOSPITAL SENTOSA","KUALA LUMPUR, MALAYSIA","0387212098");
 static Medicine[] arrMed;
    public static void main(String[] args) {
    	medicineDetail();

    	Scanner scan=new Scanner(System.in);
    	System.out.println("For Console, Press 1");
    	System.out.println("For GUI, Press 2");
    	System.out.print("Choice> ");
    	int choice=scan.nextInt();
    	if(choice==1) {menu();}
    	else {
    		MainWindow m=new MainWindow();
    		m.setVisible(true);
    		
 
    	}
    	
        
        
    }
    
   
    static void medicineDetail() {
    	arrMed=new Medicine[6];
    	arrMed[0]=new Medicine("A01","Antibiotic",20.50);
    	arrMed[1]=new Medicine("G01","Paracaetomol",24.50);
    	arrMed[2]=new Medicine("B01","Gabapentin",23.50);
    	arrMed[3]=new Medicine("Q01","Albuterol",12.50);
    	arrMed[4]=new Medicine("I01","Panadol",40.50);
    	arrMed[5]=new Medicine("P01","Hydralin",10.50);
    	
    }
    private static void menu() {
Scanner scan=new Scanner(System.in);
    	
        double sums = 0.0;
        int select;
     
     
        Doctor doc =  new Doctor("121","Dr Hassan","New CIty ABC, House No B111","0092323043","");
        Patient pat = new Patient("121","Dr Hassan","Old Town ABC, House No CXYZ","089232323","Hypertension"); 
      
        System.out.println("===========================");
        System.out.println("WELCOME TO "+ml.getHospitalName());
        System.out.println("===========================");
        
        System.out.println("\nPLEASE SELECT YOUR OPTION:");
        System.out.println("1 - DOCTOR");
        System.out.println("2 - PATIENT");
        System.out.println("3 - APPOINTMENT");
        System.out.println("4 - TREATMENT");
        System.out.println("5 - EXIT");
        System.out.println("\n ENTER OPTION: ");
     
        int choice=scan.nextInt();
        
         if(choice==5||choice>5) {
        	 System.out.println("Bye Bye !!!");
        	 System.exit(0);
        	 
        	 
         }
         else {
        	 try {
				submenu(choice);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
         }
        	
    }


	private static void submenu(int selection) throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
	       BufferedReader reader = new BufferedReader(input);
		Scanner scan=new Scanner(System.in);
		int select;
		if(selection==1) {
	    System.out.println("\n+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("[1] ADD DOCTOR: ");
    	System.out.println("[2] REMOVE DOCTOR: ");
    	System.out.println("[3] VIEW DOCTORS: ");
    	System.out.println("[4] SEARCH DOCTOR");
    	System.out.println("[5] MAIN MENU");
	    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+\n");
	    System.out.print("choice>");
    	select=scan.nextInt();
    	if(select==1) {
    		System.out.print("Enter Doctor ID: ");
    		String id=reader.readLine();		
    		System.out.print("Enter Doctor Name: ");
    		String name=reader.readLine();
    		System.out.print("Enter Doctor Address: ");
    		String address=reader.readLine();
    		System.out.print("Enter Doctor Contact No: ");
    		String contact=reader.readLine();
    		
    		Doctor d=new Doctor(id,name,address,contact,"");
    		ml.addDoctor(d);
    		System.out.println("DOCTOR ADDED !!! ");
    		submenu(1);
    		
    	}
    	else if(select==2) {
    		System.out.print("Enter Doctor ID to remove: ");
    		int id=scan.nextInt();
    		
    		int index=-1;
    		
    		for(int i=0; i<ml.getDoctorSize(); i++) {
    			if(ml.getDoctor(i)==null) {
    				continue;
    			}
    			if(ml.getDoctor(i).getId().equals(id)) {
    				index=i;
    			}
    			}
    		
    		if(index!=-1) {
    			ml.removeDoctor(index);
    			System.out.println("DOCTOR DELETED !!!");
    		}
    		else {
    			System.out.println("DOCTOR NOT FOUND!!!");
    		}
    		submenu(1);
	
    	}
    	else if(select==3) {
    		
        	System.out.println("+-+-+-+-+-+-+-");	
    		System.out.println("DOCTORS LIST");
        	System.out.println("+-+-+-+-+-+-+-");	

    		for(int i=0; i<ml.getDoctorSize(); i++) {
    			Doctor d=ml.getDoctor(i);
    			if(d==null) {
    				continue;
    			}
    			System.out.println("\n"+d.toString());
             
    		}
    	
    		submenu(1);

    	}
    	
    	else if(select==4) {
    		System.out.print("Enter Doctor ID to Search: ");
    		int id=scan.nextInt();
    		
    		int index=-1;
    		
    		for(int i=0; i<ml.getDoctorSize(); i++) {
    			if(ml.getDoctor(i)==null) {
    				continue;
    			}
    			if(ml.getDoctor(i).getId().equals(id)) {
    				index=i;
    			}
    			}
    		
    		if(index!=-1) {
    			Doctor d=ml.getDoctor(index);
    			System.out.println(d.toString());
    		}
    		else {
    			System.out.println("DOCTOR NOT FOUND!!!");
    		}
    	
    		submenu(1);

    	}
    	
    	else {menu();}
		
		}
		
	
	
	//PATIENT SELECTION
	
	if(selection==2) {
	    System.out.println("\n+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("[1] ADD PATIENT: ");
    	System.out.println("[2] REMOVE PATIENT: ");
    	System.out.println("[3] VIEW PATIENTS: ");
    	System.out.println("[4] SEARCH PATIENT");
    	System.out.println("[5] MAIN MENU");
	    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+\n");
	    System.out.print("choice>");
    	select=scan.nextInt();
    	if(select==1) {
    		System.out.print("Enter Patient ID: ");
    		String id=reader.readLine();
    		System.out.print("Enter Patient Name: ");
    		String name=reader.readLine();
    		System.out.print("Enter Patient Address: ");
    		String address=reader.readLine();
    		System.out.print("Enter Patient Contact No: ");
    		String contact=scan.next();
    		System.out.print("Enter Patient Disease: ");
    		String disease=reader.readLine();
    		
    		Patient d=new Patient(id,name,address,contact,disease);
    		ml.addPatient(d);
    		System.out.println("PATIENT ADDED !!! ");
    		submenu(2);
    		
    	}
    	else if(select==2) {
    		System.out.print("Enter Patient ID to remove: ");
    		int id=scan.nextInt();
    		
    		int index=-1;
    		
    		for(int i=0; i<ml.getPatientSize(); i++) {
    			if(ml.getPatient(i)==null) {
    				continue;
    			}
    			if(ml.getPatient(i).getId().equals(id)) {
    				index=i;
    			}
    			}
    		
    		if(index!=-1) {
    			ml.removePatient(index);
    			System.out.println("PATIENT DELETED !!!");
    		}
    		else {
    			System.out.println("PATIENT NOT FOUND!!!");
    		}
    		submenu(2);
	
    	}
    	else if(select==3) {
    		
    	System.out.println("+-+-+-+-+-+-+-");	
    	System.out.println("PATIENT LIST");
    	System.out.println("+-+-+-+-+-+-+-");	
	
    	for(int i=0; i<ml.getPatientSize(); i++) {
    			Patient d=ml.getPatient(i);
    			if(ml.getPatient(i)==null) {
    				continue;
    			}
    			System.out.println("\n"+ml.getPatient(i).toString());
             
    		}
    	
    		submenu(2);

    	}
    	
    	else if(select==4) {
    		System.out.print("Enter Patient ID to Search: ");
    		int id=scan.nextInt();
    		
    		int index=-1;
    		
    		for(int i=0; i<ml.getPatientSize(); i++) {
    			if(ml.getPatient(i)==null) {
    				continue;
    			}
    			if(ml.getPatient(i).getId().equals(id)) {
    				index=i;
    			}
    			}
    		
    		if(index!=-1) {
    			Patient d=ml.getPatient(index);
    			System.out.println(d.toString());

    		}
    		else {
    			System.out.println("PATIENT NOT FOUND!!!");
    		}
    	
    		submenu(2);

    	}
    	else {menu();}
		
		}
		
    


//APPOINTMENT SELECTION

	if(selection==3) {
	    System.out.println("\n+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("[1] BOOK APPOINTMENT: ");
    	System.out.println("[2] CANCEL APPOINTMENT: ");
    	System.out.println("[3] VIEW APPOINTMENTS: ");
    	System.out.println("[4] MAIN MENU");
	    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+\n");
	    System.out.print("choice>");
    	select=scan.nextInt();
    	if(select==1) {
    		System.out.println("CHOOSE DOCTOR: ");
    		for(int i=0; i<ml.getDoctorSize(); i++) {
    			if(ml.getDoctor(i)==null) {
    				continue;
    			}
    			System.out.println("["+i+"]: "+ml.getDoctor(i).getId()+":"+ml.getDoctor(i).getName());
    		}
    		
    		int dc=scan.nextInt();
    		
    		System.out.println("CHOOSE PATIENT: ");
    		for(int i=0; i<ml.getPatientSize(); i++) {
    			if(ml.getPatient(i)==null) {
    				continue;
    			}
    			System.out.println("["+i+"]: "+ml.getPatient(i).getId()+":"+ml.getPatient(i).getName());
    		}
    		
    		int pc=scan.nextInt();
    		
    		System.out.println("Enter Appointment Date: ");
    		String date=reader.readLine();
    		
    		System.out.println("Enter Appointment Time: ");
    		String time=reader.readLine();
    		
    		Appointment a=new Appointment();
    		a.setDoc(ml.getDoctor(dc));
    		a.setPatient(ml.getPatient(pc));
    		a.setDate(date);
    		a.setTime(time);
    		ml.addAppointment(a);
    		ml.getDoctor(dc).schedule=ml.getDoctor(dc).schedule+"\nAPPOINTMENT [DATE: "+date+", TIME: "+time+"]";
    		System.out.println("APPOINTMENT BOOKED !!!");
    		submenu(3);
    		
    	}
    	else if(select==2) {
    		System.out.println("Choose Appointment to cancel");
    		
    		for(int i=0; i<ml.getAppointmentSize(); i++) {
    			if(ml.getAppointment(i)==null) {
    				continue;
    			}
    			System.out.println("["+i+"] "+ml.getAppointment(i).getDate()+":"+ml.getAppointment(i).getTime());
    		}
    		
    		int as=scan.nextInt();
    		ml.removeAppointment(as);
    		System.out.println("APPOINTMENT CANCELLED!!!");
    		
    		submenu(3);
	
    	}
    	else if(select==3) {
    		
    
    		for(int i=0; i<ml.getAppointmentSize(); i++) {
    			if(ml.getAppointment(i)==null) {
    				continue;
    			}
    			Appointment a=ml.getAppointment(i);
    			System.out.println("Doctor "+a.getDoc().getName()+" Has been Appointed With Patient "+a.getPatient().getName()+" on "+a.getDate()+" At "+a.getTime());
    		}
    	
    		submenu(3);

    	}
    	
    	
    	else {menu();}
		
		}
		
    
	//TREATMENT
	if(selection==4) {
	    System.out.println("\n+-+-+-+-+-+-+-+-+-+-+");
		System.out.println("[1] ADD TREATMENT: ");
		System.out.println("[2] REMOVE TREATMENTS: ");
		System.out.println("[3] VIEW TREATMENTS: ");
    	System.out.println("[4] MAIN MENU");
	    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+\n");
	    System.out.print("choice>");
    	select=scan.nextInt();
    	if(select==1) {
    		
    		System.out.println("Select Appointment : ");
    		for(int i=0; i<ml.getAppointmentSize(); i++) {
    			if(ml.getAppointment(i)==null) {
    				continue;
    			}
    			System.out.println("["+i+"] "+ml.getAppointment(i).getDate()+":"+ml.getAppointment(i).getTime());
    		}
    		
    		int as=scan.nextInt();
    		System.out.println("How many medicines doctor suggested to patient? ");
    		int no=scan.nextInt();
    		Treatment t=new Treatment(ml.getAppointment(as), no);
    		for(int i=0; i<no; i++) {
    			System.out.println("SELECT MEDICINE NO "+(i+1));
    			for(int j=0; j<arrMed.length; j++) {
    			System.out.println("["+j+"]"+arrMed[j].toString());
    			}
    			int med=scan.nextInt();
    			t.addMedicine(arrMed[med]);
    		}
    		
  
    		System.out.println("Treatment added");
    		ml.addTreatment(t);
    		submenu(4);
    		
    	}
    	else if(select==2) {
    		System.out.println("Select Treatment to Delete : ");
    		for(int i=0; i<ml.getTreatmentSize(); i++) {
    			if(ml.getTreatment(i)==null) {
    				continue;
    			}
    			System.out.println("["+i+"] "+ml.getTreatment(i).getAppointmentHeld().getDate()+":"+ml.getTreatment(i).getAppointmentHeld().getTime()+": Medicines Offered: "+ml.getTreatmentSize());
    		}
    		int no=scan.nextInt();
    		ml.removeTreatment(no);
    		System.out.println("TREATMENT REMOVED");
    		
    		
    	}
    	else if(select==3) {
    		System.out.println("TREATMENTS LIST");
    		for(int i=0; i<ml.getTreatmentSize(); i++) {
    			if(ml.getTreatment(i)==null) {
    				continue;
    			}
    			System.out.println("\nDATE OF APPOINTMENT: "+ml.getTreatment(i).getAppointmentHeld().getDate()+"\nTIME OF APPOINTMENT: "+ml.getTreatment(i).getAppointmentHeld().getTime()+"\nMEDICINES OFFERED: "+ml.getTreatmentSize()+"\nTREATMENT DOCTOR ID: "+ml.getTreatment(i).getAppointmentHeld().getDoc().getId()+"\nTREATMENT PATIENT ID: "+ml.getTreatment(i).getAppointmentHeld().getPatient().getId()+"\n");
    		}
    	}
    	
    	else {
    		menu();
    		
    	}
    	}
	
}
	
}