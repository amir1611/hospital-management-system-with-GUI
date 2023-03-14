package hospitalsystem;

public class Doctor extends Person{
    
    String schedule;
    
    public Doctor (String id, String name, String address, String mobile,String schedule){
        super(id,name,address,mobile);
        this.schedule = schedule;
    }
    
     public Doctor(){
    	 super();
    	 this.schedule="";
    }
     
 
     
    public String getschedule() {
        return schedule;
    }

    public void setschedule(String schedule) {
        this.schedule = schedule;
    }
    
    
    public String toString() {
    	return "DOCTOR ID: "+getId()+"\nDOCTOR NAME: "+getName()+"\nDOCTOR ADDRESS: "+getAddress()+"\nMOBILE: "+getMobile()+"\nSCHEDULE: "+getschedule();
    }
}

