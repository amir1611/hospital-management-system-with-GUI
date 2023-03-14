package hospitalsystem;

import java.util.Arrays;

public class Treatment {

	private Appointment appointmentHeld;
	private Medicine[] medicineSuggested;
	private int size=0;
	
	public Treatment(Appointment appointmentHeld,int capacity) {
		super();
		this.appointmentHeld = appointmentHeld;
		this.medicineSuggested = new Medicine[capacity];
	}

	public void addMedicine(Medicine m) {
		medicineSuggested[size]=m;
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public Appointment getAppointmentHeld() {
		return appointmentHeld;
	}

	public void setAppointmentHeld(Appointment appointmentHeld) {
		this.appointmentHeld = appointmentHeld;
	}

	public Medicine[] getMedicineSuggested() {
		return medicineSuggested;
	}

	public void setMedicineSuggested(Medicine[] medicineSuggested) {
		this.medicineSuggested = medicineSuggested;
	}

	@Override
	public String toString() {
		return "Treatment [appointmentHeld=" + appointmentHeld + ", medicineSuggested="
				+ Arrays.toString(medicineSuggested) + "]";
	}
	
	
	
	
}
