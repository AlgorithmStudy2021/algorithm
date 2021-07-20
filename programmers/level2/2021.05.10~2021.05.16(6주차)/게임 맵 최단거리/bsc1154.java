package test;

import java.util.LinkedList;
import java.util.Queue;

class gameMap {

    static boolean [][] chk;
    static int [] diry = {-1,0,1,0};//상 우 하 좌
    static int [] dirx = {0,1,0,-1};
    static int [][] map;
    static int n;
    static int m;

    public class Node{
        int x;
        int y;

        public Node(int y, int x){
            this.y=y;
            this.x=x;
        }
    }//상하 좌우 저장

    public int solution(int[][] maps) {
        int answer = 0;
        n = maps.length;
        m = maps[0].length;
        chk = new boolean[n][m];//방문지점을 구별하기 위한 배열
        //행렬 n*m 방문한적이 있는지 저장하기 위한 배열
        chk[0][0] = true;
        bfs(0,0);

        answer = map[n-1][m-1];
        return answer>1 ? map[n-1][m-1] : -1 ;
    }

    public  void bfs(int y, int x) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(y, x)); //큐에 0.0 추가

        while (!queue.isEmpty()) {
            Node now = queue.poll();//제일 꼭대기 큘르 꺼내고
            for (int i = 0; i < 4; i++) {
                int now_y = now.y + diry[i]; //꼭대기 큐의 x에
                int now_x = now.x + dirx[i];
                if (0 <= now_y && now_y < n && 0 <= now_x && now_x < m) {//현재이동할값이 0 보다 크면서 배열 테두리보다 작아야함
                    if (map[now_y][now_x] != 0 && !chk[now_y][now_x]) {//맵의 값이 0 아니면서 방문한적이 없으면
                        queue.add(new Node(now_y, now_x));//큐에 해당 위치 값 삽입
                        chk[now_y][now_x] = true;//방문 표시
                        map[now_y][now_x] = map[now.y][now.x] + 1;//이동할 칸에 현재 칸의 이동횟수에 +1
                   }
                    //방문한적이 없는곳은 줄어가므로 큐가 반복되는건 계속 가다가 사라짐
                }
            }
        }

    }
}
