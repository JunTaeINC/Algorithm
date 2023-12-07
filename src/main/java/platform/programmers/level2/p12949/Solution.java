package platform.programmers.level2.p12949;

class Solution {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int rows = arr1.length;
		int columns = arr2[0].length;
		int[][] result = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				for (int k = 0; k < arr1[0].length; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}
		return result;
	}
}