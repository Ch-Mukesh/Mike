class B {
	    public static final String b = null;
           //static int a = 10;
	       static int a = 20;

	    static void m1() {
		    int a = 20;
	    }

	    static void m2() {
		    int a = 20;
	    }

	    static void m3() {
		    int a = 20;
		    //int a = 30;
	    }
        static void m8(int a) {
		//int a = 10;
	}
        
    }


class A{
	static int a = 10;
	int x = 20;

	void display(){
		System.out.println(a+" "+this);
		System.out.println(x);
		System.out.println(this);
	}

	static void hi(){
		//System.out.println(x);
	}
}

public class Test {
    public static void main(String[] args) {
		System.out.println(A.a);
		A a1 = new A();
		a1.display();

		// int String = 10;
		// System.out.println(String);

		// int main = 10;
		// System.out.println(main);


    }
}
