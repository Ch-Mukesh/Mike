public interface AtmCard{
    public void deposit(double amt) throws NegativeNumberException;
    public void withdraw(double amt) throws NegativeNumberException,InsufficientFundsException;
    public void checkBalance();
}