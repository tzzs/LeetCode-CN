#include <math.h>

class Solution
{
public:
    int fib(int n)
    {
        if (n < 2)
            return n;
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++)
        {
            b = a + b;
            a = b - a;
            b = fmod(b, 1000000007);
        }
        return b;
    }
};
