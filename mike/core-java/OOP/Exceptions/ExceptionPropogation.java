class ExceptionPropogation {
	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}

	static void m1() {
		System.out.println("m1 start");
		try{
			m2();
		}catch(ArithmeticException e){
		    System.out.print("Errorrr : ");
			e.printStackTrace();	
		}
		System.out.println("m1 end");
	}

	static void m2() {
		System.out.println("m2 start");
		m3();
		System.out.println("m2 end");
	}

	static void m3() {
		System.out.println("m3 start");
		System.out.println(10/0);
		System.out.println("m3 end");
	}
}