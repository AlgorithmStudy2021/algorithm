import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int idxF = 0;
        for (int idxL = people.length - 1; idxF <= idxL; idxL--) {
            answer ++;
            int sum = people[idxF] + people[idxL];
            if (sum <= limit) {
                idxF ++;
            }
        }
        
        return answer;
    }
}