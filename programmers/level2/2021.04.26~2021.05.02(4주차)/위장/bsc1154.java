import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) { //아무것도 안입은상태도 갯수로 들어감
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);
        }
//getOrDefault 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드(1)
        for (int i : hm.values()) {
            answer *= i;
        }
        //옷을 하나도 입지 않은 상태를 빼준다.
        return answer-1;
    }
}
//안경, 선글라스, nothing 3가지이다. 상의는 티셔츠, nothing 2가지이다. 이렇게 가짓 수를 모두 곱하면 정답을 구할 수 있다.

//단, 주의해야 할 점은 스파이는 최소한 한가지 옷을 입는다고 했다. 전체 가짓 수에서 아무것도 입지 않은 상태를 빼면 된다.
