class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int length = nums.length;
        for(int i = 0; i < length; i++){
            right += nums[i];
            left = Math.max(left, nums[i]);
        }
        while(left < right){
            int mid = left + (right - left) / 2;
            int count = 1;
            int sum = 0;
            for(int i = 0; i < length; i++){
                if(sum + nums[i] > mid){
                    sum = nums[i];
                    count++;
                }
                else{
                    sum += nums[i];
                }
            }
            if(count > k){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
}