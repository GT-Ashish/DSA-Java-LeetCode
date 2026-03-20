class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int start = 0;
        int end = len - 1;
        while(start < end){
            if(nums[start] % 2 != 0){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
            }
            else{
                start++;
            }
        }
        return nums;
    }
}