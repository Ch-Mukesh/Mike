
import java.util.Scanner;

/**
 * redevelop above program to accept email 
 * only if we have . after @
 */
public class Test04_indexOf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter email: ");
			String email = scn.next();
			scn.nextLine();
			//retrieving @ character index
			int atIndex = email.indexOf("@");
			
			//Checking whether @ available and checking wheter . available after @ index
			if( (atIndex != -1) && (email.indexOf(".", atIndex) !=-1) ) {
                                    //indexOf(char,startIndex)
				System.out.println("Validation link sent to given email");
				break;
			}else {
				System.out.println("Error: it is not an email");
			}
		}
	}

}