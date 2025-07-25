
 class A8 {

    static int a = 10;
    int x = 20;
}

class B8 extends A8 {

    static int a = 30;
    int x = 40;
}

// class Test02 {

//     public static void main(String[] args) {
//         B8 b1 = new B8();
//         A8 a1 = new B8();

//         System.out.println(b1.a + "..." + b1.x);     // 30...40
//         System.out.println(a1.a + "..." + a1.x);     // 10...20
//         System.out.println(B8.a + "..." + A8.a);     // 30...10
//         System.out.println();

//         b1.a = 5;
//         a1.a = 6;

//         System.out.println(b1.a + "..." + b1.x);     // 5...40
//         System.out.println(a1.a + "..." + a1.x);     // 6...20
//         System.out.println(B8.a + "..." + A8.a);     // 5...6


//         B8 bNew = new B8();
//         A8 aNew = bNew;

//         System.out.println("bNew a:"+bNew.a); //a is  5 
//         System.out.println("aNew a:"+aNew.a); //a is 6

//     }
// }


public class Test02 {

    public static void main(String[] args) {
         B8 bNew = new B8();
         A8 aNew = bNew;

         System.out.println("bNew a:"+bNew.a); //a is 30 
         System.out.println("aNew a:"+aNew.a); //a is 10
    }
}


