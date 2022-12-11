package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ10992 {
    public static void main(String[] ars) throws Exception {
        Solution10992 s = new Solution10992();
        s.solution();
    }
}

class Solution10992 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int maxCnt = 2 * a - 1;
        int starCnt = 1;
        int spaceCnt = a - 1;
        String star = "*";
        String blank = " ";
        for (int i = 1; i < a; i++) {
            for (int j = 1; j <= spaceCnt; j++) {
                bw.write(blank);
            }
            for (int j = 1;j <= starCnt;j++){
                if (j==1||j==starCnt){
                    bw.write(star);
                } else {
                    bw.write(blank);
                }
            }
            bw.write("\n");
            spaceCnt -= 1;
            starCnt += 2;
        }
        for (int i = 1; i<=maxCnt;i++){
            bw.write(star);
        }
        bw.flush();
        bw.close();
    }
}
