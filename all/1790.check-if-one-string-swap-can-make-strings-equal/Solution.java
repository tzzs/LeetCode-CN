class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();

        int count = 0, m = -1, n = -1;

        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (c1 != c2) {
                count++;
                if (m == -1) {
                    m = i;
                    continue;
                }
                if (n == -1) {
                    n = i;
                }
            }
        }

        if (count == 0 || (count == 2 && s1.charAt(m) == s2.charAt(n) && s1.charAt(n) == s2.charAt(m)))
            return true;

        return false;
    }
}
