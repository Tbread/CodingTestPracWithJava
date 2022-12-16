package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1699 {
    public static void main(String[] ars) throws Exception {
        Solution1699 s = new Solution1699();
        s.solution();
    }
}

class Solution1699 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] minSums = new int[a+1];
        int sqrt;
        minSums[1] = 1;
        for (int i = 2;i<=a;i++){
            sqrt = (int) Math.sqrt(i);
            minSums[i] = i;
            for (int j = 1;j<=sqrt;j++){
                minSums[i] = Math.min(minSums[i],minSums[(int) (i-Math.pow(j,2))]+1);
            }
        }
        System.out.println(minSums[a]);
    }


}
