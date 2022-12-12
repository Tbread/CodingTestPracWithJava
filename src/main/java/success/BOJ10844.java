package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ10844 {
    public static void main(String[] ars) throws Exception {
        Solution10844 s = new Solution10844();
        s.solution();
    }
}

class Solution10844 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long[][] arr = new long[101][10];
        for (int i = 1; i <= 9; i++) {
            arr[1][i] = 1;
        }
        for (int i = 2; i <= a; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    arr[i][j] = arr[i - 1][j+1]%1000000000;
                } else if (j == 9) {
                    arr[i][j] = arr[i - 1][j-1]%1000000000;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j + 1])%1000000000;
                }
            }
        }
        long answer = 0;
        for (int i = 0; i<=9;i++){
            answer += arr[a][i];
        }
        System.out.println(answer%1000000000);
    }
}
