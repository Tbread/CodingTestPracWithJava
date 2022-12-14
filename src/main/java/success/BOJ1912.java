package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1912 {
    public static void main(String[] ars) throws Exception {
        Solution1912 s = new Solution1912();
        s.solution();
    }
}

class Solution1912 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        int[] nums = new int[a];
        int[] sums = new int[a];
        while (st.hasMoreTokens()) {
            nums[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        sums[0] = nums[0];
        int answer = sums[0];
        for (int i = 1; i < a; i++) {
            sums[i] = Math.max(nums[i],sums[i-1]+nums[i]);
            answer = Math.max(answer,sums[i]);
        }
        System.out.println(answer);
    }
}
