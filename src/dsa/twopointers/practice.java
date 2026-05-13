package dsa.twopointers;
import java.util.*;

public class practice {
    public static void main(String[] args){
        int[] arr = new int[10];
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int target = 10;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                //answer found
               left--;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
//basically we will try to make sure that the target element is found by running
//the two pointer one from beginning and the other from the end and find the
//target element or any other function;

//or we can use a single loop only and create a new logic that we help us do the func
