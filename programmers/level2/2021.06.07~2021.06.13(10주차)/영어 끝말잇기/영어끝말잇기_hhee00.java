import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        List<String> list = new ArrayList<>();
        int count = 1;
        int term = 0;
        int person = 0;
        String lastSpelling = words[0].substring(0, 1);
        
        for (String str : words) {
            if (str.substring(0, 1).equals(lastSpelling)) {
                if (!list.contains(str)) {
                    list.add(str);
                } else {
                    person = (count % n == 0) ? n : (count % n);
                    term = (count % n == 0) ? (count / n) : ((count / n) + 1);
                    break;
                }
            } else {
                person = (count % n == 0) ? n : (count % n);
                term = (count % n == 0) ? (count / n) : ((count / n) + 1);
                break;
            }
            lastSpelling = str.substring(str.length()-1, str.length());
            count++;
        }
        
        answer[0] = person;
        answer[1] = term;

        return answer;
    }
}