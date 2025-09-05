
import java.util.Scanner;

/*
 * Develop a program to read username and password from end-user
 * verify whether they are hari and NiT#1
 * 
 * if yes, print welcome to NiT
 * else, print invalid username or password
 * 
 */
public class Equals {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("username: ");
			String usn = scn.next();
			
			System.out.print("password: ");
			String pwd = scn.next();
			
			if(usn.equalsIgnoreCase("hari") && pwd.equals("NiT#1")) {
				System.out.println("Welocome to NiT");
				break;
			}else {
				System.out.println("Invalid username or password\n");
			}
		}
	} 
}