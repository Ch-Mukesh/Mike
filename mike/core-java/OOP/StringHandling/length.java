
import java.util.Scanner;

public class Length {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("Enter mobile number: ");
			String mobile = scn.next();
			
			try {
				long mobileNumber = Long.parseLong(mobile);
				
				if(mobile.length() == 10) {
					System.out.println("OTP sent to your mobile");
					break;	
				} else {
					System.out.println("Mobile number must have 10 digits");
				}
			}catch(NumberFormatException e) {
				System.out.println("Mobile number must have only digits");
			}
			System.out.println();
		}
	}
}
