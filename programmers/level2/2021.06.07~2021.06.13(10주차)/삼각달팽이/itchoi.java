import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n * (n + 1) / 2];
        int[][] tmpData = new int[n][n];
        int num = 1;
        int x = -1;
        int y = 0;
        for (int i = 0; i < n; i++) {
            int jLength = n - i;
            for (int j = 0; j < jLength; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }

                tmpData[x][y] = num++;
            }
        }

        int j = 0;
        for (int[] tmpDatum : tmpData) {
            for (int i : tmpDatum) {
                if (i == 0) break;
                answer[j++] = i;
            }
        }

        return answer;
    }
}