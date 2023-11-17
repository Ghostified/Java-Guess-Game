import java.util.Scanner;

public class Exception {
     public static void main (String [] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter two numbers: ");
        int num1;
        int num2;
         num1 = (int)userInput.nextDouble();
         num2 = (int)userInput.nextDouble();

        try{
            System.out.println(num1/num2);
        }
        catch (ArithmeticException e){
            //e.toString();
            //System.out.println( e.toString());
            System.out.print(e.getMessage());
        }

        finally{
            userInput.close();
        }

     }
}
