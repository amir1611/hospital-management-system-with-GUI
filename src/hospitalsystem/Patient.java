package hospitalsystem;

import java.util.Scanner;

public class Patient extends Person{

	private String disease;
   
   public Patient (){
	   super();
	   this.disease="";
    }
    
    public Patient (String id, String name, String address, String mobile,String disease){
       super(id,name,address,mobile);
    	this.disease=disease;
    }

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	 
    public String toString() {
    	return "PATIENT ID: "+getId()+"\nPATIENT NAME: "+getName()+"\nPATIENT ADDRESS: "+getAddress()+"\nMOBILE: "+getMobile()+"\nDISEASE: "+getDisease();
    }
  
    
  
}
