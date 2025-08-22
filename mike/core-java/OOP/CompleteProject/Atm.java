import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.reflect.InvocationTargetException;

public class Atm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            System.out.println("Hello, Welcome to ATM");

            System.out.print("Enter your Bank Name (first letter capital): ");
            String bName = scn.next();
            String card = bName + "Card";

            // Dynamically load the corresponding bank card class
            Class cs = Class.forName(card);
            AtmCard atm = (AtmCard) cs.newInstance();
            //AtmCard atm = (AtmCard) cs.getDeclaredConstructor().newInstance();

            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                System.out.print("Enter Your Choice: ");
                
                int option = scn.nextInt();
                scn.nextLine(); // consume newline

                switch (option) {
                    case 1:
                        while (true) {
                            try {
                                System.out.print("Enter amount to deposit: ");
                                double amnt = scn.nextDouble();
                                scn.nextLine();
                                atm.deposit(amnt);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Enter numbers only.");
                                scn.nextLine(); // clear buffer
                            } catch (NegativeNumberException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        break;

                    case 2:
                        while (true) {
                            try {
                                System.out.print("Enter amount to withdraw: ");
                                double amnt = scn.nextDouble();
                                scn.nextLine();
                                atm.withdraw(amnt);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Enter numbers only.");
                                scn.nextLine(); // clear buffer
                            } catch (NegativeNumberException | InsufficientFundsException e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        break;

                    case 3:
                        atm.checkBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for using the ATM. \nGoodbye,Vist Again :-))!");
                        scn.close();
                        return;

                    default:
                        System.out.println("Error: Enter a valid option (1-4).");
                }
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Bank card class not found: " + e.getMessage());
            System.out.println();
            System.out.println("Enter exact bank name with firstLetter As Capitall!!");
        } catch (IllegalAccessException e) {
            System.out.println("Access issue: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Instantiation failed: " + e.getMessage());
        // } catch (NoSuchMethodException e) {
        //     System.out.println("No suitable constructor found: " + e.getMessage());
        // } catch (InvocationTargetException e) {
        //     System.out.println("Error while invoking constructor: " + e.getCause().getMessage());
        // } finally {
            scn.close();
        }
    }
}
