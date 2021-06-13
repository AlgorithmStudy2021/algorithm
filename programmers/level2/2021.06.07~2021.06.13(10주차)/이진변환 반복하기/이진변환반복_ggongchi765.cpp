#include <string>
#include <vector>

using namespace std;

vector<int> solution(string s) {
    vector<int> answer;
    int zero = 0, ans = 0;
    
    while(s != "1")
    {
        //0을 제거하고 문자열의 길이 
        int length = 0;
        ans++;
        
        for(int i = 0; i < s.size(); i++)
        {
            if(s[i] == '0')
                zero++;
            else
                length++;
        }
        
        
    
        s = "";
        
        // 이진법 변환 
        while(length > 0)
        {
            s += to_string(length %2);
            length =  length/2;
        }
    }
    
    answer.push_back(ans);
    answer.push_back(zero);
    
    return answer;
}