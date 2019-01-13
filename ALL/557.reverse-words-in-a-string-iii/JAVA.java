class Solution {
    public String reverseWords(String s) {
        String[] ss = s.split(" ");
        StringBuilder sb = new StringBuilder(ss.length);
        for (int i = 0; i < ss.length; i++) {
            sb.append(new StringBuilder(ss[i]).reverse().toString());
            sb.append(i + 1 < ss.length ? " " : "");
        }
        return sb.toString();
    }
}