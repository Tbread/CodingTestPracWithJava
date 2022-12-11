package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10991 {
    public static void main(String[] ars) throws Exception {
        Solution10991 s = new Solution10991();
        s.solution();
    }
}

class Solution10991 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int starCnt = 1;
        int blankCnt = a - 1;
        String star = "*";
        String blank = " ";
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= blankCnt; j++) {
                bw.write(blank);
            }
            for (int v = 1; v <= starCnt; v++) {
                if (v % 2 == 1) {
                    bw.write(star);
                } else {
                    bw.write(blank);
                }
            }
            bw.write("\n");
            blankCnt--;
            starCnt += 2;
        }
        bw.flush();
        bw.close();
    }
}
