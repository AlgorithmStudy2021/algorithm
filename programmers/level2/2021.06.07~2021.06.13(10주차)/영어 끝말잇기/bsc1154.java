import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
		        int[] answer = new int[] {0,0};
		        HashSet<String> hs = new HashSet();
		        int size = words.length;;
		        int a=1,b=1;
		        char c = words[0].charAt(0);
		        for( String word : words) {
		        	if(hs.contains(word) || c!=word.charAt(0)) {
		        		return new int[] {a,b}; 
		        	}else {
                        hs.add(word);
		        		c = word.charAt(word.length()-1);
		        		if(++a > n) {
		        			a = 1; 
		        			b++;
		        		}
		        	}
		        }
		        return answer;
		    }
}
