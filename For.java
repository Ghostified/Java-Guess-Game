import java.util.Scanner;
public class For {
    
    public static void main(String[] args) {

        int[] arr = {3,6,7,8,9,9,33,56};
        String[] names = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < names.length; i++){
            System.out.print("Input: ");
            String input = sc.nextLine();
            names[i] = input;
            //break;
        }

        for (String n:names) {
            System.out.println(n);
            if (n.equals("allan")){
                break;
            }
        }

    }
}
