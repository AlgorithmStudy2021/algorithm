#include<vector>
#include<queue>
#include<cstring>

using namespace std;

int solution(vector<vector<int> > maps)
{

    int n = maps.size();
    int m = maps[0].size();
    int pos[4][2] = {{0,1},{0,-1},{1,0},{-1,0}};
    int dis[101][101];
    queue<pair<int,int>>q;


    memset(dis,-1,sizeof(dis));

    q.push({0,0});
    dis[0][0]=1;

    while(!q.empty())
    {
        int y = q.front().first;
        int x = q.front().second;
        q.pop();

        if(y==n-1 && x == m-1) // if : 상대진영 도착 
             return dis[y][x];
        
        for(int i=0; i<4; i++)
        {
            int ny = y+pos[i][0];
            int nx = x+pos[i][1];

            if(ny>=0 && ny<n && nx >= 0 && nx <m) // if : 범위 내의 값
                if(maps[ny][nx]==1 && dis[ny][nx]==-1) 
                {
                    dis[ny][nx] = dis[y][x]+1;
                    q.push({ny,nx});
                }

        }

    }

    return -1;
}