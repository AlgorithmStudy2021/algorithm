#include <string>
#include <vector>
#include <algorithm>
#include <iostream>
using namespace std;

int solution(vector<int> people, int limit) {
    int answer = 0;
    int hcur=0;
    int tcur=people.size()-1;
    sort(people.begin(),people.end());
    
    while(hcur<=tcur)
    {
        if(people.at(tcur)+people.at(hcur)<=limit)
        {
            tcur--;
            hcur++;
       
        }
        else
        {
            tcur--;
        }
        answer++;
    }

    return answer;
}