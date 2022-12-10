package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10950 {
    public static void main(String[] ars) throws Exception {
        Solution10950 s = new Solution10950();
        s.solution();
    }
}

class Solution10950 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 0;i<repeat;i++){
            StringBuffer s = new StringBuffer(br.readLine());
            StringTokenizer st = new StringTokenizer(s.toString());
            bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}