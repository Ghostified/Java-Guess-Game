public class EnumsMain {

    public static void main(String[]args){

        EnumsLevel lvl = EnumsLevel.LOW;

        //String en =lvl.toString();

       // EnumsLevel[] arr = EnumsLevel.values();

    //     for (EnumsLevel e : arr) {
    //         System.out.println(e);
    //     }

    //     System.out.println(EnumsLevel.values());

    //     if (lvl == EnumsLevel.LOW) {
    //         System.out.println(lvl);

    //     }else if (lvl == EnumsLevel.MEDIUM){
    //         System.out.println(lvl);

    //     }else {
    //         System.out.println(lvl);

    // }

    //System.out.println(EnumsLevel.valueOf("LOW"));

    lvl.setlvl(5);
    System.out.println(lvl.getlvl());
    }
    
}
