#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr) {
    int answer = 0;
    int a,b=0;
    while(arr.size()!=1)
    {
        a=arr.back();
        arr.pop_back();
        b=arr.back();
        arr.pop_back();
        answer=a*b;
        
        while(b!=0)
        {
            int r=a%b;
            a=b;
            b=r;
        }
        
        answer=answer/a;
        
        arr.push_back(answer);
    }
    return arr.front();
}