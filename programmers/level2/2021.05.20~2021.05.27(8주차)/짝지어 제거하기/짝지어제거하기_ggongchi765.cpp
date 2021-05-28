#include <iostream>
#include<string>
#include <vector>
using namespace std;

int solution(string s)
{
    vector <char> tmp;
    vector <char> s_check;
    
    if(s.length()==1)
        return 0;

    
    for(int i=0;i<s.length()-1;i++)
        s_check.push_back(s.at(i));
    
 
    tmp.push_back(s.at(s.length()-1));
    
    while(!s_check.empty())
    {
                
      
         if(tmp.back()==s_check.back())
        {
            tmp.pop_back();
            s_check.pop_back();
        }
       else
       {
        
        tmp.push_back(s_check.back());
        s_check.pop_back();
           
       }


  
    }
   

    if(tmp.empty())
        return 1;
 
   
    else 
        return 0;
    
   
}