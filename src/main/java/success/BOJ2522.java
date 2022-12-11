package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2522 {
    public static void main(String[] ars) throws Exception {
        Solution2522 s = new Solution2522();
        s.solution();
    }
}

class Solution2522 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int space = a - 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= a; j++) {
                if (j > space) {
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            space--;
        }
        space = 1;
        for (int i = 1; i<=a-1;i++){
            for (int j = 1; j <=a;j++){
                if (j > space){
                    bw.write("*");
                } else {
                    bw.write(" ");
                }
            }
            bw.write("\n");
            space ++;
        }
        bw.flush();
        bw.close();
    }
}
