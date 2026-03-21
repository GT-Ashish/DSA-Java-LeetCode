class Solution {
    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int [] squares = new int[len];
        int start = 0;
        int end = len - 1;
        for(int i = len - 1; i >= 0; i--){
            if(nums[start] * nums[start] > nums[end] * nums[end]){
                squares[i] = nums[start] * nums[start];
                start++;
            }
            else{
                squares[i] = nums[end] * nums[end];
                end--;
            }
        }
        return squares;
    }
}