
// File: FinallyWithReturn.java

class FinallyWithReturn {

    public static void main(String[] args) {
        // Uncomment to test both methods
        // System.out.println(m1());  // Test m1 with return value in finally
        m2();  // Test m2 with return in finally in a void method
    }

    // Method m1 with return statement in finally block
    static int m1() {
        System.out.println("Before try");
        
        try {
            System.out.println("In try");
            // Uncomment to test different behaviors:
            // return 10;         // Return from try
            // return 10 / 0;     // ArithmeticException, return from catch
            Integer.parseInt("a");  // This throws NumberFormatException

        } catch (ArithmeticException e) {
            System.out.println("In catch");
            return 20;  // Return from catch (won't be used due to finally)

        } finally {
            // Return in finally will override all other returns
            System.out.println("In finally");
            return 30;  // Final return value from finally will be returned
        }

        // Unreachable code due to return in finally
        // System.out.println("After try/catch/finally");  // CE: unreachable statement
    }

    // Method m2 with return in finally block in a void method
    static void m2() {
        try {
            System.out.println("In try");
            System.out.println(10 / 0);  // ArithmeticException will occur

        } finally {
            // This will suppress the exception and control will be transferred to this point
            System.out.println("In finally");
            return;  // Return here will suppress the uncaught exception and control is transferred out
        }

        // Unreachable code due to return in finally
        // System.out.println("After try/catch/finally"); // CE: unreachable statement
    }
}
