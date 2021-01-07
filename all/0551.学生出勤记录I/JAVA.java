class Solution {
    public boolean checkRecord(String s) {
        int countA = 0, cL = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                countA++;
            }
            if (s.charAt(i) == 'L') {
                cL++;
            } else {
                cL = 0;
            }
            if (countA > 1 || cL > 2) {
                return false;
            }
        }
        return true;
    }
}