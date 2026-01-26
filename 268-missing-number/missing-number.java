class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int length = nums.length;
        while(i < nums.length){
            if(nums[i] == i || nums[i] == length){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
            }
        }
        for(int j = 0; j < length; j++){
            if(nums[j] == length){
                return j;
            }
        }
        return length;
    }
}