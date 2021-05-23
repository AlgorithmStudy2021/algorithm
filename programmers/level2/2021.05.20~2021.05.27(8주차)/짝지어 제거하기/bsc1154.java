import java.util.*;
public class Solution {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();//LAST IN FIRST OUT
         
        for(char c : s.toCharArray()) //문자열을 문자열 배열로 변환
          if(!stack.isEmpty() && stack.peek() == c) stack.pop(); //같으면 뽑는다.
          else stack.push(c);//다르면 넣는다.
         //peek 맨 마지막요소 제거하지 않고 반환
        return stack.isEmpty() ? 1 : 0;
    }
}
