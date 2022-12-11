package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2446 {
    public static void main(String[] ars) throws Exception {
        Solution2446 s = new Solution2446();
        s.solution();
    }
}

class Solution2446 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int space = 0;
        int star = 2 * a - 1;
        for (int i = 1; i < a; i++) {
            for (int v = 1; v <= space; v++) {
                bw.write(" ");
            }
            for (int v = 1; v <= star; v++) {
                bw.write("*");
            }
            bw.write("\n");
            space += 1;
            star -= 2;
        }
        for (int i = 1; i <= a; i++) {
            for (int v = 1; v <= space; v++) {
                bw.write(" ");
            }
            for (int v = 1; v <= star; v++) {
                bw.write("*");
            }
            bw.write("\n");
            space -= 1;
            star += 2;
        }
        bw.flush();
        bw.close();
    }
}
