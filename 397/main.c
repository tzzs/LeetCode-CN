#include <stdio.h>
#include <stdlib.h>

int time = 0;

int replace(long n);

int integerReplacement(long n)
{
    replace(n);
    return time;
}

int replace(long n)
{
    if (n == 1)
    {
        return n;
    }
    else
    {
        time++;
        if (n % 2 == 0)
        {
            n = n / 2;
            return integerReplacement(n);
        }
        else
        {
            n = n - 1;
            return integerReplacement(n);
        }
    }
}

int main()
{
    int t = 7;
    integerReplacement(t);
    printf("%d", time);
    return 0;
}