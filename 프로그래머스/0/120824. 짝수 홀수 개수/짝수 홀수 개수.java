class Solution {
     public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        
        for (int i=0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                answer[0] = even += 1;
            } else {
                answer[1] = odd += 1;
            }
        }      
        
        return answer;
    }
}