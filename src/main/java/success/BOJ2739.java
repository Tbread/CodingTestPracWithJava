package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2739 {
    public static void main(String[] ars) throws Exception {
        Solution2739 s = new Solution2739();
        s.solution();
    }
}

class Solution2739 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for(int i = 1;i<10;i++){
            bw.write(a+" * "+i+" = "+(a*i)+"\n");
        }
        bw.flush();
        bw.close();
    }
}