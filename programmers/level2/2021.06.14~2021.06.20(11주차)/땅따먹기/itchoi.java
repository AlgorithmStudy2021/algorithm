public class itchoi {
    public static void main(String[] args) {
        /*int[][] land = {
            {1, 2, 3, 5},
            {5, 6, 7, 8},
            {4, 3, 2, 1}
        };*/

        int[][] land = {
                {4, 3, 2, 1},
                {2, 2, 2, 1},
                {6, 6, 6, 4},
                {8, 7, 6, 5}
        };

        /*int[][] land = {
            {9, 5, 2, 3},
            {9, 8, 6, 7},
            {8, 9, 7, 1},
            {100, 9, 8, 1}
        };*/
        System.out.println("result: " + 땅따먹기_함수(land));
    }

    private int 땅따먹기_함수(int[][] land) {
        for(int i = 1; i < land.length; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][1], land[i-1][0]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][0]);
        }

        int[] answer = land[land.length-1];
        Arrays.sort(answer);

        return answer[answer.length-1];
    }
}
