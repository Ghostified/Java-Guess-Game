
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class Sets {

    public static void main(String[]args) {

        Set<Integer> t = new TreeSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(8);
        t.add(-5);
        t.add(3);
        t.size();

        int x = t.size();

        System.out.println(x);
    }
    
}
