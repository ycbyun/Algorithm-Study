class Solution {
    public int solution(int a, int d, boolean[] included) {
        int totalSum = 0;

        for(int idx = 0; idx < included.length; idx++){
            if(included[idx]) {
                int currentTerm = a + d * idx;
                totalSum += currentTerm;
            }
        }
        
        return totalSum;
    }
}