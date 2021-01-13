
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        int count = 1, num = 0;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0)
                count++;
            else
                count = 0;

            if (count == 3) {
                num++;
                count = 1;
            }

            if (i == len - 1 && count == 2)
                num++; // 最后一个格子 00
        }
        return n <= num;
    }
}
