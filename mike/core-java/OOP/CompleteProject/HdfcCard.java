public class HdfcCard implements AtmCard{
    private double balance;

    @Override
    public void deposit(double amt) throws NegativeNumberException{
        if(amt <=0 ) 
            throw new NegativeNumberException("Invalid Amnt");
        balance = balance+amt;
    }

    @Override
    public void withdraw(double amt) throws NegativeNumberException,InsufficientFundsException{
        if(amt <=0 ) 
            throw new NegativeNumberException("Invalid Amnt");
        else if(amt > balance)
            throw new InsufficientFundsException("Insufficient Funds");
        balance = balance-amt;
    }

    @Override
    public void checkBalance(){
        System.out.println("Your hdfcAcc Bank balance is : "+balance);
    }

}