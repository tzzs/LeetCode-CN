class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String res = countAndSay(n - 1);

        StringBuffer sb = new StringBuffer();

        int len = res.length(), count = 0;

        char tmp = res.charAt(0);

        for (int i = 0; i < len;) {
            tmp = res.charAt(i++);
            count = 1;
            
            while (i < len && tmp == res.charAt(i)) {
                i++;
                count++;
            }

            sb.append(count).append(tmp);
        }
        return sb.toString();
    }
}
