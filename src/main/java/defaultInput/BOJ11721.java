package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ11721 {
    public static void main(String[] ars) throws Exception {
        Solution11721 s = new Solution11721();
        s.solution();
    }
}

class Solution11721 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        for(int i = 1;i<=s.length();i++){
            bw.write(s.charAt(i-1));
            if(i%10==0){
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
