package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ11021 {
    public static void main(String[] args) throws Exception{
        Solution11021 s = new Solution11021();
        s.solution();
    }
}

class Solution11021{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int repeat = Integer.parseInt(br.readLine());
        for (int i = 1;i<=repeat;i++){
            st = new StringTokenizer(br.readLine());
            bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
        bw.close();
    }
}
