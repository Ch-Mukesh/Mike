
import java.util.Scanner;

/**
 * redevelop above program by using Character class methods
 * 
 */
public class CharAtPassword {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter password: ");
		String password = scn.nextLine();
		
		boolean upperCaseLetterFound 	= false;
		boolean digitFound 				= false;
		boolean specialCharacterFound 	= false;
		
		int len = password.length();
		if(len<8 || len>32) {
			System.out.println("Error: Password length must be >=8 and <=32");
			return;
		}
		
		for(int i=0; i<len; i++) {
			char ch = password.charAt(i);
			
			if(Character.isWhitespace(ch)) {
				System.out.println("Error: Password can not have space");
				return; //terminates method execution
				
			}else if(Character.isUpperCase(ch)) {
				upperCaseLetterFound = true;
				
			}else if(Character.isDigit(ch)) {
				digitFound = true;
				
			}else if(!Character.isLetterOrDigit(ch)) {	//if !UC, !digit, !LC, 
				specialCharacterFound = true;	//it is special character

			}
		}
		
		if(!(upperCaseLetterFound && digitFound && specialCharacterFound)) {
			System.out.println("Error: Password must contain one Uppercase letter, digit and special character");
		}else {
			System.out.println("Valid password");
		}
	}
}