package Exception.ExceptionPackage;

public class InputMismatchException extends Exception{
    String ERROR = "PLEASE ENTER INTEGER NUMBER";
    
    @Override
    public String toString() {
        return ERROR;
    };
}
