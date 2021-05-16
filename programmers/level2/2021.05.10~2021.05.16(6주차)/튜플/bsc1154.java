import java.util.*;
class Solution {
    public static int[] solution(String s) {
        int[] answer = {};
        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
        answer = new int[strs.length];
        HashSet<Integer> hs = new HashSet<Integer>();
        Arrays.sort(strs, (a,b)->(a.length()-b.length()));//strs의 두개의 변수길이를 빼어 +이면 짤은거부터 긴거 순으로
        int i = 0;
        for(String str : strs){
            for(String st : str.split(",")){//input 배열안의 해당요소의 각 숫자로 분리
                int a  = Integer.parseInt(st.trim());
                if(hs.contains(a))continue; //해당요소가 hs에 포함되면 다음 턴으로 건너뜀
                hs.add(a);  //포함되지않으면 hs에 추가
                answer[i++] = a;//answer 배열에 a를 하나씩 초기화
            }
        }
        return answer;
    }
}
//n개
//
