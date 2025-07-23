import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        List<Integer> resultList = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0]; 
            int e = query[1]; 
            int k = query[2]; 



            int minVal = Integer.MAX_VALUE; 
            boolean found = false;

            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    found = true; 
                    if (arr[i] < minVal) {
                        minVal = arr[i];
                    }
                }
            }

            if (found) { 
                resultList.add(minVal); 
            } else { 
                resultList.add(-1); 
            }
        }

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}