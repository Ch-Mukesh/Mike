// File: TryCatchFinallyCases.java

class TryCatchFinallyCases {

    public static void main(String[] args) {
        // Uncomment methods one by one to see behavior
        m1();
        m2();
        m3();
        m4();
        m5();
        // m6(); // Uncommenting this will cause compilation error
        m7();
        m8();
    }

    // Case 1: Variable declared inside try block is not accessible outside
    static void m1() {
        try {
            int a = 10;
            System.out.println("m1 - a inside try: " + a);
        } catch (ArithmeticException e) {
            // System.out.println(a); // Error: a not accessible here
        }
        // System.out.println(a); // Error: a not accessible here
    }

    // Case 2: Variable declared outside but only initialized inside try block
    static void m2() {
        int a; // Declared but not initialized
        try {
            a = 10; // If no exception, a gets initialized
            System.out.println("m2 - a inside try: " + a);
        } catch (ArithmeticException e) {
            // System.out.println(a); // Might not be initialized if exception occurs before assignment
        }
        // System.out.println(a); // CE: variable a might not have been initialized
    }

    // Case 3: Variable declared outside and initialized in both try and catch
    static void m3() {
        int a; // Declared outside
        try {
            a = 10;
            System.out.println("m3 - a inside try: " + a);
        } catch (ArithmeticException e) {
            a = 20;
            System.out.println("m3 - a inside catch: " + a);
        }
        System.out.println("m3 - a after try/catch: " + a); // Safe: a initialized in all paths
    }

    // Case 4: Variable used in finally after try/catch
    static void m4() {
        int a;
        try {
            a = 10;
            System.out.println("m4 - a inside try: " + a);
        } catch (ArithmeticException e) {
            a = 20;
            System.out.println("m4 - a inside catch: " + a);
        } finally {
            // System.out.println("m4 - a inside finally: " + a); // Might cause CE if not initialized
        }
    }

    // Case 5: Variable initialized before try, safe to use anywhere
    static void m5() {
        int a = 0; // initialized with default
        try {
            a = 10;
            System.out.println("m5 - a inside try: " + a);
        } catch (ArithmeticException e) {
            System.out.println("m5 - a inside catch: " + a);
        } finally {
            System.out.println("m5 - a inside finally: " + a);
        }
        System.out.println("m5 - a after try/catch/finally: " + a);
    }

    // Case 6: Missing return in catch block causes Compilation Error
    /*
    static int m6() {
        try {
            return 10;
        } catch (ArithmeticException e) {
            // Missing return here => CE: missing return statement
        }
    }
    */

    // Case 7: Return from both try and catch => Compiles fine
    static int m7() {
        try {
            return 10;
        } catch (ArithmeticException e) {
            return 20;
        }
        // Any code here is unreachable due to return statements
    }

    // Case 8: Return using a variable set in try/catch
    static int m8() {
        int res = 0; // Default value
        try {
            res = 10;
        } catch (ArithmeticException e) {
            res = 20;
        }
        System.out.println("m8 - returning res: " + res);
        return res;
    }
}
