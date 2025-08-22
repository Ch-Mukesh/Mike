class ThrowsDemo {
	public static void main(String[] args) {
		System.out.println("main start");
		try{
				Example.m1(10);
			
				Example.m1(-10);
		}catch(IllegalArgumentException e) {
			System.out.println("Errorrr: "+ e.getMessage());	
		}
		System.out.println("main end");
	}
}


class Example {
	static void m1(int a) throws IllegalArgumentException {
		if(a<0) 
			throw new IllegalArgumentException("Donot pass -ve number") ;

		int b  = a + 20;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
	}
}

