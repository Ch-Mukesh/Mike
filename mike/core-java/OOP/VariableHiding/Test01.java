class A10 {
    int x = 10;
    int y = 20;

    void m1() {
        System.out.println(x + " From A10 M1..." + y);
    }
}

class B10 extends A10 {
    int x = 30;
    int y = 40;

    void m2() {
        System.out.println(x + " From B10 M2..." + y);
        System.out.println(super.x + " From B10 M2..." + super.y);
    }

    void m3() {
        x = 50;
        y = 60;
        super.x = 70;
        super.y = 80;
    }
}


public class Test01 {
    public static void main(String[] args) {
        B10 b1 = new B10(); A10 a1 = b1;
        B10 b2 = new B10(); A10 a2 = b2;

        b1.m3();

        System.out.println(b1.x + " From Main..." + b1.y);
        System.out.println(a1.x + " From main..." + a1.y);

        System.out.println(b2.x + "From main..." + b2.y);
        System.out.println(a2.x + "From main..." + a2.y);
        System.out.println("b1.m1() before"); 

        b1.m1(); 
                System.out.println("b2.m1() before"); 

        b2.m1();

        b1.m2(); 
         b2.m2();
    }
}


