// nested if's statements.

import java.util.Scanner;
public class Score {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 21 ){
            System.out.print("Whats your favorite hobby");
            String hobby = sc.nextLine();

            if( hobby.equals("code")){
                System.out.println("Me too ");
            }
            else{
                System.out.println("Not my hobby");
            }
        }
        else if (age >= 13){
            System.out.print("Do you like spider man? (Yes/No)");
            String hobby = sc.nextLine();
            if (hobby.equals("yes")){
                System.out.println("I like Spider Man Too!");
            }
                else{
                    System.out.println("You do not like spiderman");
                }
            }
            else{
                System.out.println("You are a child");
            }
        }
        }

