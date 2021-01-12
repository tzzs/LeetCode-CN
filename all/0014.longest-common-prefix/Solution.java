class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;

        if (n == 0 || strs[0].length() == 0)
            return "";

        if (n == 1)
            return strs[0];

        String s = "";
        int k = 0;
        while (k < strs[0].length()) {
            char cur = strs[0].charAt(k);
            for (int i = 0; i < n; i++) {
                if (k >= strs[i].length() || cur != strs[i].charAt(k))
                    return strs[0].substring(0, k);
            }
            k++;
        }
        return strs[0].substring(0, k);
    }
}
