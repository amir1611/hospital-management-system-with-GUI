package hospitalsystem;
import java.util.Random;

public class PersonIDFactory {

	public String getPersonID(String type) {
		if(type.equals("Doctor")) {
			Random r =new Random();
			char[] ids= {'X','S','A','J','Z'};
			int val1=r.nextInt(20);
			int val2=r.nextInt(10);
			int val3=r.nextInt(100);

			char c1=ids[r.nextInt(4)];
			char c2=ids[r.nextInt(4)];
			
			return c1+""+val1+""+val2+c2+val3;
		}
		else
		{
			Random r =new Random();
			int val1=r.nextInt(20);
			int val2=r.nextInt(10);
			int val3=r.nextInt(100);

		
			
			return  val1+""+val2+""+val3;
			
		}
		
		
	}
	
	
}
