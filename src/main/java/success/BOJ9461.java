package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9461 {
    public static void main(String[] ars) throws Exception {
        Solution9461 s = new Solution9461();
        s.solution();
    }
}

class Solution9461 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        int a;
        long[] nums = new long[101];
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 1;
        nums[4] = 2;
        nums[5] = 2;
        for (int i = 6; i <= 100; i++) {
            nums[i] = nums[i - 1] + nums[i - 5];
        }
        for (int i = 0; i < repeat; i++) {
            a = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(nums[a]));
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
