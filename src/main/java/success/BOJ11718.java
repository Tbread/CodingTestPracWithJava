package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ11718 {
    public static void main(String[] args)throws Exception{
        Solution11718 s = new Solution11718();
        s.solution();
    }
}
class Solution11718{
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s;
        while ((s = br.readLine()) != null){
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
    }
}
