package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2445 {
    public static void main(String[] ars) throws Exception {
        Solution2445 s = new Solution2445();
        s.solution();
    }
}

class Solution2445 {
    public void solution() throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int star = 1;
        int space = a * 2 - 2;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= star; j++) {
                bw.write("*");
            }
            for (int v = 1; v <= space; v++) {
                bw.write(" ");
            }
            for (int j = 1; j <= star; j++) {
                bw.write("*");
            }
            bw.write("\n");
            star += 1;
            space -= 2;
        }
        star -= 2;
        space += 4;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= star; j++) {
                bw.write("*");
            }
            for (int v = 1; v <= space; v++) {
                bw.write(" ");
            }
            for (int j = 1; j <= star; j++) {
                bw.write("*");
            }
            bw.write("\n");
            star -= 1;
            space += 2;
        }
        bw.flush();
        bw.close();

    }
}
