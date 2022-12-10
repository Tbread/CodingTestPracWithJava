package defaultInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2552 {
    public static void main(String[] ars) throws Exception {
        Solution2552 s = new Solution2552();
        s.solution();
    }
}

class Solution2552 {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bulbCount = Integer.parseInt(br.readLine());
        int maxNum = (2^bulbCount)-1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> bulbs = new HashMap<>(); // 전구번호-스위치번호
        int count = 1;
        while (st.hasMoreTokens()) {
            bulbs.put(count,Integer.valueOf(st.nextToken()));
            count++;
        }
        HashMap<Integer, List<Integer>> bulbBool = new HashMap<>();
        for (int i = 1; i <= bulbCount; i++) {
            bulbBool.put(i, new ArrayList<Integer>());
        }
        int K = Integer.parseInt(br.readLine()); //K 번째 수를 찾아야함
        for (int i = 1; i <= bulbCount; i++) {
            for (int j = 1; j <= bulbCount; j++) {
                if (i == j) {
                    continue;
                }
                int aPos = bulbs.get(i); // 스위치A
                int bPos = bulbs.get(j); // 스위치B
                if ((i < j && aPos > bPos) || (i > j && aPos < bPos)) { //전구의 위상관계과 스위치의 위상관계가 반대임
                    List<Integer> falseList = bulbBool.get(i);
                    falseList.add(j);
                    bulbBool.replace(i, falseList);
                }
            }
        }
        int num = 0;
        int kChk = 0;
        while(true){
            num ++;
            boolean flag = false;
            char[] arr = new StringBuffer(Integer.toBinaryString(num)).reverse().toString().toCharArray();
            List<Integer> existPlaces = new ArrayList<>(); // 1이 존재하는 위치
            List<Integer> chkList = new ArrayList<>();
            for(int i =0;i<arr.length;i++){
                if (arr[i]=='1'){
                    existPlaces.add(i+1);
                    chkList.add(i+1);
                }
            }
            for(int ele :existPlaces){
                chkList.remove(0);
                if (chkList.isEmpty()){
                    break;
                }
                for(int ele2:chkList){
                    if (bulbBool.get(ele).contains(ele2)){
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
            if (!flag){
                kChk += 1;
            }
            if (K==kChk){
                System.out.println(num);
            }
            if (num == maxNum){
                System.out.println(-1);
                break;
            }
        }
    }
}
