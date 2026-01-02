class Solution {
    public int repeatedNTimes(int[] nums) {
        int length = nums.length;
        int n = length / 2;
        int max = Integer.MIN_VALUE;
        for(int a : nums){
            max = Math.max(max,a);
        }
        System.out.print(max);
        int[] count = new int[Math.max(max + 1,length)];
        for (int i = 0; i < length; i++) {
            count[nums[i]] += 1;
            if (count[nums[i]] == n) {
                return nums[i];
            }
        }
    return -1;
    }
}