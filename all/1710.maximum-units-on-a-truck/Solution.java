import java.util.Comparator;
import java.util.Arrays;

class Solution {
    // public int maximumUnits(int[][] boxTypes, int truckSize) {
    // // System.out.println(Arrays.deepToString(boxTypes));

    // Arrays.sort(boxTypes, new Comparator<int[]>() {
    // public int compare(int[] a, int[] b) {
    // return b[1] - a[1];
    // }
    // });

    // System.out.println(Arrays.deepToString(boxTypes));
    // int count = 0, num = 0;

    // for (int i = 0; i < boxTypes.length;i++) {

    // for (int j = 0; j < boxTypes[i][0] && num < truckSize; j++) {
    // count += boxTypes[i][1];
    // num++;
    // }
    // }
    // // System.out.println(count);
    // return count;
    // }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // System.out.println(Arrays.deepToString(boxTypes));

        Arrays.sort(boxTypes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return b[1] - a[1];
            }
        });

        // System.out.println(Arrays.deepToString(boxTypes));
        int count = 0, n = boxTypes.length;
        for (int i = 0; i < n && truckSize > 0; i++) {
            int cur = Math.min(boxTypes[i][0], truckSize);
            count += cur * boxTypes[i][1];
            truckSize -= cur;
        }

        return count;
    }

    public static void main(String[] args) {
        int boxTypes[][] = { { 1, 3 }, { 2, 2 }, { 3, 1 } };
        Solution solution = new Solution();
        System.out.println(solution.maximumUnits(boxTypes, 4));
    }
}
