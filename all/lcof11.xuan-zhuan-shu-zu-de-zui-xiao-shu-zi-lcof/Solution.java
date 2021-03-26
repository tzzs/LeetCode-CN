
class Solution {
    public int minArray(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max)
                max = num;
            if (num < max)
                return num;
        }

        return numbers[0];
    }
}
