#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(int n, vector<string> data) {
    int answer = 0;
    string kakao = "ACFJMNRT";
    
    do{
        bool isOk = true;
        
        for(string cmd : data)
        {
           
            char comp = cmd[3];
            int num = cmd[4]-'0';
            int dis = abs((int)(kakao.find(cmd[0])-kakao.find(cmd[2])))-1;
            
            if(comp == '=')
                isOk = (dis == num);
            else if(comp == '>')
                isOk = (dis > num);
            else 
                isOk = (dis < num);
            
        
            if(!isOk)
                break;
        }
    
        if(isOk)
            answer++;
    }while(next_permutation(kakao.begin(),kakao.end()));
    return answer;
}