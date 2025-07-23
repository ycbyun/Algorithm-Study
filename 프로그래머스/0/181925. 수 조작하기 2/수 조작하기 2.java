class Solution {
    public String solution(int[] numLog) {
        StringBuilder q = new StringBuilder();
        for(int i = 1 ; i < numLog.length ; i++){
            if(numLog[i] - numLog[i-1] == 1){
                q.append('w');
            }
            else if(numLog[i] - numLog[i-1] == -1){
                q.append('s');
            }
            else if(numLog[i] - numLog[i-1] == 10){
                q.append('d');
            }
            else {
                q.append('a');
            }
            
        }
        return q.toString();
    }
}