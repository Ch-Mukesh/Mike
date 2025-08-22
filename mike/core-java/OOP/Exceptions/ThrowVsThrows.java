class ThrowVsThrows2 //throws ArithmeticException
{
    // throw new ArithmeticException(); ❌ (illegal directly inside class body)

    static  //throws ArithmeticException
    {
        // throw new ArithmeticException(); ❌ (illegal here unless handled)
    }

    {
        // throw new ArithmeticException(); ❌ (illegal unless handled)
    }

    static  
    {
         int a = 20;
         if(a == 10){ throw new ArithmeticException(); } // never executes
    }

    {
         if(true){ throw new ArithmeticException(); }  // always executes on object creation
         if(false){ throw new ArithmeticException(); } // never executes
    }

    static  
    {
         try{ throw new ArithmeticException(); }  // ✅ handled properly
         catch(ArithmeticException ae){ ae.printStackTrace(); }
    }

    {
         try{ throw new ArithmeticException(); }  // ✅ handled properly
         catch(ArithmeticException ae){ ae.printStackTrace(); }
    }

    Test25_ThrowThrowsRules() throws ArithmeticException{
        throw new ArithmeticException(); // ✅ constructor can declare checked/unchecked exception
    }

    void m1() throws ArithmeticException{
        throw new ArithmeticException(); // ✅ method declares exception
    }

    void m2() //throw ArithmeticException
    {
        // throws new ArithmeticException(); ❌ invalid syntax
    }

    void m3()  //throws String
    {
        // throw "abc"; ❌ only Throwable objects can be thrown
    }

    void m4(){
        throw new ArithmeticException();  // ✅ allowed, unchecked
        // System.out.println("Hi");  ❌ unreachable
    }	

    void m5(){
        if(true){
            throw new ArithmeticException();  // always throws
        }
        System.out.println("Hi");  // ❌ unreachable
    }

    void m6() throws ArithmeticException, 
                        IllegalArgumentException {
        throw  new ArithmeticException();  // ✅ only one thrown
        // , new IllegalArgumentException(); ❌ can’t throw multiple at once
    }

    void m7(int x) throws ArithmeticException, 
                            IllegalArgumentException{
        throw new IllegalArgumentException();  // ✅ only one thrown
        // throw new ArithmeticException(); ❌ unreachable after throw
    }

    void m8(int x) throws ArithmeticException, 
                            IllegalArgumentException{
        if(x < 0){
            throw new IllegalArgumentException(); 
        }

        if (x == 0){
            throw new ArithmeticException(); 
        }

        System.out.println(x +" is correct value"); // executes only when x > 0
    }

    public static void main(String[] args){ 
        new Test25_ThrowThrowsRules();
    }
}
