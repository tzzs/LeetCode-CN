import java.util.Arrays;

// class Solution {
//     public List<Boolean> prefixesDivBy5(int[] A) {
//         int n = A.length;

//         long cur = 0;

//         List<Boolean> list = new ArrayList<Boolean>();

//         for (int i = 0; i < n; i++) {
//             if (i == 0) {
//                 cur = A[0];
//             } else {
//                 cur <<= 1;
//                 cur += A[i];
//             }
//             list.add(cur % 5 == 0);
//             cur %= 5;
//         }
//         return list;
//     }
// }

class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int n = A.length;
        int cur = 0;
        Boolean[] list = new Boolean[n];
        Arrays.fill(list, false);

        for (int i = 0; i < n; i++) {
            cur = cur * 2 + A[i];
            if (cur % 5 == 0) {
                list[i] = true;
            }
            cur %= 5;
        }
        return Arrays.asList(list);
    }
}
