class Solution {
    public boolean canReorderDoubled(int[] arr) {
        int n = arr.length, ai = 0, bi = 0;
        Arrays.sort(arr);

        Map<Double, Integer> map = new HashMap<>();

        for (int j : arr) {
            double i = Double.valueOf(j);
            if (map.containsKey(i)) {
                int count = map.get(i);
                if (i != 0)
                    map.put(i, count + 1);
                else {
                    if (count == 1)
                        map.remove(i);
                    else
                        map.put(i, 1);
                }
            } else {
                double k = i < 0 ? i * 2 : i / 2;
                int count = map.getOrDefault(k, 0);
                if (count > 0) {
                    if (count > 1)
                        map.put(k, count - 1);
                    else
                        map.remove(k);
                } else {
                    map.put(i, 1);
                }
            }
        }

        return map.size() == 0;
    }
}
