package success;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9465 {
    public static void main(String[] ars) throws Exception {
        Solution9465 s = new Solution9465();
        s.solution();
    }
}

class Solution9465 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        for (int ign = 0; ign < repeat; ign++) {
            int cnt = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[][] arr = new int[2][cnt+1];
            int[][] scores = new int[2][cnt+1];
            int idx = 0;
            while (st.hasMoreTokens()) {
                arr[0][idx] = Integer.parseInt(st.nextToken());
                idx++;
            }
            st = new StringTokenizer(br.readLine());
            idx = 0;
            while (st.hasMoreTokens()) {
                arr[1][idx] = Integer.parseInt(st.nextToken());
                idx++;
            }
            scores[0][0] = arr[0][0];
            scores[1][0] = arr[1][0];
            scores[0][1] = arr[1][0] + arr[0][1];
            scores[1][1] = arr[0][0] + arr[1][1];
            for (int j = 2; j < cnt; j++) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        int maxNum = Math.max(scores[1][j - 2], scores[1][j - 1]);
                        scores[i][j] = maxNum + arr[i][j];

                    } else {
                        int maxNum = Math.max(scores[0][j - 2], scores[0][j - 1]);
                        scores[i][j] = maxNum + arr[i][j];
                    }
                }
            }
            int answer = 0;
            for (int i = 0; i < cnt; i++) {
                answer = Math.max(Math.max(scores[0][i], scores[1][i]), answer);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}
