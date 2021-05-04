import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
		int answer = 0;
		int i = 0;
        int j;
        
		Arrays.sort(people);

		// 몸무게가 가장 무거운 사람부터 판단한다.
		for(j=people.length-1; i<=j; j--) {
			// 최소 + 최대 몸무게 2명의 합이 무게제한보다 큰 경우
			// 가장 큰 몸무게의 인원을 먼저 1대 태워보냄
			if(people[j] + people[i] > limit)
				answer ++;

			/* 최소 + 최대 몸무게 2명의 합이 무제게한보다 같거나 작은 경우
			 *  - 두명을 한 보트에 태워 보낸다.
			 *  - 그 다음으로 몸무게가 작은 인원을 기준으로 삼아야 하기 때문에 i값을 ++해준다.
                왜냐면 2명이기 때문에 시작점이 커지면서 마감점도 낮아져야함.
			 */
			else {
				answer ++;
				i ++;
			}
		}

		return answer;
    }
}
