class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        if (target > letters[n - 1])
            return letters[0];

        for (char c : letters) {
            if (c > target)
                return c;
        }
        return letters[0];
    }
}
