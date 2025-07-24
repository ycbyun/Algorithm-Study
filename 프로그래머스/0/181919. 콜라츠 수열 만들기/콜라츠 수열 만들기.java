import java.util.ArrayList; 
import java.util.List;      

class Solution {
    public int[] solution(int n) {

        List<Integer> collatzSequence = new ArrayList<>();
        
        collatzSequence.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2; 
            } 

            else {
                n = (int)(3 * n + 1); 
            }
            
            collatzSequence.add(n);
        }
 
        int[] answer = new int[collatzSequence.size()];
        for (int i = 0; i < collatzSequence.size(); i++) {
            answer[i] = collatzSequence.get(i);
        }
        
        return answer; 
    }
}