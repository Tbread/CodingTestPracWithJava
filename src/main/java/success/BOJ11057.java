package success;

import java.util.Scanner;


public class BOJ11057 {
    public static void main(String[] ars) throws Exception {
        Solution11057 s = new Solution11057();
        s.solution();
    }
}

class Solution11057 {
    public void solution() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long[][] arr = new long[1001][11];
        for (int i = 0; i <= 10; i++) {
            arr[1][i] = 1;
        }
        for (int i = 2; i <= a; i++) {
            for (int j = 0; j < 10; j++) {
                long num = 0;
                for (int v = 0; v <= j; v++) {
                    num += arr[i - 1][v];
                }
                arr[i][j] = num % 10007;
            }
        }
        long answer = 0;
        for (int i = 0; i <= 9; i++) {
            answer += arr[a][i];
        }
        System.out.println(answer % 10007);
    }
}
