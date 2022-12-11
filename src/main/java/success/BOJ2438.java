package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2438 {
    public static void main(String[] ars) throws Exception {
        Solution2438 s = new Solution2438();
        s.solution();
    }
}

class Solution2438 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        String star = "*";
        for (int i=1;i<=a;i++){
//            bw.write(star.repeat(i)); //자바11
            for(int j=1;j<=i;j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
