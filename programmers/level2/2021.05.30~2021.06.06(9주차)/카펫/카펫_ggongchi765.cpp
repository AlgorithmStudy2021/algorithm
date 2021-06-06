#include <string>
#include <vector>
#include <cmath>
#include <iostream>
using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    
    int sum=(brown+4)/2 *(-1);
    int times=yellow+brown;
    
    // x^2 + sum x + times = 0
    answer.push_back((-sum+sqrt(sum*sum-4*times))/2);
    answer.push_back((-sum-sqrt(sum*sum-4*times))/2);                
        
    return answer;
}