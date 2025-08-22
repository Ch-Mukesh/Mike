// File: InnerFinallyDemo.java

class InnerFinallyDemo {

    public static void main(String[] args) {

        System.out.println("Before outer try");

        try {
            System.out.println("In outer try");

            try {
                System.out.println("In inner try");

                // This will throw ArithmeticException
                System.out.println(10 / 0);
        //}catch(ArithmeticException e) {
            } catch (NumberFormatException e) {
                // This block won't be executed because the exception is ArithmeticException
                System.out.println("In inner catch");
            } finally {
                // This will always execute, even if there is a return or exception
                System.out.println("In inner finally");

                // Control will return from here, but outer finally still runs
                return;
            }

            // This line is unreachable due to return in finally above
            // System.out.println("After inner try,catch,finally");
        } catch (ArithmeticException e) {
    //}catch(NumberFormatException e) {
            // Will NOT execute because exception was not caught and return happened before
            System.out.println("In outer catch");
        } finally {
            // Outer finally WILL still execute even after return in inner finally
            System.out.println("In outer finally");
        }

        // This line is unreachable due to return in inner finally
        // System.out.println("After outer try,catch,finally");
    }
}
