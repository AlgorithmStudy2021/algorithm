#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> citations) {
    int answer = citations.size();
    sort(citations.begin(),citations.end());
    
    for(int i=0;i<citations.size();i++)
    {
            if(answer>citations.at(i))
                answer--;
    }
    
    

    return answer;
}