class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int ret = 0;

        Set<Character> set = new HashSet<Character>();

        int right = 0;
        for (int i = 0; i < n && right < n; i++) {
            if (i > 0) {
                set.remove(s.charAt(i - 1));

                if (set.contains(s.charAt(right))) {
                    continue;
                }
            }

            while (right < n && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }

            ret = Math.max(ret, right - i);
        }

        return ret;
    }
}
