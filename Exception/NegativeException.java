package Exception.ExceptionPackage;

public class NegativeException extends Exception{
    String ERROR = "PLEASE ENTER POSITIVE NUMBER";

    @Override
    public String toString() {
        return ERROR;
    };
}
