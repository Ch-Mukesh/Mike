class A{

}

class B extends A{

}

class Test{
    public static void main(String[] args){
        A a1 = new A();
       // B b1  = new A();
        B b2 = new B();
        A a2 = new B();

       // String s = (String) a1;
    }
}