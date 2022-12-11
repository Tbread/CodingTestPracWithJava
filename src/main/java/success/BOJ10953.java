package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10953 {
    public static void main(String[] ars) throws Exception {
        Solution10953 s = new Solution10953();
        s.solution();
    }
}

class Solution10953 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0; i < repeat; i++) {
            st = new StringTokenizer(br.readLine(),",");
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        bw.flush();
        bw.close();
    }
}
