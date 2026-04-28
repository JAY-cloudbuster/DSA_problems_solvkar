package linear.search;

public class Main {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,56,7,89,12,13,24,56,-78};
        int target = 12;
        int answer = linear(nums, target);
        System.out.println(answer);
    }

    static int linear(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        else{
            for(int Index = 0; Index < arr.length; Index++){
                if(arr[Index] == target){
                    return Index;
                }
                else{
                    System.out.println("No Match has been found");
                }
            }
        }

        return 0;

    }

}

