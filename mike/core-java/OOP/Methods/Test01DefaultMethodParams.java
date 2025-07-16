public class Test01DefaultMethodParams {


    // void m1(int a=10,int b){

    // }

    static void m1(int a , int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void m1(){
        System.out.println("Default m1()");
        m1(100,200);
    }


    public static void main(String[] args) {
        System.out.println("Hello from main!!");
        m1();
    }
}
