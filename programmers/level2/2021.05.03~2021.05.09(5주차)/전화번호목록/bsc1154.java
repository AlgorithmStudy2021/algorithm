import java.util.*;

class Solution {
    int pointer = 0;
    
    //주어진 문자열 w가 올바른 괄호 문자열인지 체크
    public boolean solve(String w) {
        boolean flag = true;
        Stack<Character> stack = new Stack<Character>();
        int left = 0, right = 0;
        
        //주어진 문자열에서 문자를 하나씩 꺼내서 여는괄호인지 닫는괄호인지 확인
        for(int i=0; i<w.length(); i++) {
            if(w.charAt(i) == '(') {
                left++;
                stack.push('(');
            } else {
                right++;
                //만약 여는 괄호가 없었는데 닫는 괄호가 나온다면 올바른 괄호 문자열이 아님
                if(stack.isEmpty())
                    flag = false;
                else
                    stack.pop();
            }
            
            //여는괄호와 닫는괄호 갯수가 같을때를 pointer에 저장해서 u,v의 경계를 구함
            //u,v경계가 구해지면 u가 올바른 괄호 문자열인지 결과를 가지고 리턴
            if(left == right) {
                pointer = i+1;
                return flag;
            }
        }
        
        //매개변수로 주어진 w가 균형잡힌 괄호 문자열이기 때문에 실제로 for밖으로 나올일은 없다.
        return true;
    }
    
    public String solution(String p) {
        if(p.isEmpty())
            return p;
        
        boolean check = solve(p);
        String u = p.substring(0, pointer);
        String v = p.substring(pointer, p.length());
        
        //u가 올바른 괄호 문자열이라면 나머지 v를 가지고 위 과정을 반복한다.
        if(check) {
            return u + solution(v);
        }
        
        //u가 올바른 괄호 문자열이 아니라면 과정 4를 수행한다.
        StringBuilder answer = new StringBuilder();
        
        answer.append("(").append(solution(v)).append(")");
        for(int i=1; i<u.length()-1; i++) {
            if(u.charAt(i)=='(')
                answer.append(")");
            else
                answer.append("(");
        }
        
        return answer.toString();
    }
}