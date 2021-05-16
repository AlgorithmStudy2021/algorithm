class Solution
{
 public int solution(int n, int a, int b) //n명의 참가자중 4번과 7번이 몇번쨰 라운드에서 만나는가?
    {//4 , 7 
        int answer = 0;
        while(a != b){
            answer ++; //1 라운드
            a = (a+1)/2;//몫 2
            b = (b+1)/2;//몫 4
        }
        return answer;
    }
}