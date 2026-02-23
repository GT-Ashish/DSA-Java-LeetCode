class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int majority = len / 2;
        int count = 1;
        for(int i = 0; i < len - 1; i++){
            if(nums[i] == nums[i + 1]){
                count++;
                if(count > majority){
                    return nums[i];
                }
            }
            else{
                count = 1;
            }
        }
        return nums[0];
    }
}