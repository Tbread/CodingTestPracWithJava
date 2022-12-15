import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ2579 {
    public static void main(String[] ars) throws Exception {
        Solution2579 s = new Solution2579();
        s.solution();
    }
}

class Solution2579 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] scores = new int[a];
        int[] sumScore = new int[a];
        for (int i = 0; i < a; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        sumScore[0] = scores[0];
        int maxScore = sumScore[0];
        if (sumScore.length >= 2) {
            sumScore[1] = scores[1] + scores[0];
            maxScore = sumScore[1];
        }
        if (a==3){
            sumScore[1] = scores[1];
            maxScore = Math.max(scores[0],scores[1]);
        }
        for (int i = 2; i < a; i++) {
            if (i == a - 2) {
                sumScore[i] = sumScore[i - 2] + scores[i];
                //한계단전에서왔고 현재계단이 마지막 계단바로전이면 마지막계단에 도착을못함 (n-2 누계 + n점수)
            } else if (i == 2) {
                sumScore[i] = Math.max(scores[0] + scores[2], scores[1] + scores[2]);
            } else {
                sumScore[i] = Math.max(sumScore[i - 3] + scores[i - 1] + scores[i], sumScore[i - 2] + scores[i]);
                //전전전거밟아서 전거밟고 이번거밟고옴 (n-3누계 + n-1 + n 점수) , 걍두계단전에서옴 (n-2 누계 + n점수)
            }
            maxScore = Math.max(sumScore[i], maxScore);
        }
        System.out.println(maxScore);

    }

}
