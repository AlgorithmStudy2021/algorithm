class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //배열의 길이만큼
        for(int i =0; i<phone_book.length; i++){
            for(int j =0; j<phone_book.length; j++){
                if(i == j) continue; //반복문 1회 건너뜀 (비교대상이 같은 인덱스이므로)
                if(phone_book[j].indexOf(phone_book[i])==0){//접두어라면   
                    //indexof(str)현재 문자열 객체에서 str를 찾아서 존재하면 첫째문자 위치를 반환하고 없으면 -1반환
                    return false;   
                }
            }
        }
        
        return answer;
    }
}
//한번호가 다른번호의 접두어인 경우가 있으면 false 그렇지 않으면 true
//
