import java.util.*;
class Solution {

  public int solution(String[][] clothes) {
    int answer = 1;

    Map<String, Integer> clothesTypeMap = new HashMap<>();

    for (int i = 0; i < clothes.length; i++) {
      clothesTypeMap.put(clothes[i][1], clothesTypeMap.getOrDefault(clothes[i][1], 0) + 1);
    }

    for (String key : clothesTypeMap.keySet()) {
      // 해당 옷 종류를 입지 않았을 경우의 수 +1 을 해준다.
      answer *= (clothesTypeMap.get(key) + 1);
    }

    // 아무것도 위장하지 않은 경우의 수 1을 빼준다.
    return answer - 1;
  }
}
