import java.util.ArrayList;
public class StaticMain {
    
    public static void main(String[]args){

        Static tim = new Static("tim", 9);
        Static bob = new Static("bob", 15);

        Static.count = 7;
        System.out.println(tim.count);



    }

}
