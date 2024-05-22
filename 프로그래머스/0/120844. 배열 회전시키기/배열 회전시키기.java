class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length;
        int[] result = new int[n];
        
        if (direction.equals("left")) {
            for (int i = 0; i < n - 1; i++) {
                result[i] = numbers[i + 1];
            }
            result[n - 1] = numbers[0];
        } else if (direction.equals("right")) {
            for (int i = 1; i < n; i++) {
                result[i] = numbers[i - 1];
            }
            result[0] = numbers[n - 1];
        }
        
        return result;
    }
}