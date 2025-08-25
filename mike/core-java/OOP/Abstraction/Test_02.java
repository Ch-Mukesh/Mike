class Test_02  {
	public static void main(String[] args) {
			Example e1;					//LC

			//e1 = new Example();
			//e1 = new Sample();

			e1 = new Xyz();				//sub type object
			e1.m1();	//RP
			e1.m2();
			System.out.println();

			e1 = new Pqr();				//another sub type object
			e1.m1();	//RP			//in the same ref var (LC)
			e1.m2();
/**/
	}
}
abstract class Example {
	abstract void m1();
	abstract void m2();
}

abstract class Sample extends Example {
    void m1(){ System.out.println("m1 is executed from Sample for  "+ this + " object");}
}

class Xyz extends Sample {
	void m2() {	System.out.println("m2 is executed from Xyz");}
}

class Pqr extends Sample{
	void m2(){ System.out.println("m2 is executed from Pqr");}
}

