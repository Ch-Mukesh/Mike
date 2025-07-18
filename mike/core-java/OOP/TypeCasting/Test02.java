class A{

}

class B extends A{

}

class C extends B{

}

class Test02{
    public static void main(String[] args){
      
        A a1 = new A();
        A a2 = new B();

        B b1 = (B) a2;
       // C c1 = (C) a2; // No CE 
        // RException - java.lang.ClassCastException:

       // D d1 = (D) a1; //CE : Cant find symbol
       
    }
} 
    
