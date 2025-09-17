
import java.net.SocketPermission;

interface I1{
    void add(int a,int b);
}

interface I2{
    void print(String s);
}

class Test{
    public static void main(String[] args) {
        // I1 i = (int a,int b) -> {
        //     System.out.println(a+b);
        // };

        // I1 i = (int a,int b) -> System.out.println(a+b);

        I2 p = x -> System.out.println(x);
        p.print("Hello");
    }

}