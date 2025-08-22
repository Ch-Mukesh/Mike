class MultipleExceptions {

	public static void main(String[] args) {

		System.out.println("main start");
		try{
			Example.m1(10);

			Example.m1(-10); //Once Exception is raised it will just go out of try
                            // Here IllegalArgumentException raised it catched and exited from try
                            //It will not call Example.m1(0);

			Example.m1(0);

		}catch(IllegalArgumentException e ){
			System.out.println("Error: "+ e.getMessage());

		}catch(ArithmeticException e ){
			System.out.println("Error: "+ e.getMessage());
		}
		System.out.println("main end");
	}
}

class Example {

	static void m1(int a) throws IllegalArgumentException, ArithmeticException {
		if(a<0) {
			throw new IllegalArgumentException("Do not pass -ve number"); 
		}

		if(a==0){
			throw new ArithmeticException("Do not pass zero");
		}

		System.out.println("logic goes here");

	}
}


// o/p
// main start
// logic goes here
// ERROR!
// Error: Do not pass -ve number
// main end