class A{
    static void m1(){
        System.out.println("Static Method from A class M1");
    }

    void m2(){
        System.out.println("Non static method from A class M2");
    }
}

class B extends A{
    static void m1(){
        System.out.println("Static Method from B class M1");
    }

    void m2(){
        System.out.println("Non static method from B class M2");
    }

}
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        A ab = new B();

        
        b1.m1(); //Static Method from B class M1

        a1.m1(); //Static Method from A class M1
         

        b1.m2(); //Non static method from B class M2
        
        a1.m2(); //Non static method from A class M2
        

        ab.m1(); //Static Method from A class M1
        
        ab.m2(); //Non static method from B class M2
       

    }
}