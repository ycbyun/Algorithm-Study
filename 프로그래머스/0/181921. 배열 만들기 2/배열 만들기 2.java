import java.util.ArrayList; 
import java.util.List;      
import java.util.Collections; 

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> foundNumbers = new ArrayList<>();

        
        for (int i = l; i <= r; i++) {
            
            if (isComposedOfZeroAndFive(i)) {
                foundNumbers.add(i); 
            }
        }

       
        if (foundNumbers.isEmpty()) {
            return new int[]{-1}; 
        } else {
            
            int[] answer = new int[foundNumbers.size()];
            for (int i = 0; i < foundNumbers.size(); i++) {
                answer[i] = foundNumbers.get(i);
            }
            return answer;
        }
    }

    
    private boolean isComposedOfZeroAndFive(int num) {
       
        if (num == 0) { 
            return true;
        }

        
        while (num > 0) {
            int digit = num % 10; 
            
           
            if (digit != 0 && digit != 5) {
                return false; 
            }
            num /= 10; 
        }
        return true; 
    }
}