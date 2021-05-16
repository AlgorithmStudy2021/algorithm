#include <string>
#include <vector>
#include <iostream>
#include <map>
using namespace std;
map <int,int> make_tuple(string s){
    map<int,int> tuple;
    int tmp_num=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.at(i)!='{' && s.at(i)!='}'&& s.at(i)!=',')
        {
            while(s.at(i)!=',')
            {
                if(s.at(i)=='}')
                    break;
                tmp_num=tmp_num*10;
                tmp_num=tmp_num+s.at(i)-'0';
                i++;
            }
            
            if(tuple.count(tmp_num)==0)
                tuple[tmp_num]=1;
            else
                tuple[tmp_num]++;
            tmp_num=0;
        }
    }
    return tuple;
}


vector<int> solution(string s) {
    vector<int> answer;
    map<int,int> tuple=make_tuple(s);
    map<int,int>::iterator it;
    int tmp_num=tuple.size();
    
    while(tmp_num!=0)
    {
        
       for(it=tuple.begin();it!=tuple.end();it++)
        {
           if(it->second==tmp_num)
                    answer.push_back(it->first);
        }
        tmp_num--;

    }

    return answer;
}