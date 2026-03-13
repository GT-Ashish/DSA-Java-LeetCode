class Solution {
    public int pivotIndex(int[] nums) {
        //intuition find total sum of array use that to find prefix and postfix sum.
        int total_sum = 0;
        for(int element : nums){
            total_sum += element;
        } 
        int len = nums.length;
        int current_sum = 0;
        int post_sum = 0;
        for(int i = 0; i < len; i++){
            if(i != 0){
                current_sum += nums[i - 1];
            }
            post_sum = total_sum - current_sum - nums[i];
            if(post_sum == current_sum){
                return i;
            }

        }
        return -1;
    }
}