#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool solution(vector<string> phone_book) {
    bool answer = true;
    sort(phone_book.begin(),phone_book.end());
    
    
    for(int i=0;i<phone_book.size()-1;i++)
    {
        for(int j=0;j<phone_book.at(i).length();j++)
        {
            if(j>=phone_book.at(i+1).length())
                break;
            if(phone_book.at(i).at(j)==phone_book.at(i+1).at(j))
                answer=false;
            else
            {
                answer=true;
                break;
            }
        }
        
        if(!answer)
            return answer;
    }
    return answer;
}