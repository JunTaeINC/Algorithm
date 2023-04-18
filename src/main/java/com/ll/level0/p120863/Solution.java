package com.ll.level0.p120863;


class Solution {
    public String solution(String polynomial) {
        int num = 0;
        int xNum = 0;
        String[] pol = polynomial.split(" ");
        for (String p : pol) {
            if (p.matches("^[0-9]+$")) num += Integer.parseInt(p);
            else if (p.contains("x")) {
                if (p.equals("x")) {
                    xNum++;
                } else {
                    xNum += Integer.parseInt(p.replace("x", ""));
                }
            }
        }

        if (xNum != 0 && num != 0) {
            if (xNum == 1) return String.format("x + %s", num);
            return String.format("%sx + %s", xNum, num);
        } else if (xNum == 0) {
            return num + "";
        } else {
            if (xNum == 1) return "x";
            return xNum + "x";
        }
    }
}