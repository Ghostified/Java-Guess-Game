
import java.util.Scanner;
import java.util.ArrayList;
public class Lists {
    public static void main(String[]args){

         ArrayList<Integer> t = new ArrayList<Integer>();

         t.add(1);
         t.add(7);
         t.add(6);
         t.add(9);
         t.add(10);
         t.get(0);
         t.set(1,5);
         t.size();
         t.subList(1, 4);

         System.out.println(t.subList(1,4));
    }

    
}
