class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] population = new int[100];
        int length  = logs.length;
        for(int t = 0; t < 100; t++){
            for(int i = 0; i < length; i++){
                if(logs[i][0] <= (t + 1950) && logs[i][1] > (t + 1950)){
                    population[t] += 1;
                }
            }
        }
        int max = 0;
        int year = 1950;
        int min = 0;
        for(int i = 0; i < 100; i++){
            if(population[i] > max){
                max = population[i];
                min = year;
            }
            year++;
        }
        return min;
    }
}