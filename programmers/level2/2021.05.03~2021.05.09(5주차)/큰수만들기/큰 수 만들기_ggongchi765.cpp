#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(string number, int k) {
    string answer = "";
    int max_tmp=0;
    int cur=-1;
    for(int j=0;j<number.size()-k;j++)
    {
        
        for(int i=cur+1;i<=k+j;i++)
            {
                if(max_tmp<number.at(i)-'0')
                {
                    max_tmp=number.at(i)-'0';
                    cur=i;
                }
            }
            answer=answer+to_string(max_tmp);
            max_tmp=0;

    }
    return answer;
}