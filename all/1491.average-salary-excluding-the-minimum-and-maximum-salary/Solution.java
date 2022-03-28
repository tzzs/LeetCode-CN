class Solution {
    public double average(int[] salary) {
        int n = salary.length;

        double count = 0;
        Arrays.sort(salary);
        for (int i = 1; i < n - 1; i++) {
            count += salary[i];
        }
        return count / (n - 2);
    }
}
