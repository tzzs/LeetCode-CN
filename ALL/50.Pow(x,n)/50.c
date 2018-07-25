#include <stdio.h>
#include <math.h>
double myPow(double x, int n)
{
    double result = 1, a = x;
    int max = (unsigned)(-1) >> 1;
    int min = ~max;
    if (x == 0)
    {
        return 0;
    }

    if (x == 1 || n == 0)
    {
        return 1;
    }

    if (n == min)
    {
        return 0;
    }
    if (n > 1)
    {
        while (n > 1)
        {
            if (n % 2 != 0)
            {
                result *= a;
            }
            a *= a;
            n /= 2;
        }
        return a * result;
    }
    else if (n == 1)
    {
        return x;
    }
    else if (n == 0)
    {
        return 1;
    }
    else
    {
        int an = -n;
        while (an > 1)
        {
            if (an % 2 == 1)
            {
                result *= a;
            }
            a *= a;
            an /= 2;
        }
        return 1 / (a * result);
    }
}

int main(int argc, char const *argv[])
{
    double r = myPow(2, -2147483648);
    printf("%f", r);
    return 0;
}
