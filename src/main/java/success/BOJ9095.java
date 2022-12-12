package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ9095 {
    public static void main(String[] ars) throws Exception {
        Solution9095 s = new Solution9095();
        s.solution();
    }
}

class Solution9095 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        int[] arr = new int[12];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4;i<=11;i++){
            arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
        }
        for (int i = 0;i<repeat;i++){
            int a = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(arr[a])+"\n");
        }
        bw.flush();
        bw.close();
    }
}
