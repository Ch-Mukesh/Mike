public class NegativeNumberException extends Exception{
    NegativeNumberException(){
        super();
    }

    NegativeNumberException(String errMsg){
        super(errMsg);
    }
}