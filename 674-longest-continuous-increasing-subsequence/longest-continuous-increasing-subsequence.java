class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int current = 1;
        int max = 0;
        for(int i = 0; i < len - 1; i++){
            if(nums[i] < nums[i + 1]){
                current++;
            }
            else{
                max = Math.max(current, max);
                current = 1;
            }
        }
        max = Math.max(current, max);
        return max;
    }
}