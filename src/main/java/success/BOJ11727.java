package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11727 {
    public static void main(String[] ars) throws Exception {
        Solution11727 s = new Solution11727();
        s.solution();
    }
}

class Solution11727 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        long[] arr = new long[1001];
        arr[1]=1;
        arr[2]=3;
        for (int i = 3;i<=a;i++){
            arr[i] = (arr[i-1] + arr[i-2]*2)%10007;
        }
        System.out.println(arr[a]);
    }
}
