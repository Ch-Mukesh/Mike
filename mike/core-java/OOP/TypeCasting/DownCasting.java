class A {

}

class B extends  A{

}

public class DownCasting {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();

       // B bdown = a2;  // CE: incompatible

        B bdown = (B) a2;

        //This is downcasting 
        //Converting subclass obj from superclass to its own type using cast operator

    }
}
