package platform.baekjoon.silver.p3758;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int teamCount = Integer.parseInt(st.nextToken());
            int problemCount = Integer.parseInt(st.nextToken());
            int myTeam = Integer.parseInt(st.nextToken());
            int logCount = Integer.parseInt(st.nextToken());

            List<Team> teams = new ArrayList<>();

            int[][] totalScore = new int[teamCount + 1][problemCount + 1];
            int[] submitCount = new int[teamCount + 1];
            int[] lastSubmit = new int[teamCount + 1];

            for (int j = 0; j < logCount; j++) {
                int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                int teamId = temp[0], problemNumber = temp[1], score = temp[2];

                submitCount[teamId]++;
                lastSubmit[teamId] = j;
                if (totalScore[teamId][problemNumber] != 0) {
                    totalScore[teamId][problemNumber] = Math.max(totalScore[teamId][problemNumber], score);
                } else {
                    totalScore[teamId][problemNumber] = score;
                }
            }

            for (int j = 1; j <= teamCount; j++) {
                int sum = 0;
                for (int p = 1; p <= problemCount; p++) {
                    sum += totalScore[j][p];
                }
                teams.add(new Team(j, sum, submitCount[j], lastSubmit[j]));
            }

            Collections.sort(teams);

            for (int k = 0; k < teams.size(); k++) {
                if (teams.get(k).id == myTeam) {
                    System.out.println(k + 1);
                    break;
                }
            }
        }
    }

    static class Team implements Comparable<Team> {

        int id;
        int score;
        int submitCount;
        int lastSubmit;

        public Team(int id, int score, int submitCount, int lastSubmit) {
            this.id = id;
            this.score = score;
            this.submitCount = submitCount;
            this.lastSubmit = lastSubmit;
        }

        @Override
        public int compareTo(Team team) {
            if (team.score == this.score) {
                if (team.submitCount == this.submitCount) {
                    return this.lastSubmit - team.lastSubmit;
                }

                return this.submitCount - team.submitCount;
            }

            return team.score - this.score;
        }
    }
}