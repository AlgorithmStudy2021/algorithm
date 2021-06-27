#include <string>
#include <algorithm>
#include <vector>

using namespace std;

char number[18] = {'0', '1', '2', '3', '4', 
                '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};

string getAlpha(int num, int n){
    string answer;
    if(num == 0){
        return "0";
    }
    while(num > 0){
        answer += number[num % n];
        num /= n;
    }
    reverse(answer.begin(), answer.end());
    return answer;
}

string solution(int n, int t, int m, int p) {
    string answer = "";
    string tmp;
    int mt = m * t;

    for(int num = 0; tmp.size() <= mt; num++)
        tmp += getAlpha(num, n);

    for(int i = 0; i < t; i++)
        answer += tmp.at((m*i)+(p-1));
    

    return answer;
}