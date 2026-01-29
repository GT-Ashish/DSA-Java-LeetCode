class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int i = 0;
        while(i < length){
            if(nums[i] - 1 != i){
                if(nums[i] != nums[nums[i] - 1]){
                    int temp = nums[i];
                    nums[i] = nums[nums[i] - 1];
                    nums[temp - 1] = temp;
                }
                else{
                    i++;
                }
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < length; j++){
            if(nums[j] - 1 != j){
                return nums[j];
            }
        }
        return 0;
    }
}