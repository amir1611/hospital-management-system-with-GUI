package hospitalsystem;


public interface HospitalManager {

	Patient[] patients=new Patient[100];
	Doctor[] doctors=new Doctor[100];
	Appointment[] appointments=new Appointment[100];
	Treatment[] treatments=new Treatment[100];
	
	public void addPatient(Patient p);
	public void addDoctor(Doctor d);
	public void addAppointment(Appointment a);
	public void addTreatment(Treatment a);

	
	public void removePatient(int i);
	public void removeDoctor(int i);
	public void removeAppointment(int i);
	public void removeTreatment(int i);

	
	public Patient getPatient(int index);
	public Doctor getDoctor(int index);
	public Appointment getAppointment(int index);
	public Treatment getTreatment(int index);
	
	
}
