public class multiDimensionArray {
    public static void main( String args[]){
          //int  myArray [][];
        
    int myArray[][] = new int [2][3];
        myArray [0][0] = 13;
        myArray [0][1] = 23;
        myArray [0][2] = 33;
        myArray [1][0] = 10;
        myArray [1][1] = 20;
        myArray [1][2] = 30;

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
            System.out.print(myArray[i][j]+ " ");
            }
        }
        System.out.println();
    }
}
    
