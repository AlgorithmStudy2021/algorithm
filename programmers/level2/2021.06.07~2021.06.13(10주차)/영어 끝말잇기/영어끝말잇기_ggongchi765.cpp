#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer;
    int order=1;
    string last_word=words.front();
    vector <string> said_words;
    reverse(words.begin(),words.end());
    words.pop_back();
    said_words.push_back(last_word);
        
    while(!words.empty())
    {
      
        if(words.back().at(0)==last_word.at(last_word.length()-1))
        {
            last_word=words.back();
    
            
            if(find(said_words.begin(),said_words.end(),words.back())!=said_words.end())
                {
         
                    answer.push_back(order%n+1);
                    answer.push_back(order/n+1);
                   return answer;
                }
            order++;   
            
            words.pop_back();
            said_words.push_back(last_word);
        }
        else
        {
         
            answer.push_back(order%n+1);
            answer.push_back(order/n+1);
           return answer;
        }
     
    }
   
 
    answer.push_back(0);
    answer.push_back(0);
    
    return answer;
}