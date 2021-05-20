#include <string>
#include <vector>

using namespace std;
int zero,one = 0;
vector<vector<int>> quad;
void dfs(int x, int y, int size)
{
    bool isZero = true;
    bool isOne = true;
    
    for (int i = x; i < x + size; i++)
    {
        for (int j = y; j < y + size; j++)
        {
            if (!quad[i][j]) 
                isOne = false;
            else 
                isZero = false;
        }
    }
 
    if (isZero)
    {
        zero++;
        return;
    }
    if (isOne)
    {
        one++;
        return;
    }
 
    int nextSize = size/2;
    dfs(x, y, nextSize);
    dfs(x, y + nextSize, nextSize);
    dfs(x + nextSize, y, nextSize);
    dfs(x + nextSize, y + nextSize,nextSize);
}



vector<int> solution(vector<vector<int>> arr) {
  
    quad = arr;
    
    dfs(0,0,arr.size());
    
    vector<int> answer={zero,one};
    return answer;
}