


class ManuallyThrowing {
	public static void main(String[] args) {
		//System.out.println(10/0);

	//throwing an exception without error message
		//ArithmeticException e = new ArithmeticException(); 
		//throw e;

	//throwing an exception with error message
		//ArithmeticException e = new ArithmeticException("/ by zero"); 
		//throw e;

	//throwing an exception directly without using a variable
		//throw new ArithmeticException("/ by zero");
		
		m1();
	}

	static void m1(){
		throw new ArithmeticException("/ by zero");
	}
}
