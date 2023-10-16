public class Static {
    
    protected static int count = 0;
    protected String name;
    protected int age;

    public Static(String name, int age){
        this.name = name;
        this.age = age;
        Static.count += 1;
        this.display2();
    }

    public void display2(){
        System.out.println("I am a dog ");
    }
    public static void display(){
        System.out.println("I am a dog ");
        }
}
