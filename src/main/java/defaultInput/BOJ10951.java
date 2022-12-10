package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ10951 {
    public static void main(String[] ars) throws Exception {
        Solution10951 s = new Solution10951();
        s.solution();
    }
}

class Solution10951 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String s;
        while ((s = br.readLine()) != null && !s.equals("null")) {
            StringTokenizer st = new StringTokenizer(s);
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
            bw.write(sb.toString());
            sb.delete(0,sb.length());
        }
        bw.flush();
        bw.close();
    }
}
