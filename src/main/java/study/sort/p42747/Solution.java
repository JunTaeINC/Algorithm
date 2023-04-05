package study.sort.p42747;

import java.util.Arrays;

public class Solution {
    public int solution(int[] citations) {
        // n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값
        // 5편 중, 3번 이상 인용된 논문이 3편 이상이고 나머지 논문이 3번 이하 인용되었다면 3의 최댓값
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            // c = [0, 1, 3, 5, 6]
            //  i = 0  1  2  3  4
            //max = 5  4  3  2  1 // 최대 h_index -> 최소 h_index
            //min = 1  2  3  4  5
            int h_Index = citations.length - i; // 인용된 논문
            int min_Index = i; // 나머지 논문
            int number = citations[i];
            //h번 이상 인용된 논문이 h편 이상이고 && 나머지 논문이 h번 이하 인용
            if (number >= h_Index && min_Index <= h_Index) {
                answer = h_Index;
                break;
            }
        }

        return answer;
    }

}