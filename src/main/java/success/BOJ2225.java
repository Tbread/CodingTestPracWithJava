package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2225 {
    public static void main(String[] ars) throws Exception {
        Solution2225 s = new Solution2225();
        s.solution();
    }
}

class Solution2225 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        long[][] sums = new long[k + 1][n + 1];
        sums[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    sums[i][0] = 1;
                } else {
                    sums[i][j] = (sums[i - 1][j] + sums[i][j - 1]) % 1000000000;
                }
            }
        }
        System.out.println(sums[k][n]);
    }
}

