class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length-1;
        int count=0;
        int track=0;
        int initial=nums[0];
        int finale=nums[length];
        for(int i = initial; i <= finale; i++){
            if(binarysearch(nums, i, 0, length)){
                nums[track]=i;
                track++;
                count++;
            }

        }
        return count;
    }
        public boolean binarysearch(int []array, int number, int start, int end){
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(array[mid] == number){
                    return true;
                }
                else if(array[mid] < number){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
                
            }
            return false;
            
        }
        
    
}