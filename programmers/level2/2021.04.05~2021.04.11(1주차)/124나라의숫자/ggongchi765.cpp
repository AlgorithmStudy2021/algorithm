#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(int n) {
     string answer = "";
  
    while(n>0){
        if(n%3==0)
            answer=answer+'4';
        else if(n%3==1)
            answer=answer+'1';
        else
            answer=answer+'2';
        
        if(n%3==0)
            n=n/3-1;
        else
            n=n/3;
    }

    reverse(answer.begin(),answer.end());
   
    return answer;
}