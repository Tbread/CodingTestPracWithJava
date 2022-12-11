package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2558{
    public static void main(String[] ars) throws Exception{
        Solution2558 s = new Solution2558();
        s.solution();
    }
}

class Solution2558 {
    public void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a+b);

    }
}
