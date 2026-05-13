package dsa.twopointers;

public class SquaresOfASortedArray {
    public int[] sortedSquares() {

        int[] nums = new int[5];
        nums = [-4,-1,0,3,10];

        int[] finalArr = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--) {

            if(Math.abs(nums[left]) > Math.abs(nums[right])) {

                finalArr[i] = nums[left] * nums[left];
                left++;

            }
            else {

                finalArr[i] = nums[right] * nums[right];
                right--;

            }
        }

        return finalArr;
    }
}
