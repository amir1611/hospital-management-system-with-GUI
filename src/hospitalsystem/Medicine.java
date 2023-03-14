package hospitalsystem;

public class Medicine{
private  String medID;
private  String medName;
private  double medPrice;


public Medicine(String medID, String medName, double medPrice) {
	this.medID = medID;
	this.medName = medName;
	this.medPrice = medPrice;
}


public String getMedID() {
	return medID;
}


public void setMedID(String medID) {
	this.medID = medID;
}


public String getMedName() {
	return medName;
}


public void setMedName(String medName) {
	this.medName = medName;
}


public double getMedPrice() {
	return medPrice;
}


public void setMedPrice(double medPrice) {
	this.medPrice = medPrice;
}


@Override
public String toString() {
	return "Medicine [medID=" + medID + ", medName=" + medName + ", medPrice=" + medPrice + "]";
}
    
    


}
