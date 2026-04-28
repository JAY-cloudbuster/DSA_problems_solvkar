package binary.search;

public class Main {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        System.out.println(search(array,target));
    }
    static int search(int[] array, int target){
        if(array.length == 0){
            return -1;
        }
        else{
            System.out.println(target);
        }
        return 0;
    }
}
