package platform.baekjoon.gold.p19942;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static int N;
    static int cost = Integer.MAX_VALUE;
    static int[] target;
    static boolean[] isVisited;
    static Nutrient[] nutrients;
    static List<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        nutrients = new Nutrient[N];
        isVisited = new boolean[N];

        target = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < N; i++) {
            nutrients[i] = Nutrient.of(br.readLine());
        }

        backtracking(0, 0, 0, 0, 0, 0);

        if (cost == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(cost);
            for (int a : answer) System.out.print(a + " ");
        }
    }

    public static void backtracking(int index, int p, int f, int c, int v, int amount) {
        if (p >= target[0] && f >= target[1] && c >= target[2] && v >= target[3]) {
            check(amount);
            return;
        }

        if (index >= N || amount >= cost) return;

        isVisited[index] = true;
        backtracking(index + 1, p + nutrients[index].protein, f + nutrients[index].fat,
                c + nutrients[index].crab, v + nutrients[index].vitamin, amount + nutrients[index].price);
        isVisited[index] = false;
        backtracking(index + 1, p, f, c, v, amount);
    }

    private static void check(int amount) {
        if (amount < cost) {
            cost = amount;
            answer.clear();
            for (int i = 0; i < N; i++) {
                if (isVisited[i]) answer.add(i + 1);
            }
        }
    }
}

class Nutrient {
    int protein, fat, crab, vitamin, price;

    public Nutrient(int protein, int fat, int crab, int vitamin, int price) {
        this.protein = protein;
        this.fat = fat;
        this.crab = crab;
        this.vitamin = vitamin;
        this.price = price;
    }

    public static Nutrient of(String food) {
        int[] nutrient = Arrays.stream(food.split(" ")).mapToInt(Integer::parseInt).toArray();

        return new Nutrient(nutrient[0], nutrient[1], nutrient[2], nutrient[3], nutrient[4]);
    }
}