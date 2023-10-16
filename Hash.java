//Map is a key value pair
//Counts all the letters in a string
//store the letters in a map
//Print out the number of times a letter appears in a string

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.LinkedHashMap;
public class Hash {
    public static void main(String[]args){

        // System.out.println();

        // Map m = new LinkedHashMap();
        // m.put("Branson",5);
        // m.put("James", "y");
        // m.put("Allan", "Dev");
        // m.put("Java", "b");


        // m.containsValue("b");

        // System.out.println(m.values());

        Map m = new HashMap();
        String str = "My name is Branson Allan. I am learning Java";

        for(char x:str.toCharArray()) {
            if (m.containsKey(x)) {
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else {
                m.put(x,1);
            }
        }

        System.out.println(m);
    }
    
}
