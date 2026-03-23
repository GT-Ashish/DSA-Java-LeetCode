class Solution {
    public int maxSubArray(int[] nums) {
        int sum = -100000;
        int max = -100000;
        for(int element : nums){
            sum = Math.max(sum + element, element);
            max = Math.max(sum, max);
        }
        return max;
    }
}