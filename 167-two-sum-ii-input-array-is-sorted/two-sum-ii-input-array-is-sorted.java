class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] array = new int[2];
        int length = numbers.length;
        int end = length - 1;
        for(int i = 0; i < length; i++){
            int start = i;
            while(start <= end){
                int middle = start + (end - start) / 2;
                if(numbers[i] + numbers[middle] == target){
                    array[0] = i + 1;
                    if(i==middle){
                        middle+=1;
                    }
                    array[1] = middle + 1;
                    return array;
                }
                else if(numbers[i] + numbers[middle] < target){
                    start=middle+1;
                }
                else{
                    end=middle-1;
                }
            }
        }
       
        return array;
        
    }
}