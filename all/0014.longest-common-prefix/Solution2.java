class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        if (n == 1)
            return strs[0];

        String res = getCommonPreFix(strs[0], strs[1]);
        for (int i = 2; i < n; i++) {
            res = getCommonPreFix(res, strs[i]);
            if (res.length() == 0)
                return res;
        }

        return res;
    }

    String getCommonPreFix(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        int n = n1 > n2 ? n2 : n1;
        if (n == 0)
            return "";

        int i = 0;
        for (i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                break;
        }

        return s1.substring(0, i);
    }
}
