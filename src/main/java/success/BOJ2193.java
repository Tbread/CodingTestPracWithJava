package success;

import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ2193 {
    public static void main(String[] ars) throws Exception {
        Solution2193 s = new Solution2193();
        s.solution();
    }
}

class Solution2193 {
    public void solution() throws Exception {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        int a = sc.nextInt();
        long[][] arr = new long[91][2];
        arr[1][1] = 1;
        for (int i = 2; i <= a; i++) {
            for (int j = 0; j <= 1; j++) {
                if (j == 0) {
                    arr[i][j] = arr[i - 1][0] + arr[i - 1][1];
                } else {
                    arr[i][j] = arr[i - 1][0];
                }
            }
        }
        System.out.println(arr[a][0] + arr[a][1]);
    }
}
