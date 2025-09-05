
import java.util.Scanner;

public class IsBlank {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter username: ");
			String username = scn.nextLine();
			
			if(username.isBlank()) {
				System.out.println("Username can not be empty or blank\n");
				
			}else {
				System.out.println("Hello "+ username);
				System.out.println("Welcome to NiT");
				break;
			}
			
		}//while end
	}
}
