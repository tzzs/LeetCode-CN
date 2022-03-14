class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        int idx = 0, max = list1.length + list2.length - 2;
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < list2.length; i++) {
            String cur = list2[i];
            if (map.containsKey(cur)) {
                idx = i + map.get(cur);
                if (idx < max) {
                    list.clear();
                    max = idx;
                    list.add(cur);
                } else if (idx == max) {
                    list.add(cur);
                }
            }
        }
        String[] s = new String[list.size()];
        list.toArray(s);
        return s;
    }
}
