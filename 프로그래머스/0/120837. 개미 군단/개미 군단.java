class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a = 5;
        int b = 3;
        int c = 1;

        return hp / a + (hp % a) / b + ((hp % a) % b);
    }
}