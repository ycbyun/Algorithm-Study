class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus_1 = 1;
        int plus_2 = 0;
        for(int i = 0; i < num_list.length; i++){
            plus_1 *= num_list[i];
            plus_2 += num_list[i];
        }
        if(plus_1 < (plus_2 * plus_2)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}