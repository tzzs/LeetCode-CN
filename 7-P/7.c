#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int reverse(int x)
{
    int max = (int)pow(2, 31) - 1;
    int min = -((int)pow(2, 31) + 1);

    if (max <= x || min >= x)
    {
        return 0;
    }

    // printf("%d %d\n", max, min);

    int absx = abs(x);
    // printf("%d\n", absx);
    double result = 0, m;

    while (absx >= 10)
    {
        result *= 10;
        m = absx % 10;
        result += m;
        absx /= 10;
    }

    result *= 10;
    result += absx % 10;

    // printf("\nresult:%.0f\n", result);

    if (result > max)
    {
        result = 0;
    }

    if (x >= 0)
    {
        return (int)result;
    }
    else
    {
        return (int)result * -1;
    }
}

int main(int argc, char const *argv[])
{
    int result = reverse(12346); //1534236469
    printf("%d", result);
    return 0;
}
