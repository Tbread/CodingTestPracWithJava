package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2441 {
    public static void main(String[] ars) throws Exception {
        Solution2441 s = new Solution2441();
        s.solution();
    }
}

class Solution2441 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int star = 0;
        for(int i = 1;i<=a;i++){
            for(int j = 1;j<=a;j++){
                if (j-star<=0) {
                    bw.write(" ");
                } else {
                    bw.write("*");
                }
            }
            bw.write("\n");
            star++;
        }
        bw.flush();
        bw.close();
    }
}