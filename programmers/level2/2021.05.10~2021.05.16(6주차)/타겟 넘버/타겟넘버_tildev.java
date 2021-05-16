class Solution {
	private static int answer = 0;

	public int solution(int[] numbers, int target) {
		dfs(numbers, target, 0);
		return answer;
	}

	private void dfs(int[] numbers, int target, int index) {
		if (index == numbers.length) {
			int sum = 0;

			for (int num : numbers)
				sum += num;

			if (sum == target)
				answer++;
			return;
		}

		numbers[index] *= 1;
		dfs(numbers, target, index + 1);

		numbers[index] *= -1;
		dfs(numbers, target, index + 1);

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		int ans = new Solution().solution(numbers, target);

		System.out.println(ans);

	}
}
