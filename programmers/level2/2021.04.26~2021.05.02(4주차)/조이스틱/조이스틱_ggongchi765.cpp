#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int solution(string name) {
    int answer = 0;
    int cursor=0;
    int len=name.length();
    int moves=len-1;
    string default_name;
    
    for(int i=0;i<len;i++){
        default_name.append("A");
    } //A로 이루어진 문자 만들기 
    
    for(int i=0 ;i<len;i++)
    {
        if(default_name.at(i)!=name.at(i))
        {
            if(name.at(i)-'A'>=13)
                answer=answer+'Z'-name.at(i)+1;
            else
                answer=answer+name.at(i)-'A';
        }
        default_name.at(i)=name.at(i);
    }//상하 조이스틱 움직임 계산 
    
    for(int i=0;i<len;i++)
    {
        int next=i+1;
        while(next <len&& name.at(next)=='A')
            next++;
        moves=min(moves,i+len-next+min(i,len-next));
    }
    
    answer=answer+moves;
    cout<<default_name<<endl;    
    
    return answer;
}