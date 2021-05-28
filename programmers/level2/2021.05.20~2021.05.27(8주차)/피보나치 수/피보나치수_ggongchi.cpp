#include <string>
#include <vector>

using namespace std;


int solution(int n) {
    int answer = 0;
    int arr[3]={0,1,1};
    for(int i=2;i<n;i++)
    {
       arr[(i+1)%3]=arr[i%3]%1234567+arr[(i-1)%3]%1234567;
    }
    answer=arr[n%3]%1234567;
    return answer;
}