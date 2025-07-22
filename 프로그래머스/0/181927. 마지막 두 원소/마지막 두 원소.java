class Solution {
    public int[] solution(int[] num_list) {
        int lastIndex = num_list.length - 1; 
        int lastElement = num_list[lastIndex]; 
        int secondLastElement = num_list[lastIndex - 1]; 

        int newValue; 

        if (lastElement > secondLastElement) {
            newValue = lastElement - secondLastElement;
        } else {
            newValue = lastElement * 2;
        }

        int[] resultArr = new int[num_list.length + 1];

        System.arraycopy(num_list, 0, resultArr, 0, num_list.length);

        resultArr[resultArr.length - 1] = newValue;

        return resultArr;
    }
}