#include <stdio.h>

int minimumTotal(int **triangle, int triangleRowSize, int *triangleColSizes)
{
    int result = triangle[0][0];
    int k = 0;
    for (int i = 0; i < triangleRowSize - 1; i++)
    {

        if (triangle[i + 1][k] <= triangle[i + 1][k + 1])
        {
            result += triangle[i + 1][k];
        }
        else
        {
            result += triangle[i + 1][k + 1];
        }
    }
    return result;
}

int main(int argc, char const *argv[])
{
    /* code */
    int triangle[4][4] = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
    int triangleColSizes[4] = {1, 2, 3, 4};
    int r = minimumTotal((int **)triangle, 4, (int *)triangleColSizes);
    printf("%d", r);
    return 0;
}
