package success;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11054 {
    public static void main(String[] ars) throws Exception {
        Solution11054 s = new Solution11054();
        s.solution();
    }
}

class Solution11054 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int answer = 1;
        int[] nums = new int[a + 1];
        int[] incLen = new int[a + 1]; // 증가체크
        int[] decLen = new int[a + 1]; // 감소체크
        StringTokenizer st = new StringTokenizer(br.readLine());
        int idx = 0;
        while (st.hasMoreTokens()) {
            nums[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }
        incLen[0] = 1;
        decLen[0] = 1;
        for (int i = 1; i < a; i++) {
            int prevIncMax = 0;
            int prevDecMax = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    continue;
                }
                if (incLen[j] > prevIncMax && nums[j] < nums[i]) {
                    prevIncMax = incLen[j];
                    // 증가수열의 길이가 지금까지 검사한 최대 증가수열길이보다 크고 해당숫자로 증가수열을 늘릴수있으면
                }
                if (incLen[j] > prevDecMax && nums[i] < nums[j]){
                    prevDecMax = incLen[j];
                    // 감소수열의 길이가 지금까지 검사한 최대 감소수열길이보다 크고 해당숫자로 감소수열의 시작할수있으면
                }
                if (decLen[j] > prevDecMax && nums[i] < nums[j]){
                    prevDecMax = decLen[j];
                    // 감소수열의 길이가 지금까지 검사한 최대 감소수열길이보다 크고 해당숫자로 감소수열을 늘릴수있으면
                }
            }
            incLen[i] = prevIncMax+1;
            decLen[i] = prevDecMax+1;
            answer = Math.max(answer,Math.max(incLen[i],decLen[i]));
        }
        System.out.println(answer);

    }
}
