#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    bool start=true;

    for(int i=0;i<s.length();i++)
    {
        if(s.at(i)==' ')
             start=true;
        
        else if(start)
        {
            if(s.at(i)>='a'&&s.at(i)<='z')
                s.at(i)=s.at(i)-32;
            
            start=false;      
        }
        
        else if(s.at(i)>='A'&&s.at(i)<='Z')
             s.at(i)=s.at(i)+32;
    }
    return s;
}