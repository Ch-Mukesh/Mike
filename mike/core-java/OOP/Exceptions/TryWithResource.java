//What is the output from the below program?
import java.io.PrintStream;
class TryWithResource{
	public static void main(String[] args){

		try( PrintStream ps = new PrintStream(System.out) ){
			ps.println("Hi");//only because there is implicit finally block with resource close stmt

		}
                            # finally{
                            #     ps.close(); //This will close PrintStream & System.out
                            # }
		System.out.println("after try-with-resource");
	}
}


// o/p: Hi

