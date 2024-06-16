import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
       Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (seen.add(c)) { 
                result.append(c);
            }
        }

        return result.toString();
    }
}