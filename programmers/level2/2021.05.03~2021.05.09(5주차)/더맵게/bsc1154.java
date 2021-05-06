import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue();//fifo

        for (int aScoville : scoville) {
            heap.offer(aScoville);// 각 배열의 원소를 힙에 저장
        }
        //모든 음식의 스코빌 지수를 k이상으로 만들수 없는 경우
        while (heap.peek() <= K) {//우선순위가 가장 높은 값(가장 작은값)이 k보다 작으면서 사이즈는 1이면 종료
            if (heap.size() == 1) {
                return -1;
            }
            int a = heap.poll();//첫번째 값 반환 하고 제거, 비어있으면 null 가장 낮은값 1
            int b = heap.poll();//첫번째 값 반환 하고 제거, 비어있으면 null 그다음으로 낮은값 2


            int result = a + (b * 2);//계산

            heap.offer(result);//힙에 추가
            answer ++;
        }
        return answer;
    }
}


/**우선순위 큐(Priority Queue)란?
일반적으로 큐는 데이터를 일시적으로 쌓아두기 위한 자료구조로 스택과는 다르게 FIFO(First In First Out)의 구조 즉 먼저 들어온 데이터가 먼저 나가는 구조를 가집니다. PriorityQueue는 먼저 들어온 순서대로 데이터가 나가는 것이 아닌 우선순위를 먼저 결정하고 그 우선순위가 높은 엘리먼트가 먼저 나가는 자료구조입니다. 우선순위 큐는 힙을 이용하여 구현하는 것이 일반적입니다. 데이터를 삽입할 때 우선순위를 기준으로 최대힙 혹은 최소 힙을 구성하고 데이터를 꺼낼 때 루트 노드를 얻어낸 뒤 루트 노드를 삭제할 때는 빈 루트 노드 위치에 맨 마지막 노드를 삽입한 후 아래로 내려가면서 적절한 자리를 찾아서 옮기는 방식으로 진행됩니다.

 

Priority Queue의 특징
1. 높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조 (큐에 들어가는 원소는 비교가 가능한 기준이 있어야함) 
2. 내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있음   
3. 내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)

4. 응급실과 같이 우선순위를 중요시해야 하는 상황에서 쓰임*/
