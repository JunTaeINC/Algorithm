package platform.lecture.step_1;

class P_1 {
    public String solution(String string) {
        String answer = "" + string.charAt(0);
        int count = 0;
        char target = string.charAt(0);

        for (int i = 0; i < string.length(); i++) {
            if (target == string.charAt(i)) {
                count++;
            } else {
                if (count == 1) {
                    answer += string.charAt(i);
                } else {
                    answer += String.valueOf(count) + string.charAt(i);
                }

                target = string.charAt(i);
                count = 1;
            }
        }

        if (count > 1) {
            answer += count;
        }

        return answer;
    }

    public static void main(String[] args) {
        P_1 T = new P_1();
        System.out.println(T.solution("KKHSSSSSSSE")); // K2HS7E
        System.out.println(T.solution("AAABCCCDD")); // A3BC3D2
    }
}