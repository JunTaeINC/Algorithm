package platform.baekjoon.silver.p1541;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split("-");

        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            String[] tempArr = arr[i].split("\\+");

            for (String t : tempArr) {
                temp += Integer.parseInt(t);
            }

            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }

        System.out.println(answer);
        sc.close();
    }
}