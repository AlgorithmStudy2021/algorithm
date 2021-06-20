public class itchoi {
    public static void main(String[] args) {
        int n = 15;
        System.out.println("result: " + 숫자의_표현_함수(n));
    }

    private static int 숫자의_표현_함수(int n) {
        int answer = 0;

        int sum = 0;
        int lt = 1;
        for (int rt = 1; rt <= n; rt++) {
            sum += rt;
            if (sum <= n) {
                if (sum == n) {
                    answer++;
                }
            }

            while (sum >= n && (sum + rt) >- n) {
                sum -= lt++;
                if (sum == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
