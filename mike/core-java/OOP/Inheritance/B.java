public class B  extends A{
    static int b = 20;
    static {
        System.out.println("In B sb");
        System.out.println("a in B sb:"+a);
        System.out.println("b in B sb:"+b);
    }
    public static void main(String[] args) {
        System.out.println("In B Main");
        System.out.println("a in B Main:"+a);
        System.out.println("b in B Main:"+b);
    }
}
