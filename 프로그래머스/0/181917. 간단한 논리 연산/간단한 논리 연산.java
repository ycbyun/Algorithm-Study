class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
   
        boolean part1 = x1 || x2; 
        
        boolean part2 = x3 || x4;
        
        boolean answer = part1 && part2;
        
        return answer;
    }
}