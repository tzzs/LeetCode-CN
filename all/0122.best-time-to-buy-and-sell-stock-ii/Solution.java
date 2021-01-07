class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if (n == 1)
            return 0;
        else if (n == 2)
            return prices[1] > prices[0] ? prices[1] - prices[0] : 0;

        int flag = 0, price = 0, buyPrice = 0;

        for (int i = 0; i < n - 1; i++) {
            if (flag == 0 && prices[i] <= prices[i + 1]) {
                buyPrice = prices[i];
                flag = 1;
            }

            if (flag == 1 && (prices[i] > prices[i + 1] || i + 1 == n - 1) && buyPrice <= prices[i]) {
                if (i + 1 == n - 1 && prices[i] < prices[i + 1]) {
                    price += prices[i + 1] - buyPrice;
                    break;
                }

                price += prices[i] - buyPrice;
                buyPrice = 0;
                flag = 0;
            }
        }

        return price;
    }
}
