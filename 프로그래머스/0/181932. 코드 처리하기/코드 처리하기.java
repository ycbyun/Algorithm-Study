class Solution {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder(); 
        int mode = 0; 

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx); 

            if (mode == 0) {
                if (currentChar == '1') {
                    mode = 1; 
                } else {
                    
                    if (idx % 2 == 0) { 
                        ret.append(currentChar);
                    }
                }
            } else { 
                if (currentChar == '1') {
                    mode = 0; 
                } else {
                    
                    if (idx % 2 == 1) {
                        ret.append(currentChar);
                    }
                }
            }
        }

       
        if (ret.length() == 0) {
            return "EMPTY";
        } else {
            return ret.toString(); 
        }
    }
}