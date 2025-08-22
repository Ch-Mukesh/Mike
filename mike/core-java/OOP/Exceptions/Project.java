import java.util.Scanner;
class Addition {

	static int add(int a, int b) throws IllegalArgumentException {
		if(a<0 || b<0) {
			throw new IllegalArgumentException("Do not pass -ve numbers"); 
		}

		int c = a + b;
		return c;
	}
}

class Project {

	public static void main(String[] args) {
		
		System.out.println("main start");
		Scanner scn = new Scanner(System.in);
		while(true) {
			try{
				System.out.print("Enter FNO: ");
				int a = scn.nextInt();
				
				System.out.print("Enter SNO: ");
				int b = scn.nextInt();
				
				int c = Addition.add(a, b);
				System.out.println("Result: "+ c);
				break;
			}catch(IllegalArgumentException e ){
				System.out.println("Error: "+ e.getMessage());
			}
		}
		System.out.println("main end");
	}
}