#include <string>
#include <vector>
#include <iostream>
using namespace std;

vector<vector<int>> solution(vector<vector<int>> arr1, vector<vector<int>> arr2) {
    vector<vector<int>> answer;
    answer.resize(arr1.size());
    
    for(vector<int> &x:answer)
        x.resize(arr2.at(0).size());
   
    for(int i=0;i<arr1.size();i++)
    {
        for(int j=0;j<arr2.at(0).size();j++)
        {
            for(int k=0;k<arr1.at(0).size();k++)
                answer[i][j]+=arr1[i][k]*arr2[k][j];
        }
    }
    return answer;
}