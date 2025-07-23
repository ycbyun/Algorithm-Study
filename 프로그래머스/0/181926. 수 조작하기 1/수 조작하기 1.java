class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char command = control.charAt(i); 

            if (command == 'w') {
                n += 1; 
            } else if (command == 's') {
                n -= 1; 
            } else if (command == 'd') {
                n += 10; 
            } else if (command == 'a') {
                n -= 10; 
            }
        }

        return n;
    }
}