package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11055 {
    public static void main(String[] ars) throws Exception {
        Solution11055 s = new Solution11055();
        s.solution();
    }
}

class Solution11055 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[a + 1];
        int[] sums = new int[a + 1];
        int idx = 0;
        while (st.hasMoreTokens()) {
            nums[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        sums[0] = nums[0];
        int answer = 0;
        for (int i = 1; i < a; i++) {
            int maxSum = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && maxSum < sums[j]){
                    maxSum = sums[j];
                }
            }
            sums[i] = maxSum + nums[i];
            if (sums[i]>answer){
                answer = sums[i];
            }
            if (answer < nums[0]){
                answer = nums[0];
            }
        }
        if (a == 1){
            answer = nums[0];
        }
        System.out.println(answer);
    }
}
