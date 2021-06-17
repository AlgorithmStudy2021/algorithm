class Solution {
    int solution(int[][] land) {
        
        int answer = Integer.MIN_VALUE;
        // 1. n개의 행 존재.
        int n = land.length;
        // 2. dp배열 선언.
        int[][] dp = new int[n][land[0].length];        
        // 3. land의 0번째 행은 그대로 dp의 0번째 행에 저장.
        for(int i = 0 ; i < land[0].length;i++)
            dp[0][i] = land[0][i];        
        // 4. 1번째 행부터 반복.
        for(int i = 1;i<n;i++){
            for(int j =0;j<land[i].length;j++){
                int max = Integer.MIN_VALUE;
                // 5. i의 이전 행을 탐색.
                for(int k=0;k<4;k++){
                    // 6. 현재 열(j)과 이전 열(k)이 같다면 고려하지 않는다.
                    if(j == k) continue;
                    // 7. 하나의 열을 제외한 나머지 열에서 최댓값을 찾아 저장.
                    max = Math.max(max,dp[i-1][k]);
                }
                // 8. 해당 최댓값과 현재 땅의 값을 더해 dp에 저장.
                dp[i][j] = land[i][j] + max;
            }
        }
        
        // 9. n-1번째 행에 저장된 최댓값들 중 가장 큰 값을 answer에 저장.
        for(int i=0;i<4;i++)
            answer = Math.max(answer,dp[n-1][i]);
        
        
        return answer;
    }
}
