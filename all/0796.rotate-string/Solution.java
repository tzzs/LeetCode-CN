class Solution {
    public boolean rotateString(String s, String goal) {
        int sl = s.length();
        int sg = goal.length();

        return (sl == sg) && (s + s).contains(goal);
    }
}
