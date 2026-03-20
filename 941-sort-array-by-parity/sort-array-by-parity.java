class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int [] array = new int[len];
        int start = 0;
        int end = len - 1;
        for(int element : nums){
            if(element % 2 == 0){
                array[start] = element;
                start++;
            }
            else{
                array[end] = element;
                end--;
            }
        }
        return array;
    }
}