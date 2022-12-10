package prev;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class SolutionPrev {
    public static void main(String[] args) {
        SolutionPrev solution = new SolutionPrev();


    }


    public void solution(int[][] grid) {
        int gridY = grid.length;
        int gridX = grid[0].length;
        int minGrid;
        if (gridX > gridX){
            minGrid = gridX;
        } else {
            minGrid = gridY;
        }
        int maxSize = (minGrid+1)/2;
        // 최대로 나올수있는 마름모사이즈
    }

    public void checkShape1(int size,int startX,int startY,int [][] grid){
        if (grid[0].length < size+(size*2)-1){

        }
    }
    public void checkShape2(int size,int startX,int startY,int [][] grid){

    }
    public void checkShape3(int size,int startX,int startY,int [][] grid){

    }
    public void checkShape4(int size,int startX,int startY,int [][] grid){

    }


    public long solution0(long n) {
        long answer = 0;
        if (n == 1) {
            return 0;
        }
        long temp = n + 1;
        long loop = 1;
        while (loop < n) {
            answer += temp * loop;
            loop++;
        }
        return answer;
    }

    public int[] solution1(int[][] data) {
        int[] answer = new int[data.length];
        int time = 0;
        int idx = 1;
        Queue<Triple> queue = new LinkedList<>();
        for (int[] arr : data) {
            queue.add(new Triple(arr));
        }
        Triple first = queue.poll();
        time += first.pages;
        time += first.time;
        answer[0] = 1;
        while (!queue.isEmpty()) {
            Queue<Triple> clone = new LinkedList<>();
            for (Triple triple : queue) {
                clone.add(triple);
            } // 배열복사
            Triple prior = clone.poll();
            // 클론의 첫번째 값
            while (!clone.isEmpty()) {
                Triple temp = clone.poll();
                System.out.println("prior time" + prior.time);
                System.out.println("temp time" + temp.time);
                System.out.println("nowatime" + time);
                if (temp.time <= time) {
                    if (prior.pages >= temp.pages) {
                        if (prior.pages == temp.pages) {
                            if (prior.index > temp.index) {
                                prior = temp;
                                // temp의 인덱스가 더작은경우가 있을수있음
                            }
                        } else {
                            prior = temp;
                        }
                        //페이지수가 적다면 우선순위 변경
                    } else if (prior.time > time) {
                        prior = temp;
                    }
                }
            }
            System.out.println("we will remove" + prior.index);
            answer[idx] = prior.index;
            idx++;
            time += prior.pages;
            for (int i = 0; i < queue.size(); i++) {
                Triple temp = queue.poll();
                if (temp == prior) {
                    break;
                }
                queue.add(temp);
            }
        }

        return answer;
    }

    public int solution2(int[] histogram) {
        HashSet<int[]> set = new HashSet<>();
        for (int i = 0; i < histogram.length - 2; i++) {
            for (int j = i + 2; j < histogram.length; j++) {
                int[] temp = {i, j};
                set.add(temp);
            }
        }
        int[] mayAnswers = new int[set.toArray().length];
        int idx = 0;
        for (int[] temp : set) {
            int x = temp[1] - temp[0] - 1;
            int y;
            int y1 = histogram[temp[1]];
            int y2 = histogram[temp[0]];
            if (y1 > y2) {
                y = y2;
            } else {
                y = y1;
            }
            mayAnswers[idx] = x * y;
            idx++;
        }
        return Arrays.stream(mayAnswers).max().getAsInt();
    }

    class Triple {
        int index;
        int time;
        int pages;

        public Triple(int[] arr) {
            this.index = arr[0];
            this.time = arr[1];
            this.pages = arr[2];
        }

        public int getIndex() {
            return this.index;
        }
    }
}
