package platform.topcoder.beginner;

public class FriendScore {

	public static int solution(String[] friend) {
		int answer = 0;
		int length = friend.length;

		for (int i = 0; i < length; i++) {
			int count = 0;

			for (int j = 0; j < length; j++) {
				if (i == j) continue;

				if (friend[i].charAt(j) == 'Y') {
					count++;
				} else {
					for (int k = 0; k < length; k++) {
						/*
						  friend[j].charAt(k) == 'Y' -> 친구의 친구
						  friend[k].charAt(i) == 'Y' -> 직접적인 친구
						 */
						if (friend[j].charAt(k) == 'Y' && friend[k].charAt(i) == 'Y') {
							count++;
							break;
						}
					}
				}
			}
			answer = Math.max(answer, count);
		}

		return answer;
	}

	public static void main(String[] args) {
		// test case 2 : return 4
		String[] friend = new String[] {"NYNNN", "YNYNN", "NYNYN", "NNYNY", "NNNYN"};
		System.out.println(solution(friend));
	}
}