class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] arr = {-1,-1};
        int [] array = new int[101];
        for(int element : nums){
            array[element] += 1;
        }
        for(int i = 0; i < 101; i++){
            if(array[i] > 1){
                if(arr[0] == -1){
                    arr[0] = i;
                }
                else{
                    arr[1] = i;
                }
            }
        }
        return arr;
    }
}