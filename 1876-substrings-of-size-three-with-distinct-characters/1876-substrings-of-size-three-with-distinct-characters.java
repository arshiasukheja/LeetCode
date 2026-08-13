class Solution {
    public int countGoodSubstrings(String s) {

        int[] freq = new int[26];
        int l = 0;
        int count = 0;

        for (int r = 0; r < s.length(); r++) {

            freq[s.charAt(r) - 'a']++;

            if (r - l + 1 > 3) {
                freq[s.charAt(l) - 'a']--;
                l++;
            }

            if (r - l + 1 == 3) {

                if (freq[s.charAt(r) - 'a'] == 1 &&
                    freq[s.charAt(r - 1) - 'a'] == 1 &&
                    freq[s.charAt(r - 2) - 'a'] == 1) {

                    count++;
                }
            }
        }

        return count;
    }
}