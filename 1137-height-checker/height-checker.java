class Solution {
    public int heightChecker(int[] heights) {
      int [] array = heights.clone();
      Arrays.sort(array); 
      int count = 0;
      int len = heights.length;
      for(int i = 0; i < len; i++){
        if(heights[i] != array[i]){
            count++;
        }
      }  
      return count;
    }
}