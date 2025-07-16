
public class Example {
    static int a = m1();
    static{
        System.out.println("Example Static Block");
    }

    int x = m2();
    {
        System.out.println("Example Non Static Block");
    }

    Example(){
        System.out.println("Example Constructor");
    }

    static int m1(){
        System.out.println("Example Static variable is created");
        return 10;
    }

    int m2(){
        System.out.println("Example non Static variable created");
        return 20;
    }

    void abc(){
        System.out.println("Example Abc Method Non Static");
    }

    void bbc(){
        System.out.println("Example BBc");
    }
}
