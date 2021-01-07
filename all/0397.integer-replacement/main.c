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
        return 1;
    }
    else
    {
        time++;
        if (n % 2 == 0)
        {
            printf("%d ", n / 2);
            return integerReplacement(n / 2);
        }
        else
        {
            printf("%d ", n - 1);
            return integerReplacement(n - 1);
        }
    }
}

int main()
{
    int t = 7;
    integerReplacement(t);
    printf("\n%d", time);
    return 0;
}