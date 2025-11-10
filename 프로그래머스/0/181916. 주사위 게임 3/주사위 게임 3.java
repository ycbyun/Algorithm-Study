import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        
        Arrays.sort(dice); 

        int d1 = dice[0]; 
        int d2 = dice[1];
        int d3 = dice[2];
        int d4 = dice[3]; 
        
        int score = 0;

        if (d1 == d4) { 
            score = 1111 * d1; 
        }

        else if (d1 == d3 || d2 == d4) {
            int p, q;
            if (d1 == d3) { 
                p = d1; 
                q = d4; 
                
            } else { 
                p = d2; 
                q = d1; 
            }
            score = (int) Math.pow(10 * p + q, 2); 
        }
        
        else if (d1 == d2 && d3 == d4) {
            score = (d1 + d3) * Math.abs(d1 - d3); 
        }
        
        else if (d1 == d2 || d2 == d3 || d3 == d4) {
            int r1, r2; 
            
            if (d1 == d2) { 
                r1 = d3;
                r2 = d4;
            } else if (d2 == d3) { 
                r1 = d1;
                r2 = d4;
            } else { 
                r1 = d1;
                r2 = d2;
            }
            score = r1 * r2; 
        }
        
        else {
            score = d1; 
        }

        return score; 
    }
}