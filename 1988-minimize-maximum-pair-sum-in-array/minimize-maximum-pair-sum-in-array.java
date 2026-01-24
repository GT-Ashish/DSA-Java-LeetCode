class Solution {
    public int minPairSum(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = length - 1;
        int maxsum = 0;
        while (left < right) {
            maxsum = Math.max(maxsum, nums[left] + nums[right]);
            left++;
            right--;
        }
        return maxsum;
    }
}