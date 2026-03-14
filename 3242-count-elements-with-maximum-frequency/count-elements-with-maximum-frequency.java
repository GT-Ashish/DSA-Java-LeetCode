class Solution {
    public int maxFrequencyElements(int[] nums) {
       int [] array = new int[101];
       for(int element : nums){
        array[element] += 1;
       }
       int max  = 0; 
       for(int element : array){
        max = Math.max(max, element);
       }
       int count = 0;
       for(int element : array){
        if(element == max){
            count++;
        }
       }
       return count * max;
    }
}