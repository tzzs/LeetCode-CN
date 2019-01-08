class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int a : A) {
            if (dict.containsKey(a)) {
                return a;
            } else {
                dict.put(a, 1);
            }
        }
        return 0;
    }
}