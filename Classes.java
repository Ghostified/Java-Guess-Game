
import java.util.Scanner;
public class Classes {
    //public static void main(String[]args){}

    public String name;
    public int age;
    private String owner;
    public String breed;

    public  Classes(String name, int age, String owner, String breed) {
        
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.breed = breed;
        add2();
    

    }

    public Classes(String string) {
    }

    public Classes(String string, int i) {
    }

    public Classes(String string, int i, int j) {
    }

    public void speak() {
        System.out.println("Iam  " + this.name + " and Iam " + this.age + " years old. My owner is " + this.owner + " . I  am classified as a " + this.breed + " dog breed.");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age =age;
    }

    public int add2() {
        return this.age +2;
    }
}



