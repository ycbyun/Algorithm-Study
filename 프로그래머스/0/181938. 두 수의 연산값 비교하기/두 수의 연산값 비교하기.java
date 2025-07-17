class Solution {
    public int solution(int a, int b) {
        
        String str_ab = "" + a + b;
        int int_ab = 2 * a * b;
        int sum_ab = Integer.parseInt(str_ab);
        
        if (sum_ab >= int_ab) {
            return sum_ab;
        } else {
            return int_ab;
        }
            
    }
}