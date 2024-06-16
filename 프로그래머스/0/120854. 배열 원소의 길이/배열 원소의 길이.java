import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] strlist) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < strlist.length; i++) {
            List<Integer> lengths = Arrays.stream(strlist[i].split("\\s+"))
                                          .map(String::length)
                                          .collect(Collectors.toList());
            answerList.addAll(lengths);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}