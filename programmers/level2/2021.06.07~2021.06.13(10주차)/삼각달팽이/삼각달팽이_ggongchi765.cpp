#include <string>
#include <vector>

using namespace std;




vector<int> solution(int n) {
    vector<int> answer;
    int arr[1000][1000];
    int dx[] = {1,0,-1};
    int dy[] = {0,1,-1};
    int x = -1;
    int y = 0;
    int num =1;
    int tmpN = n;
    int dir = 0;
    
    while(n>0)
    {
        for(int i=0;i<n;i++)
        {
            x += dx[dir%3];
            y += dy[dir%3];
            arr[x][y] = num++;
        }
        n--;
        dir++;
    }
    
    
    for(int i=0;i<tmpN;i++)
        for(int j=0;j<i+1;j++)
            answer.push_back(arr[i][j]);
    
    return answer;
}