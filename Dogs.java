
import java.util.ArrayList;
public class Dogs {
    public static void main(String[]args){
        Classes Dog = new Classes("Scooby", 45, "Branson", "Terrier");
        Dog.speak();
         Classes Dog2 = new Classes("Doo", 50, "Allan", "Bull dog");
        Dog2.speak();
        Dog.speak();


        int x = Dog.getAge();
        System.out.println(x);

        Dog.setAge(57);
        Dog.speak();

        Dog.add2();
        Dog.speak();

    }
}
