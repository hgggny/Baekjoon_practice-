class Solution {
      public int solution(int order) {
        String orderStr = Integer.toString(order);
        int clapCount = 0;
        clapCount = (int) orderStr.chars()
                                  .filter(c -> c == '3' || c == '6' || c == '9')
                                  .count();
        
        return clapCount;
    }
}