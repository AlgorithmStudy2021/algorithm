#include <string>
#include <vector>
#include <algorithm>
#include <queue>

using namespace std;

int solution(vector<int> scoville, int K) {
    int answer = 0;
    int tmp=0;
    priority_queue<int,vector<int>,greater<int>> min_heap_scoville;
    for(int x : scoville)
        min_heap_scoville.push(x);
   
    while(min_heap_scoville.top() < K)
    {
        if(min_heap_scoville.size()==1)
            break;
        tmp=min_heap_scoville.top();
        min_heap_scoville.pop();
        
        tmp=tmp+min_heap_scoville.top()*2;
        min_heap_scoville.pop();
        
        min_heap_scoville.push(tmp);
        answer++;
      

    }
    if(min_heap_scoville.size()==1 && min_heap_scoville.top() < K)
        return -1;
    
    return answer;
}