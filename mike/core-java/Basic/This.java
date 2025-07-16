
public class This {
    static int a;

    static void m1(int a) {
        a = a;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(a);
        m1(50);
        System.out.println(a);
    }
}
