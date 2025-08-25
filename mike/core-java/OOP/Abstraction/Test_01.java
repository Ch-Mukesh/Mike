//Test01.java
class Test_01 {
	public static void main(String[] args) {
		
// 		Example e1 = new Example();    //This will leads to compile time error
// 		e1.m1();
		
		Sample s1 = new Sample();		//TightCoupling code
		s1.m1();						//CompiletimePolymorphism code
		
		
		Example e1 = new Sample();		//LooseCoupling code
		e1.m1();						//RuntimePolymorphism code
	}
}
//Example.java
abstract class Example {
	abstract void m1();
}

//Sample.java
//class Sample extends Example {}

class Sample extends Example {
	
	void m1(){
		System.out.println("Sample m1");	
	}
	
}

