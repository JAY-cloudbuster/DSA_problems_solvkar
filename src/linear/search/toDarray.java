package linear.search;
/*static literally mean that the JVM starts the program before any object
and that does include in the object-oriented programing
 */
public class toDarray {
    public static void main(String[] args){
        int[][] array = {{11,2},{2,4}};
        int target = 11; // best case of the algorithm
    }
    static int searchtoD(int[][] array, int target) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i == j){
                    System.out.println("the element is the diagonal element in the matrix");
                }
            }
        }
        return 0;
    }
}
