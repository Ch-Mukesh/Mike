public class A {
    static int a = 10;
    static {
        System.out.println("In A sb");
        System.out.println("a in A sb:"+a);
        System.out.println("b in A sb:"+B.b);
    }

    public static void main(String[] args) {
        System.out.println("In A mm");
        System.out.println("a in A Main"+a);
        System.out.println("b in A Main:"+B.b);
    }
}
