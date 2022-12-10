package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2742 {
    public static void main(String[] ars) throws Exception {
        Solution2742 s = new Solution2742();
        s.solution();
    }
}

class Solution2742 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i = N;i>=1;i--){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}