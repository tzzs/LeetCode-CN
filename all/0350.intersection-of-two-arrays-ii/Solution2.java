class Solution2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;

        if (n1 < n2) {
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        int[] list = new int[n1 > n2 ? n2 : n1];
        int count = 0;

        for (int i = 0; i < n1; i++) {
            hm.put(nums1[i], (hm.containsKey(nums1[i]) ? hm.get(nums1[i]) : 0) + 1);
        }

        for (int i = 0; i < n2; i++) {
            if (hm.containsKey(nums2[i]) && hm.get(nums2[i]) > 0) {
                hm.put(nums2[i], hm.get(nums2[i]) - 1);
                // list.add(nums2[i]);

                list[count++] = nums2[i];
            }
        }

        return Arrays.copyOfRange(list, 0, count);
    }
}
