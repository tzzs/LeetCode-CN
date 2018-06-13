#include <stdio.h>
#include <math.h>
double myPow(double x, int n)
{
    if (n == 0)
    {
        return 1;
    }
    else
    {
        if (n > 0)
        {
            double k = 1;
            for (int i = 0; i < n; i++)
            {
                k *= x;
            }
            return k;
        }
        else
        {
            double k = 1;
            for (int i = 0; i < -n; i++)
            {
                k *= x;
            }
            return 1 / k;
        }
    }
}

int main(int argc, char const *argv[])
{
    double r = myPow(2, -2);
    printf("%f", r);
    return 0;
}
