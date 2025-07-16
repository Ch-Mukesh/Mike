// import java.util.Scanner;

// class Example {
// 			static int a ;
// 			static {
// 			   Scanner scn = new Scanner(System.in);	

// 			   System.out.print("Enter  value for a: ");
// 			   a = scn.nextInt();

// 			   System.out.println("from SB a: "+ a);
// 			}
// 			public static void main(String[] args) {
// 			   System.out.println("from MM a: "+ a);
// 			   m1();
// 			}
// 			public static void m1() {
// 			   System.out.println("from SM a: "+ a);	
// 			}
// 		}

// class Example {
//     static int a;
//     static {
//         System.out.println("SB");
//         int a = 50;
//         a = 60;
//         Example.a = 70;
//     }

//     public static void main(String[] args) {
//         System.out.println("main");
//         System.out.println(" a: " + a);
//     }
// }

// C E : For static inside a block or a method
// class Example {
// static {
// System.out.println("SB1");
// static {
// System.out.println("SB2");
// }
// }
// public static void main(String[] args) {
// System.out.println("main");
// }
// }



//Local Blocks
class Example {
    { // This is Instance Block
        System.out.println("Instance Initializer Block");
        {
            System.out.println("Local block");
        }//This is LoCal Block
    }

    Example() {
        System.out.println("No-arg constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Example e2 = new Example();
    }
}