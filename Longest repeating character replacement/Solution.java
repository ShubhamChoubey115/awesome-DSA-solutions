class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        int[] freq = new int[26];

int left = 0;

int maxFreq = 0;

int maxLength = 0;

for (int right =0; right < s.length(); right++) {

freq[s.charAt(right) - 'A']++;

maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

//Characters to replace window size most frequent char count 
while ((right-left +1)- maxFreq > k) {

freq[s.charAt(left)-'A']--;

left++;
}
maxLength = Math.max(maxLength, right -left + 1);
}
return maxLength;
    }
}
