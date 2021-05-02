#include <string>
#include <vector>
#include <map>

using namespace std;


//(1 타입의 옷+1)x(2 타입의 옷+1)x..(n 타입의 옷+1)-1

int solution(vector<vector<string>> clothes) {
    int answer = 1;
    map<string,int> ans;
    map<string,int> ::iterator it;
    for(vector<string> tmp : clothes)
    {
        it=ans.find(tmp.at(1));
        if(it==ans.end())
             ans.insert(map<string,int>::value_type(tmp.at(1),1));
        else
            it->second=it->second+1;
               
    }
    
    it=ans.begin();
    while(it!=ans.end())
   {
        answer=answer*(it->second+1);
        it++;
    }
           
           
    
    return answer-1;
}