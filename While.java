import java.util.Scanner;
public class While {

    public static  void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        //While Loops: Not sure how many times we are iterating through
        //System.out.print("Enter a number....");
         //int x = sc.nextInt();



        // int count = 0;

        // while (x != 10) {
        //     System.out.println("Type 10...");
        //     System.out.print("Type a number:  ");
        //     x = sc.nextInt();
        //     count++;

        // }
        // System.out.println("You tried "  +count + " Times");

        int x;
        int count = 0;
        do {
            System.out.print("Enter a number: ");
            x = sc.nextInt();
            count++;
        }
            while (x != 10);

            System.out.print("You tried " + count + " times"); 
    }
    
    
}
