class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        //more effiecient approach no sorting needed complexity O(n); 
        ArrayList<Integer> list  = new ArrayList<>();
        int smaller = 0;
        int equal = 0;
        for(int element : nums){
            if(element == target){
                equal++;
            }
            else if(element < target){
                smaller++;
            }
        }
        for(int i = 0; i < equal; i++){
            list.add(smaller + i);
        }
        return list;
    }
}