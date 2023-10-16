public class Inheritance  extends Classes{

    private int food;
    public Inheritance(String name, int age, String owner, String breed, int food) {
        super(name, age, owner, breed);
        //TODO Auto-generated constructor stub
        this.food = food;
    }

    public Inheritance( String name, int Age){
        super(name ,age);
        this.food = 50;
    }
     public Inheritance(String name){
        super(name, 0);
        this.food =50;
     }
    public void speak(){
        System.out.println("Meeow my name is " + this.name + " and i get " + this.food);
    }

    public void eat(int x){
        this.food -= x;
    }
}
