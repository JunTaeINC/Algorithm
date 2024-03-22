package platform.baekjoon.silver.p1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            Score[] scores = new Score[N];

            StringTokenizer st;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                scores[i] = new Score(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }
            Arrays.sort(scores);

            int passCount = 1, minScore = scores[0].interviewScore;
            for (int i = 1; i < scores.length; i++) {
                if (scores[i].interviewScore <= minScore) {
                    passCount++;
                    minScore = scores[i].interviewScore;
                }
            }

            System.out.println(passCount);
        }
    }

    static class Score implements Comparable<Score> {
        int documentScore;
        int interviewScore;

        public Score(int documentScore, int interviewScore) {
            this.documentScore = documentScore;
            this.interviewScore = interviewScore;
        }

        @Override
        public int compareTo(Score other) {
            return Integer.compare(this.documentScore, other.documentScore);
        }
    }
}