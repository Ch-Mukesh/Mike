class Example {
    int x = 10;

    void m1(int p){
        p = 20;
        System.out.println("Inside m1 p: " + p);
    }

    void m2(Example e) {
        e.x = 20;
        System.out.println("Inside m2 e.x: " + e.x);
    }

    void m3(Example e) {
        e = new Example();
        System.out.println("Inside m3 e.x: " + e.x);
    }

    void m4(Example e) {
        e = new Example();
        System.out.println("Inside m4 e.x: " + e.x);
        e.x = 40;
        System.out.println("Inside m4 e.x: " + e.x);
    }

    void m5(Example e) {
        e.x = 50;
        System.out.println("Inside m5 e.x: " + e.x);
        e = new Example();
        e.x = 60;
        System.out.println("Inside m5 e.x: " + e.x);
    }
}



public class Test_LocalPreferenceAlgo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        System.out.println("---------------------------------"); 
        Example example = new Example();
        int p = 10;
        System.out.println("Before m1 p: " + p);
        example.m1(p);
        System.out.println("After m1 p: " + p);

        System.out.println("---------------------------------");

        Example e = new Example();  
        System.out.println("Before m2 e.x: " + e.x);
        example.m2(e);
        System.out.println("After m2 e.x: " + e.x); 

        System.out.println("---------------------------------");

        System.out.println("Before m3 e.x: " + e.x);
        example.m3(e);
        System.out.println("After m3 e.x: " + e.x);

        System.out.println("---------------------------------");

        System.out.println("Before m4 e.x: " + e.x);
        example.m4(e);
        System.out.println("After m4 e.x: " + e.x);

        System.out.println("---------------------------------");

        System.out.println("Before m5 e.x: " + e.x);
        example.m5(e);
        System.out.println("After m5 e.x: " + e.x);
    }
}
