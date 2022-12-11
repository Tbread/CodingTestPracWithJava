package fail;

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
        long maxNum = (long) (Math.pow(2,bulbCount) - 1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> bulbs = new HashMap<>(); // 전구번호-스위치번호
        int count = 1;
        while (st.hasMoreTokens()) {
            bulbs.put(count, Integer.valueOf(st.nextToken()));
            count++;
        }
        HashMap<Integer, List<Integer>> bulbBool = new HashMap<>();
        for (int i = 1; i <= bulbCount; i++) {
            bulbBool.put(i, new ArrayList<>());
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
//        System.out.println(bulbBool);
        long num = 0;
        int kChk = 0;
        while (true) {
            boolean flag = false;
            char[] arr = Long.toBinaryString(num).toCharArray();
            List<Integer> existPlaces = new ArrayList<>(); // 1이 존재하는 위치
            List<Integer> chkList = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '1') {
                    existPlaces.add(i + 1);
                    chkList.add(i + 1);
                }
            }
//            System.out.println("--------------");
//            System.out.println("만드려는수: "+num);
            for (int ele : existPlaces) {
                chkList.remove(0);
                if (chkList.isEmpty()) {
                    break;
                }
                for (int ele2 : chkList) {
//                    System.out.println("확인중인 스위치번호: "+ele);
//                    System.out.println("확인중인 스위치와 겹치는지 확인할 번호: "+ele2);
//                    System.out.println("두개의 스위치가 겹치는가?: "+bulbBool.get(ele).contains(ele2));
                    if (bulbBool.get(ele).contains(ele2)) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                kChk += 1;
//                System.out.println("만드는데 성공한 수: "+num);
//                System.out.println("성공한 횟수: "+kChk);
            } else {
//                System.out.println("만드는데 실패한 수: "+num);
            }
            if (K == kChk) {
//                System.out.println("answer: "+num);
                System.out.println(num);
                break;
            }
            if (num == maxNum) {
                System.out.println(-1);
                break;
            }
            num++;
        }
    }
}

//전구의 수가 많을때 메모리초과, 다른방법을 찾아봐야할것같음
//이제보니 2522를 풀어야하는데 수준에안맞는 2552를 잘못눌렀다. 실력이늘면 다시도전