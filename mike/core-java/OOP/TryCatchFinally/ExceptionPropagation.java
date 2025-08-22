
class Test17 {
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
		    System.out.print("Errorrrrrrrrrrrr: ");
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



// o/p:
// main start
// m1 start
// m2 start
// m3 start
// Errorrrrrrrrrrrr: java.lang.ArithmeticException: / by zero
// 	at Test17.m3(Main.java:28)
// 	at Test17.m2(Main.java:22)
// 	at Test17.m1(Main.java:12)
// 	at Test17.main(Main.java:5)
// 	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
// ERROR!
// 	at java.base/java.lang.reflect.Method.invoke(Method.java:580)
// 	at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:484)
// 	at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:208)
// ERROR!
// 	at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:135)
// m1 end
// main end