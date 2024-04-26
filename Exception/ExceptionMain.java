package Exception.ExceptionPackage;
import Exception.ExceptionPackage.NegativeException;
import Exception.ExceptionPackage.InputMismatchException;
import java.util.*;
// import java.util.InputMismatchException;

import Exception.ExceptionPackage.NegativeException;
public class ExceptionMain {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try{    
            System.out.print("Enter an integer : ");
            Integer input = 0;
            try{
                input = sc.nextInt();
                throw new InputMismatchException();
            }
            catch(InputMismatchException e){
                System.out.println("a. "+e.toString());
            }
            if(input<0){
                throw new NegativeException();
            }
            System.out.println("Integer is: "+input);
        }
        catch(NegativeException e){
            System.out.println("b. "+e.toString());
        }
        catch(Exception e){
            System.out.println("c. "+e.toString());
        }
    }
}
