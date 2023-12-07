package platform.baekjoon.silver.p1439;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] oneArr = input.split("1");
        String[] zeroArr = input.split("0");

        int one = 0;
        int zero = 0;

        for (String oo : oneArr) {
            if (!oo.isBlank()) one++;
        }

        for (String zz : zeroArr) {
            if (!zz.isBlank()) zero++;
        }

        System.out.println(Math.min(one, zero));
    }
}