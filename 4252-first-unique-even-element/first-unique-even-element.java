class Solution {
    public int firstUniqueEven(int[] nums) {
        int [] array = new int [101];
        for(int element : nums){
            array[element] += 1;
        }
        for(int element : nums){
            if(element % 2 == 0 && array[element] == 1){
                return element;
            }
        }
        return -1;
    }
}