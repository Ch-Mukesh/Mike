
public class VariableShadowing {

    static int x = 10;

    void m1() {
    int x = 50;
    System.out.println(x);
    System.out.println(this.x);
    System.out.println(VariableShadowing.x);
    x = 60;
    this.x = 70;
    System.out.println(x);
    System.out.println(this.x);
    }

    public static void main(String[] args) {
    VariableShadowing e1 = new VariableShadowing();
    e1.m1();
    }

    
}