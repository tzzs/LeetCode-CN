import java.lang.Math;

class Solution {
    public int myAtoi(String str) {
        int res = 0;
        int INT_MIN = (int) (-Math.pow(2, 31));
        int INT_MAX = (int) Math.pow(2, 31);
        // System.out.println(INT_MIN);
        boolean flag = true, pos = true;
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            // System.out.println(n);
            if (n == ' ' && flag) {
                continue;
            }
            if (flag && (n == '+' || n == '-')) {
                if (n == '-')
                    pos = false;
                flag = false;
            } else {
                flag = false;
                if (Character.isDigit(n)) {
                    if (pos) {
                        if (res > (INT_MAX - (n - '0')) / 10) {// 如果直接计算res*10仍有可能超出范围，所以计算最大值除10即可 不可取等号，去等号时
                                                               // 大于2147483640的数不能正常输出，因为除以10后结果都相同
                            return INT_MAX;
                        } else {
                            res = res * 10 + (n - '0');
                        }
                    } else {
                        if (res < (INT_MIN + (n - '0')) / 10) {
                            return INT_MIN;
                        } else {
                            res = res * 10 - (n - '0');
                        }
                    }
                } else {
                    return res;
                }
            }
        }
        return res;
    }
}