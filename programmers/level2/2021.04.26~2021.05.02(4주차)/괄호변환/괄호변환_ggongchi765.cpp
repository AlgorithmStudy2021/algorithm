#include <string>
#include <vector>

using namespace std;
bool isCorrect(string s)
{

    int cnt = 0;
    for(char c :s)
    {
        if(c=='(')
            cnt++;
        else
            cnt--;

        if(cnt < 0)
            return false;        
    }

    if(cnt==0)
        return true;
    else
        return false;
    
}


string solution(string p)
{
    if(p.empty())
        return p;

     string u,v;
     int index = 0;

     for(int i=0;i<p.size();i++)
     {
         if(p[i]=='(') 
            index++;
        else 
            index--;

        if(index==0)
        {
            //u는 균형잡힌 문자열  
            u = p.substr(0,i+1);
            v = p.substr(i+1);
            break;
        }    
     }

    //u가 올바른 문자열인지 확인 후 맞다면 v를 재귀 
     if(isCorrect(u))
        return u+solution(v);


    //u가 올바른 문자열이 아니였다. 
    string tmp = "("+solution(v)+")";

    for(int i=1;i<u.size()-1;i++)
    {
        if(u[i]=='(')
            tmp+=")";
        else
            tmp+="(";
    }

    return tmp;
}