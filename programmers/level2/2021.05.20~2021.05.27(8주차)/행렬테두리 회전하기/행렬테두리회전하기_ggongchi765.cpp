#include <string>
#include <vector>
#include <iostream>

using namespace std;
int table[101][101];


int getSmallAnswer(vector<int> querues)
{
    
    int startX = querues[0];
    int startY = querues[1];
    int endX = querues[2];
    int endY = querues[3];
   
    int tmp = table[startX][startY];
    int answer = tmp;
    
    
    for(int i = startX; i < endX; i++)
    {
        if(answer>table[i+1][startY])
           answer = table[i+1][startY];
        table[i][startY] = table[i+1][startY];
    }
  

    for(int i = startY; i < endY; i++)
    {
        if(answer>table[endX][i+1])
           answer = table[endX][i+1];
       table[endX][i] = table[endX][i+1];
    }
   
    
    for(int i = endX; i > startX; i--)
    {
        if(answer>table[i-1][endY])
           answer = table[i-1][endY];
        table[i][endY] = table[i-1][endY];
    }
  

    for(int i = endY; i > startY+1; i--)
    {
        if(answer>table[startX][i-1])
           answer = table[startX][i-1];
       table[startX][i] = table[startX][i-1];
    }
   
    
    table[startX][startY+1] = tmp;
    return answer;
}

vector<int> solution(int rows, int columns, vector<vector<int>> queries) {
    vector<int> answer;
    
 
    
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=columns;j++)
            table[i][j] = (i-1)*columns+j;
    }
      
    for(vector<int> target : queries)
        answer.push_back(getSmallAnswer(target));
    
    
    return answer;
}