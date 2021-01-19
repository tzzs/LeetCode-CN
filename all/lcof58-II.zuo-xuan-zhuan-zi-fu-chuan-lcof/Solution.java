class Solution {
    public String reverseLeftWords(String s, int n) {
        int k = n % s.length();

        return s.substring(k, s.length()) + s.substring(0, k);
    }
}
