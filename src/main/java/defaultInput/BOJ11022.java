package defaultInput;
import java.io.*;
import java.util.StringTokenizer;
public class BOJ11022 {
    public static void main(String[] args) throws Exception {
        Solution11022 s = new Solution11022();
        s.solution();
    }
}

class Solution11022{
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());
        for (int i=1;i<=repeat;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
