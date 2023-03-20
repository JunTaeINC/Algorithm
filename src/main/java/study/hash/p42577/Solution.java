package study.hash.p42577;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public boolean solution(String[] phone_book) {
        boolean bool = true;
        if (phone_book.length == 1) return true;
        List<String> phoneList = new ArrayList<>(List.of(phone_book));
        for (int i = 0; i < phone_book.length; i++) {
            phoneList.remove(phone_book[i]);
            String phoneStr = phoneList.stream().collect(Collectors.joining()).toString();
            if (phoneStr.contains(phone_book[i])) {
                bool = false;
                break;
            }
        }
        return bool;
    }
}