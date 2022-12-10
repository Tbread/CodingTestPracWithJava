package defaultInput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ2442 {
    public static void main(String[] args) throws Exception{
        Solution2442 s = new Solution2442();
        s.solution();
    }
}

class Solution2442 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int star = 1;
        int max = a * 2 - 1;
        int space;
        for (int i = 1;i<=a;i++){
            space = (max - star)/2;
            for(int j = 1;j<=space;j++){
                bw.write(" ");
            }
            for (int v = 1; v<=star;v++){
                bw.write("*");
            }
            bw.write("\n");
            star += 2;
        }


        bw.flush();
        bw.close();
    }
}