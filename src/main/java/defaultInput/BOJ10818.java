package defaultInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10818 {
    public static void main(String[] ars) throws Exception {
        Solution10818 s = new Solution10818();
        s.solution();
    }
}

class Solution10818 {
    public void solution() throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String ignoredValue = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000001;
        int max = -1000001;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            if (a<min){
                min = a;
            }
            if (a>max){
                max = a;
            }
        }
        System.out.println(min+" "+max);
    }
}
