package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ1463 {
    public static void main(String[] ars) throws Exception {
        Solution1463 s = new Solution1463();
        s.solution();
    }
}

class Solution1463 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] intArr = new int[10000000];
        intArr[2] = 1;
        intArr[3] = 1;
        intArr[4] = 2;
        for (int i = 5; i <= a; i++) {
            int tempA = intArr[i-1]+1;
            int tempB = (int) Math.pow(10,6);
            int tempC = (int) Math.pow(10,6);
            if (i%3==0){
                tempB = intArr[i/3]+1;
            }
            if (i%2==0){
                tempC = intArr[i/2]+1;
            }
            intArr[i] = Math.min(Math.min(tempA,tempB),tempC);
        }
        System.out.println(intArr[a]);
    }
}
