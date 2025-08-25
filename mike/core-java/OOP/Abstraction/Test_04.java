

class Test_04 {
	public static void main(String[] args) {
		Example e1 ;
		//e1 = new Example();
	    //e1.m1();
		
		e1 = new Sample();
		e1.m1();
		System.out.println(e1.a + " "+e1.x);
		
		
        //System.out.println(Example.a + " "+Example.x);  //CE: non-static variable x cannot be referenced from a static context
        //System.out.println(Sample.a + " "+Sample.x);    //These are abstract class members
                                                        // In interface those are by default public static final

	}
}

abstract class Example {
	static int a = 10;
	int x = 20;

	void m1(){
		System.out.println("m1 is executed from class Example for the object "+ this);
	}
}

class Sample extends Example{

}