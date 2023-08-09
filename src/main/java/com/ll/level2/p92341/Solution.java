package com.ll.level2.p92341;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
	public static int[] solution(int[] fees, String[] records) {
		int lastTime = 1439;

		Map<String, Integer> parkingTime = new HashMap<>();
		Map<String, Integer> parkingStatus = new HashMap<>();

		for (String record : records) {
			String[] arr = record.split(" ");
			String[] time = arr[0].split(":");
			String carNumber = arr[1];
			String inOrOut = arr[2];
			int min = (Integer.parseInt(time[0]) * 60) + Integer.parseInt(time[1]);

			if (inOrOut.equals("IN")) {
				parkingStatus.put(carNumber, min);
			} else {
				parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + min - parkingStatus.get(carNumber));
				parkingStatus.remove(carNumber);
			}
		}

		for (String carNumber : parkingStatus.keySet()) {
			parkingTime.put(carNumber, parkingTime.getOrDefault(carNumber, 0) + lastTime - parkingStatus.get(carNumber));
		}

		int[] answer = new int[parkingTime.size()];
		List<String> carNumbers = new ArrayList<>(parkingTime.keySet());
		Collections.sort(carNumbers);

		int basicTime = fees[0];
		int basicPrice = fees[1];
		int unitTime = fees[2];
		int unitPrice = fees[3];

		for (int i = 0; i < parkingTime.size(); i++) {
			int time = parkingTime.get(carNumbers.get(i));
			int price = basicPrice;

			if (time > basicTime) {
				price += Math.ceil((double)(time - basicTime) / unitTime) * unitPrice;
			}

			answer[i] = price;
		}

		return answer;
	}
}