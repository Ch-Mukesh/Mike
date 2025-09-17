class Addition {
	void add(int a, int b) {
		System.out.println(a+b);
	}
}

class Subtraction {
	void sub(int a, int b) {
		System.out.println(a-b);
	}
}

class Multiplication {
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}

class Division {
	void div(int a, int b) {
		System.out.println(a/b);
	}
}

class Calc {
	void calculate(Addition a) {
		a.add(50, 60);
	}
	void calculate(Subtraction s) {
		s.sub(50, 60);
	}
	void calculate(Multiplication m) {
		m.mul(50, 60);
	}
	void calculate(Division d) {
		d.div(50, 60);
	}
}

public class Fp {
	public static void main(String[] args) {
		Calc calc = new Calc();
		
		Addition a1 = new Addition();
		a1.add(10, 20); calc.calculate(a1);

		Subtraction s1 = new Subtraction();
		s1.sub(10, 20); calc.calculate(s1);
		
		Multiplication m1 = new Multiplication();
		m1.mul(10, 20); calc.calculate(m1);
		
		Division d1 = new Division();
		d1.div(10, 20); calc.calculate(d1);
		System.out.println();
	
	//============ Functional Programming style ============================================	
	   //FI rv		//Lambda Expression for implementing FI method
		AO ao1 = (a, b) -> { System.out.println(a+b); };		//logic creation and storing
		AO ao2 = (a, b) -> { System.out.println(a-b); };
		AO ao3 = (a, b) -> { System.out.println(a*b); };
		AO ao4 = (a, b) -> { System.out.println(a/b); };
		
		ao1.ao(12, 13);		//calling and executing logic
		ao2.ao(12, 13);	
		ao3.ao(12, 13);	
		ao4.ao(12, 13);	
		System.out.println();
		
		Calculator cal = new Calculator();
		cal.calculate(ao1);
		cal.calculate(ao2);
		cal.calculate(ao3);		//passing logic as argument
		cal.calculate(ao4);
	/* */	
	}
}
class Calculator {
	void calculate(AO ao) {
		ao.ao(15, 16);
	}
}

@FunctionalInterface
interface AO {
	void ao(int a, int b);
}
