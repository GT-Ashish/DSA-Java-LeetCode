class Solution {
    public int missingNumber(int[] nums) {
       int length = nums.length;
       int sum = length * (length + 1) / 2;
       for(int element : nums){
        sum -= element;
       }
       return sum;
    }
}