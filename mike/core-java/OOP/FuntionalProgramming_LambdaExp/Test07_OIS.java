import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test07_OIS {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = 
				new ObjectInputStream( 
						new FileInputStream("student.ser"));
		
		Object obj = ois.readObject();
		Student st =(Student)obj;
		System.out.println(st);
		
		//Test case #1:
			//in Student class remove serialVersionUID variable
			//and run this class, O/P: InvalidClassException
			
		//Test Case #2: 	
			//in Student class remove serialVersionUID variable
			//run OOS class and then this class, O/P: no exception

		//Test Case #3: 	
			//in Student class add new field
			//run only this class, O/P: InvalidClassException

	}
}