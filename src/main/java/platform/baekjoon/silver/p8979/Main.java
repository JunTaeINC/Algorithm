package platform.baekjoon.silver.p8979;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = sc.nextInt();

        List<State> states = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();

            states.add(new State(num, gold, silver, bronze));
        }

        Collections.sort(states);

        List<Integer> rank = new ArrayList<>();
        rank.add(1);

        for (int i = 1; i < N; i++) {
            State prev = states.get(i - 1);
            State now = states.get(i);

            if (prev.gold == now.gold && prev.silver == now.silver && prev.bronze == now.bronze) {
                rank.add(rank.get(rank.size() - 1));
            } else {
                rank.add(rank.size() + 1);
            }
        }

        for (int i = 0; i < N; i++) {
            if (states.get(i).id == target) {
                System.out.println(rank.get(i));
            }
        }
    }

    static class State implements Comparable<State> {
        private final int id;
        private final int gold;
        private final int silver;
        private final int bronze;

        public State(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(State state) {
            if (this.gold == state.gold) {
                if (this.silver == state.silver) {
                    return state.bronze - this.bronze;
                } else {
                    return state.silver - this.silver;
                }
            } else {
                return state.gold - this.gold;
            }
        }
    }
}