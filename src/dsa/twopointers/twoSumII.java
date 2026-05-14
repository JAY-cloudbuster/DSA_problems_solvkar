package dsa.twopointers;

public class twoSumII {
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        int left = 0;
        int right  = numbers.length-1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                System.out.println("yep yep");
                break;
            }
            else if(sum > target){
                right--;
            }
            if(sum < target){
                left++;
            }
        }
        System.out.println("Nope Nope");
    }
}
