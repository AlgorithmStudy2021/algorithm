#include <string>
#include <vector>

using namespace std;
int answer=0;
int target_sum=0;
void bfs(int idx,int sum,vector<int> numbers)
{
    if(idx==numbers.size())
        if(sum==target_sum)
        {
            answer++;
            return;
        }
    else
        return;
    
    bfs(idx+1,sum+numbers.at(idx),numbers);
    bfs(idx+1,sum-numbers.at(idx),numbers);
    
}


int solution(vector<int> numbers, int target) {
    target_sum=target;
    bfs(0,0,numbers);
    return answer;
}