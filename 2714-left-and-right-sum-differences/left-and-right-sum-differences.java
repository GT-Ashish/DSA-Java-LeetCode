class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return new int[] { 0 };
        }
        int[] psum = new int[len];
        psum[0] = nums[0];
        int[] answer = new int[len];
        for (int i = 1; i < len; i++) {
            psum[i] = psum[i - 1] + nums[i];
        }
        answer[0] = psum[len - 1] - psum[0];
        answer[len - 1] = psum[len - 2];
        for (int i = 1; i < len - 1; i++) {
            int leftsum = psum[i - 1];
            int rightsum = psum[len - 1] - psum[i];
            answer[i] = Math.abs(leftsum - rightsum);
        }
        return answer;
    }
}