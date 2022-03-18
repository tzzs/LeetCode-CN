import java.util.ArrayList;
import java.util.Arrays;

class Bank {
    private long[] moneyList;
    private int n;

    public Bank(long[] balance) {
        this.moneyList = balance;
        this.n = balance.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 > n || account2 > n || this.moneyList[account1 - 1] < money)
            return false;

        this.moneyList[account1 - 1] -= money;
        this.moneyList[account2 - 1] += money;
        return true;

    }

    public boolean deposit(int account, long money) {
        if (account > n)
            return false;
        this.moneyList[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account > n || this.moneyList[account - 1] < money)
            return false;

        this.moneyList[account - 1] -= money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
