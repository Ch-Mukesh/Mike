class A{
    int x = 10;
    int y= 20;
    //This is overRidden
    // void m1(){
    //     System.out.println("X from A :"+x);
    // }
}

class B extends A {
    int x = 50;
    int y= 500;

    // void m1(){
    //     System.out.println("X from B :"+x);
    //     System.out.println("X from B super :"+super.x);
    // }
}


public class Test{
    public static void main(String[] args) {
        B b1 = new B();
        A a1 = b1;
        A a3 = new B();
        
        // b1.m1();
        // a1.m1(); // Will also call B's m1() because method m1() is overridden

        System.out.println("b1.x :"+b1.x);
        System.out.println("a1.x :"+a1.x);

        System.out.println("b1.y :"+b1.y);
        System.out.println("a1.y :"+a1.y);

        System.out.println("a3.x :"+a3.x);
        System.out.println("a3.y :"+a3.y);

        b1.x = 1000;
        a3.x = 2000;
        b1.y = 3000;
        a3.y = 4000;
        a1.x = 5000;
        a1.y = 6000;
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("After b1.x :"+b1.x);
        System.out.println("After a1.x :"+a1.x);

        System.out.println("After b1.y :"+b1.y);
        System.out.println("After a1.y :"+a1.y);

        System.out.println("After a3.x :"+a3.x);
        System.out.println("After a3.y :"+a3.y);

    }
}