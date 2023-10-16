public class OuterClass {

    // public class InnerClass {
    //     public void display () {
    //         System.out.println("This is an Inner class");
    //     }
    // }

    public void inner(){
        class InnerClass{
            public void display () {
                System.out.println("Inner Class");
            }
        }
        InnerClass in = new InnerClass();
        in.display(); 
    }
    
}
