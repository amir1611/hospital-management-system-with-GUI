package hospitalsystem;

public class HospitalSentosaManager implements HospitalManager {

	private String HospitalName,address,contact;
	private int patientSize=0,doctorSize=0,appointmentSize=0,treatmentSize=0;
	
	public HospitalSentosaManager(String hname,String address,String contact) {
		this.HospitalName=hname;
		this.address=address;
		this.contact=contact;
	}
	
	
	
	
	public String getHospitalName() {
		return HospitalName;
	}




	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getContact() {
		return contact;
	}




	public void setContact(String contact) {
		this.contact = contact;
	}




	public int getPatientSize() {
		return patientSize;
	}




	public void setPatientSize(int patientSize) {
		this.patientSize = patientSize;
	}




	public int getDoctorSize() {
		return doctorSize;
	}




	public void setDoctorSize(int doctorSize) {
		this.doctorSize = doctorSize;
	}




	public int getAppointmentSize() {
		return appointmentSize;
	}




	public void setAppointmentSize(int appointmentSize) {
		this.appointmentSize = appointmentSize;
	}




	@Override
	public void addPatient(Patient p) {
		this.patients[patientSize]=p;
		this.patientSize++;
		
	}

	@Override
	public void addDoctor(Doctor d) {
		this.doctors[doctorSize]=d;
		this.doctorSize++;
		
		
	}

	@Override
	public void addAppointment(Appointment a) {
		
		this.appointments[appointmentSize]=a;
		this.appointmentSize++;
		
	}

	@Override
	public void removePatient(int i) {
		this.patients[i]=null;
		this.patientSize--;
		
	}

	@Override
	public void removeDoctor(int i) {
		this.doctors[i]=null;
		this.doctorSize--;
		
	}

	@Override
	public void removeAppointment(int i) {
		this.appointments[i]=null;
		this.appointmentSize--;
		
	}

	@Override
	public Patient getPatient(int index) {
		return this.patients[index];
		
	}

	@Override
	public Doctor getDoctor(int index) {
		return this.doctors[index];
		
	}

	@Override
	public Appointment getAppointment(int index) {
		return this.appointments[index];
		
	}




	@Override
	public void addTreatment(Treatment a) {
		this.treatments[treatmentSize]=a;
		treatmentSize++;
		
	}




	@Override
	public void removeTreatment(int i) {
		this.treatments[i]=null;
		treatmentSize--;
		
	}




	@Override
	public Treatment getTreatment(int index) {
		return this.treatments[index];
	}




	public int getTreatmentSize() {
		return treatmentSize;
	}




	public void setTreatmentSize(int treatmentSize) {
		this.treatmentSize = treatmentSize;
	}

	
	
}
