import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        Arrays.sort(scoville);
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (int n : scoville) {
            q.add(n);
        }
        
        while (q.size() > 1 && q.peek() < K) {
            int idx1 = q.poll();
            int idx2 = q.poll();

            int mixHot = idx1 + (idx2 * 2);
            q.add(mixHot);
            answer++;
        }
        
        if (q.size() <= 1 && q.peek() < K) {
            answer = -1;
        }
        
        return answer;
    }
}