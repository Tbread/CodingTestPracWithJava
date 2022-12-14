package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11053 {
    public static void main(String[] ars) throws Exception {
        Solution11053 s = new Solution11053();
        s.solution();
    }
}

class Solution11053 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[a+1];
        int[] lengths = new int[a+1];
        int idx = 0;
        while(st.hasMoreTokens()){
            nums[idx] = Integer.parseInt(st.nextToken());
            idx ++;
        }
        lengths[0] = 1;
        int longest = 0;
        for(int i=1;i<lengths.length;i++){
            int maxlength = 0;
            for (int j=0;j<i;j++){
//                System.out.println("nums["+j+"]: "+nums[j]+" nums["+i+"]: "+nums[i]);
                if (nums[i]>nums[j] && lengths[j] > maxlength){
                    maxlength = lengths[j];
                }
            }
            lengths[i] = maxlength+1;
            if (maxlength+1>longest){
                longest = maxlength+1;
            }
        }
        System.out.println(longest);




    }
}
