class Solution {
    public int solution(int a, int b) {

        String str_ab = "" + a + b; 
        
        String str_ba = "" + b + a;
        
        int num_ab = Integer.parseInt(str_ab);
        int num_ba = Integer.parseInt(str_ba);
        
        int answer = Math.max(num_ab, num_ba);
        
        return answer;
    }
}