
import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {

        int[] x = {4,1,8,4,5,7,45,78,980,67,4746,5683,76,78};

        Arrays.sort(x, 1,3);

        for (int i:x){
            System.out.print(i + ",");
        }
        
    }
    
}
