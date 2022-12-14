package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2156 {
    public static void main(String[] ars) throws Exception {
        Solution2156 s = new Solution2156();
        s.solution();
    }
}

class Solution2156 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] wine = new int[10001];
        for (int i = 0; i < cnt; i++) {
            wine[i] = Integer.parseInt(br.readLine());
        }
        if (cnt == 1) {
            System.out.println(wine[0]);
        } else if (cnt == 2) {
            System.out.println(wine[0] + wine[1]);
        } else if (cnt == 3) {
            System.out.println(Math.max(Math.max(wine[0] + wine[1], wine[0] + wine[2]), wine[1] + wine[2]));
        } else {
            int[] maxWine = new int[10001];
            maxWine[0] = wine[0];
            maxWine[1] = wine[0] + wine[1];
            maxWine[2] = Math.max(Math.max(wine[0] + wine[1], wine[0] + wine[2]), wine[1] + wine[2]);
            for (int i = 3; i < cnt; i++) {
                int a = maxWine[i - 1]; //이번 와인 건너뛰기
//            System.out.println("maxWine[i-1]: " + maxWine[i - 1]);
                int b = maxWine[i - 3] + wine[i - 1] + wine[i]; //이번에 연달아마심
//            System.out.println("maxWine[i-3]: " + maxWine[i - 3] + " wine[i-1]: " + wine[i - 1] + " wine[i]: " + wine[i]);
                int c = maxWine[i - 2] + wine[i]; //이전 와인 건너뛰기 (전전번에 연달아마심)
//            System.out.println("maxWine[i-2]: " + " wine[i]: " + wine[i]);
                maxWine[i] = Math.max(Math.max(a, b), c);
            }
            int answer = 0;
            for (int i = cnt - 1; i >= cnt - 3; i--) {
                answer = Math.max(maxWine[i], answer);
            }
            System.out.println(answer);
        }
    }
}
