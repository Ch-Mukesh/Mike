class ThrowVsThrows2 {
    
    static {
        System.out.println("Static block 1: Checking condition");
        int a = 20;
        if(a == 10){ throw new ArithmeticException("Static block failed"); }
    }

    {
        System.out.println("Instance block 1: About to throw");
        try{
            throw new ArithmeticException("From instance block");
        }catch(ArithmeticException e){
            System.out.println("Caught inside instance block: " + e);
        }
    }

    static {
        System.out.println("Static block 2: Handling exception");
        try{ throw new ArithmeticException("Static exception handled"); }
        catch(ArithmeticException ae){ 
            System.out.println("Caught inside static block: " + ae); 
        }
    }

    Test25_ThrowThrowsRules() throws ArithmeticException {
        System.out.println("Constructor running, will throw now...");
        throw new ArithmeticException("From constructor");
    }

    void m8(int x) throws ArithmeticException, IllegalArgumentException{
        if(x < 0){
            throw new IllegalArgumentException("Negative not allowed");
        }
        if (x == 0){
            throw new ArithmeticException("Zero not allowed");
        }
        System.out.println(x +" is correct value");
    }

    public static void main(String[] args){ 
        System.out.println("Main started");
        try{
            new Test25_ThrowThrowsRules();
        }catch(Exception e){
            System.out.println("Caught in main: " + e);
        }

        Test25_ThrowThrowsRules obj = null;
        try {
            obj = new Test25_ThrowThrowsRules();
        } catch (Exception e) {
            System.out.println("Object creation failed again: " + e);
        }

        if(obj != null){
            try{
                obj.m8(-5);
                obj.m8(0);
                obj.m8(10);
            }catch(Exception e){
                System.out.println("Exception from m8: " + e);
            }
        }
    }
}


// o/p:
// Static block 1: Checking condition
// Static block 2: Handling exception
// Caught inside static block: java.lang.ArithmeticException: Static exception handled
// Main started
// Instance block 1: About to throw
// Caught inside instance block: java.lang.ArithmeticException: From instance block
// Constructor running, will throw now...
// Caught in main: java.lang.ArithmeticException: From constructor
// Instance block 1: About to throw
// Caught inside instance block: java.lang.ArithmeticException: From instance block
// Constructor running, will throw now...
// Object creation failed again: java.lang.ArithmeticException: From constructor

// === Code Execution Successful ===