package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ8393 {
    public static void main(String[] ars) throws Exception {
        Solution8393 s = new Solution8393();
        s.solution();
    }
}

class Solution8393 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i =1;i<=a;i++){
            answer += i;
        }
        System.out.println(answer);
    }
}

