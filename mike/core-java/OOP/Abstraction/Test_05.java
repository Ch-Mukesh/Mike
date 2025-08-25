

abstract class Example {					//>javac Example.java
	abstract void m1();						//>java Example
	static int a = m2();
	static int m2(){
		System.out.println("Ex class SV");
		return 50;
	}
	static{
		System.out.println("Ex class SB");
	}
	static void m3(){
		System.out.println("Ex class SM");
	}
	public static void main(String[] args){
		System.out.println("Ex class MM");
		System.out.println(a);
		m3();
		//Example e1 = new Example(); // This will leads to CE:Example is abstract; cannot be instantiated
	}

	int x = m4();
	int m4(){
		System.out.println("Ex class NSV");
		return 70;
	}

	{
		System.out.println("Ex class NSB");
	}

	Example() {
		System.out.println("Ex class NPC");
	}

	void m5(){
		System.out.println("Ex class NSM");
	}
}

class Sample extends Example {
	@Override
	void m1(){
		System.out.println("m1 is executed from Sample");
	}
	
	static int b = m6();
	static int m6(){
		System.out.println("Sa class SV");
		return 60;
	}
	static{
		System.out.println("Sa class SB");
	}
	static void m7(){
		System.out.println("Sa class SM");
	}
	public static void main(String[] args){
		System.out.println("Sa class MM");
		System.out.println("Ex a: "+ a);
		System.out.println("Sa b: "+ b);
		m3();
		m7();
		
		Sample s1 = new Sample();
		System.out.println("Ex x: "+ s1.x);
		System.out.println("Sa y: "+ s1.y);
		s1.m5();
		s1.m9();
	}

	int y = m8();
	int m8(){
		System.out.println("Sa class NSV");
		return 80;
	}

	{
		System.out.println("Sa class NSB");
	}

	Sample() {
		System.out.println("Sa class NPC");
	}

	void m9(){
		System.out.println("Sa class NSM");
	}
}

class Test_05 {										//>javac Test05.java
	public static void main(String[] args){			//>java Test05
		Example e1 = new Sample();
		e1.m1();
		e1.m3();
		e1.m5();
	}
};







//if i run Example.java
// o/p:
// Ex class SV
// Ex class SB
// Ex class MM
// 50
// Ex class SM

//if i run Test05.java
// o/p:
// Ex class SV
// Ex class SB
// Sa class SV
// Sa class SB
// Ex class NSV
// Ex class NSB
// Ex class NPC
// Sa class NSV
// Sa class NSB
// Sa class NPC
// m1 is executed from Sample
// Ex class SM
// Ex class NSM