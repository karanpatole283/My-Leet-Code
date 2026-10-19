class Solution {
    public String mergeAlternately(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        char[] result = new char[n + m];

        int i = 0;

        while (i < n && i < m) {
            result[2 * i] = word1.charAt(i);
            result[2 * i + 1] = word2.charAt(i);
            i++;
        }

        while (i < n) {
            result[i + m] = word1.charAt(i);
            i++;
        }

        while (i < m) {
            result[i + n] = word2.charAt(i);
            i++;
        }

        return new String(result);
    }
}