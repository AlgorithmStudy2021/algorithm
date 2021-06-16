import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        int repeatCount = 0;
        int zeroCount = 0;
        
        while (!"1".equals(s)) {
            repeatCount++;
            String str = s.replaceAll("0", "");
            zeroCount += (s.length() - str.length());
            s = Integer.toBinaryString(str.length());
        }
        
        int[] answer = new int[2];
        answer[0] = repeatCount;
        answer[1] = zeroCount;
        
        return answer;
    }
}