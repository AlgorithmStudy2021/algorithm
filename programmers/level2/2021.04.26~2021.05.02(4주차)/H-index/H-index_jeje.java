import java.util.Arrays;
class Solution {
  public int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);

    int h;
    for (int i = 0; i < citations.length; i++) {
      h = citations.length - i;

      // h번 이상 인용된 논문의 수
      if (citations[i] >= h) {
        answer = h;
        break;
      }
    }

    return answer;
  }
}
