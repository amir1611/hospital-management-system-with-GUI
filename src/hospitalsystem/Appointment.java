package hospitalsystem;

public class Appointment {
private Doctor doc;
private Patient patient;
private String date;
private String time;
	

public Appointment() {
	this.doc=null;
	this.patient=null;
	this.date=null;
	this.time=null;
}

public Appointment(Doctor doc,Patient patient,String d,String t) {
	this.doc=doc;
	this.patient=patient;
	this.date=d;
	this.time=t;
}

public Doctor getDoc() {
	return doc;
}

public void setDoc(Doctor doc) {
	this.doc = doc;
}

public Patient getPatient() {
	return patient;
}

public void setPatient(Patient patient) {
	this.patient = patient;
}

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

@Override
public String toString() {
	return "Appointment [doc=" + doc + ", patient=" + patient + ", date=" + date + ", time=" + time + "]";
}	



}
