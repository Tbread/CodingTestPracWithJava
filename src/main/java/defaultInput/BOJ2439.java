package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2439 {
    public static void main(String[] ars) throws Exception {
        Solution2439 s = new Solution2439();
        s.solution();
    }
}

class Solution2439 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int star = 0;
        for (int i = a;i>0;i--) {
            for (int j = 1; j <= a; j++) {
                if ((a-j-star)<=0){
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            star ++;
        }
        bw.flush();
        bw.close();
    }
}

