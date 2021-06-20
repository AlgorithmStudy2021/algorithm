import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String,Integer>();
        
        int idx = 1; 
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(i + "", idx++);
        }
        int size = msg.length();
        for (int i = 0; i < size; i++) {
            int index = 1;
            while (((i + index) <= size) && map.containsKey(msg.substring(i, (i + index)))) {
                index++;
            }
            if ((i + index) > size) {
                list.add(map.get(msg.substring(i)));
                break;
            }
            list.add(map.get(msg.substring(i, i + index - 1)));
            map.put(msg.substring(i, i + index), idx++);
            if(index > 1) { 
                i += (index - 2);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}