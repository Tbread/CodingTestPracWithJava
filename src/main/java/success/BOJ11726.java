package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11726 {
    public static void main(String[] ars) throws Exception {
        Solution11726 s = new Solution11726();
        s.solution();
    }
}

class Solution11726 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long[] sqrs = new long[1001];
        sqrs[0] = 1;
        sqrs[1] = 1;
        for (int i = 2;i<=a;i++){
            sqrs[i] = (sqrs[i-1] + sqrs[i-2])%10007;
        }
        System.out.println(sqrs[a]);
    }
}

