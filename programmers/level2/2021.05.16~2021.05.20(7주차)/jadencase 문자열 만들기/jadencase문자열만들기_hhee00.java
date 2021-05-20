class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String arr[] = s.split("\\s");
        
        for (int i = 0; i < arr.length; i++) {
            if (!"".equals(arr[i])) {
                char firstCh = arr[i].charAt(0);
                if (!Character.isDigit(firstCh)) {
                    sb.append(Character.toString(firstCh).toUpperCase());
                } else {
                    sb.append(Character.toString(firstCh));
                }
                for (int j = 1; j < arr[i].length(); j++) {
                    char ch = arr[i].charAt(j);
                    if (!Character.isDigit(ch)) {
                        sb.append(Character.toString(ch).toLowerCase());
                    } else {
                        sb.append(Character.toString(ch));
                    }
                }
                if (i != (arr.length - 1)) {
                    sb.append(" ");
                }
            } else {
                sb.append(" ");
            }
        }
        
        if (" ".equals(Character.toString(s.charAt(s.length()-1)))) {
            sb.append(" ");
        }
        
        answer = sb.toString();
        return answer;
    }
}