class Parent{
    static int psVar = initPsVar();
    int piVar = intiPiVar();

    static{
        System.out.println("Parent Static Block");
    }

    {
        System.out.println("Parent instance blcok");
    }

    Parent(){
        System.out.println("Parent Constructor");
    }

    static int initPsVar(){
        System.out.println("Parent stativ VAr init");
        return 10;
    }

    int intiPiVar(){
        System.out.println("Parent instance variable init");
        return 20;
    }
}

class Child extends Parent{
    static int csVar = initCsVar();
    int ciVar = initCiVar();

    static{
        System.out.println("Child Static block");
    }

    {
        System.out.println("Child instance block");
    }

    Child(){
        System.out.println("Child Constructor");
    }

    static int initCsVar(){
        System.out.println("Child Static variable init");
        return 30;
    }

    static int initCiVar(){
        System.out.println("Child instance Varriable init");
        return 40;
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("Main Starts");
        Child c = new Child();
        System.out.println("Main Ends");
    }
}
