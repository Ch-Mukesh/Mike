//Example.java(DWC)	
//class with NSV, no-param, param constrcutor and NSMs
class Example {
    int x = 10;

    Example() {
        System.out.println("From npc x: " + x);
    }

    Example(int p) {
        x = p;
        System.out.println("From pc  x: " + x);
    }

    void m1() {
        // x=90;
        System.out.println("From m1  x: " + x);
    }

    void m2() {
        System.out.println("From m2  x: " + x);
        m1();
        // System.out.println(x);
    }

    public static void main(String[] args) {
        Example e1 = new Example();
        e1.m2();
        System.out.println();

        Example e2 = new Example(5);
        e2.m2();
    }
}