class Solution {
    public int countElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int count=0;
        for(int a:nums){
            if(a<min){
                min=a;
            }
            else if(a>max){
                max=a;
            }

        }
        for(int a:nums){
            if(a==min || a==max){
                count++;
            }
        }
        return nums.length-count;
        
    }
}