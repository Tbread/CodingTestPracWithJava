package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ11720 {
    public static void main(String[] ars) throws Exception {
        Solution11720 s = new Solution11720();
        s.solution();
    }
}

class Solution11720 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ignoredValue = br.readLine();
        String s = br.readLine();
        int answer = 0;
        for(int i=0;i<s.length();i++){
            answer += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(answer);
    }
}
