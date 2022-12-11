package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1924 {
    public static void main(String[] ars) throws Exception {
        Solution1924 s = new Solution1924();
        s.solution();
    }
}

class Solution1924 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int month = Integer.parseInt(st.nextToken());
        int days = Integer.parseInt(st.nextToken());
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] DOW = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int passedDays = 0;
        if (month == 1) {
            passedDays = days - 1;
        } else {
            for (int i = 1; i < month; i++) {
                passedDays += monthDays[i-1];
            }
            passedDays += days - 1;
        }
        System.out.println(DOW[passedDays%7]);

    }
}
