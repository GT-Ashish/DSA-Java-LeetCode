class Solution {
    public int majorityElement(int[] nums) {
        //moores voting algo (majority element maintains lead in any case if occurence > n / 2)
        int candidate = nums[0];
        int count = 0;
        for (int element : nums) {
            if (element == candidate) {
                count++;
            }
            else {
                count--;
                if (count == 0) {
                    candidate = element;
                    count = 1;
                }
            }
        }
        return candidate;
    }
}