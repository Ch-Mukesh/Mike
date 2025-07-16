
public class Sample extends Example {
    static int b = m3();
    static{
        System.out.println("Sample Static Block");
    }

    int y = m4();
    {
        System.out.println("Sample Non Static Block");
    }

    Sample(){
        System.out.println("Sample Constructor");
    }

    static int m3(){
        System.out.println("Sample Static variable is created");
        return 30;
    }

    int m4(){
        System.out.println("Sample non Static variable created");
        return 40;
    }

    void abc(){
        System.out.println("Sample Abc Method Non Static");
    }

    public static void main(String[] args) {
        System.out.println("Sample Main");
        Sample s = new Sample();
        s.abc();
        s.bbc();
    }
}
