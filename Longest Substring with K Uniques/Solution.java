import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;

        int maxLength = -1;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;

            }
            if (map.size() == k)
                maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
}
