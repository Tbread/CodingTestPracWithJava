package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11722 {
    public static void main(String[] ars) throws Exception {
        Solution11722 s = new Solution11722();
        s.solution();
    }
}

class Solution11722 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[a+1];
        int idx = 0;
        while (st.hasMoreTokens()){
            nums[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        int[] lengths = new int[a+1];
        lengths[0] = 1;
        int answer = 1;
        for (int i = 1;i<a;i++){
            int prevMax = 0;
            for (int j = 0;j<i;j++){
                if(lengths[j] > prevMax && nums[j] > nums[i]){
                    prevMax = lengths[j];
                }
            }
            lengths[i] = prevMax +1;
            if (lengths[i] > answer){
                answer = lengths[i];
            }
        }
        System.out.println(answer);
    }
}
