class Solution {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        if(left + 1 < length && nums[left + 1] > nums[left]){
            return left + 1;
        }
        return left;
    }
}