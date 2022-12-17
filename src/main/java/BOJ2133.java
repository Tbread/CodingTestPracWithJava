import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2133 {
    public static void main(String[] ars) throws Exception {
        Solution2133 s = new Solution2133();
        s.solution();
    }
}

class Solution2133 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] ways = new int[31];
        ways[0] = 1;
        ways[2] = 3;
        for (int i = 4; i <= a; i += 2) {
            ways[i] = ways[i - 2] * ways[2];
            for (int j = 4; j < i; j += 2) {
                ways[i] += ways[i-j] * 2;
            }
        }
        System.out.println(ways[a]);
    }
}
