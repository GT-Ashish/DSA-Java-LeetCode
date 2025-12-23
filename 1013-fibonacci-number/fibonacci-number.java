class Solution {
    public int fib(int n) {
        if(n == 0 || n ==1 ){
            return n;
        }
       int first = 0;
       int second = 1;
       int sum=0;
       int temp;
       for(int i = 0; i < n - 1; i++) {
        sum=first+second;
        first=second;
        second=sum;
       }
       return sum;
    }
}