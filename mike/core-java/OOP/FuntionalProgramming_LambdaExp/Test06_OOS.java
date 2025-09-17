import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test06_OOS {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		//creating student object 
		Student s1 = new Student();
		System.out.println(s1);
		
		//initializing student object
		s1.setSno(101);
		s1.setSname("HK");
		s1.setCourse("FSJD");
		s1.setFee(20000);
		s1.setUsn("hari");
		s1.setPwd("balayya");
		
		System.out.println(s1);
		
		//creating OOS object connecting 'object.ser' file
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
		
		//writing s1 object state to the file (performing serialization)
		oos.writeObject(s1);  //object -> byte[] -> saving in the file
		
		System.out.println("student object data is saved");
		
		oos.close();
	}
}

