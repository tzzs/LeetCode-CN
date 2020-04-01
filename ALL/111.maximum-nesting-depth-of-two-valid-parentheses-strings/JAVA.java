/**
 * (()())
 * ABBBBA
 * 121210
 * 
 * 左括号，奇数位置给A，偶数位置给B
 * 右括号，偶数位置给A，奇数位置给B，这样B可以快速配对，降低深度
 */
class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int res[] = new int[seq.length()];
        int index = 0;
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '(') {
                index++;
                if (index % 2 == 0) {
                    res[i] = 1;
                }
            } else {
                index--;
                if (index % 2 != 0) {
                    res[i] = 1;
                }
            }
        }
        return res;
    }
}
