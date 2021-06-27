#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(int cacheSize, vector<string> cities) {
    
    if(cacheSize == 0)
        return cities.size()*5;
    
    int answer = 0;
    vector<string> cache;
    
    for(string city : cities)
    {
        transform(city.begin(), city.end(), city.begin(), ::tolower);
    
        int i = 0;
        for(i = 0;i<cache.size();i++)
        {
            if(cache[i] == city)
            {
                cache.erase(cache.begin()+i);
			    cache.push_back(city);          
                answer += 1;
              
                break;
            }
        }
    
            

      if(i ==cache.size())
      {
          answer+=5;
          
          if(cache.size() == cacheSize)
                cache.erase(cache.begin());
          
          cache.push_back(city);

      }
    }
    
    
    return answer;
    
}