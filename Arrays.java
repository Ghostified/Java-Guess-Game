import java.lang.annotation.IncompleteAnnotationException;
import  java.util.Scanner;

public class Arrays {

    public static void main(String[]args) {
        String [] newArr = new String[5];
       // {"allan", "Branson", "Hello", "Arrays" , "Java"}

        newArr[0] = "hello";
        newArr[1] = "Coding";
        newArr[2] = "This";
        newArr[3] = "is";
        newArr[4] = "Awesome";


        int[] nums = {2, 3, 4, 5, 6, 7};
        //int a = nums [4];
        String y = newArr[2];
        String b = newArr[4];
        System.out.println(b);
        System.out.println(y);

// Replacing the value of the array in index 


        int z = 38;

         nums[4] = z;

        System.out.println(z);

        //Printing out the length of an array

        int length = nums.length;

        System.out.println("The length of the integer arrays is " + length);

        int  size = newArr.length;

        System.out.println("The length of the String array is " + size);


        //Loop through an integer array

        // for (int i = 0; i <  nums.length; i++) {
        //     System.out.println("The elements in the integer array are " + i);
        // }

        //Loop through an array of strings 
        // Expected output is element in array
        
        for (int f = 0; f < newArr.length; f++) {
            System.out.println(newArr[f]);
        }



    }
}
