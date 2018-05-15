#include <stdio.h>
#include <stdlib.h>

//冒泡排序
void sort(int *nums, int numsSize)
{
    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < numsSize - i; j++)
        {
            int temp = nums[0];
            if (nums[j] < nums[j + 1])
            {
                /* code */
                temp = nums[j];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
}
/**
 * Return an array of arrays of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int **threeSum(int *nums, int numsSize, int *returnSize)
{
    int **Sum;
    Sum = (int **)malloc(sizeof(int));
    sort(nums, numsSize);
    int j, k;
    for (int i = 0; i < numsSize; i++)
    {

    }
}

int main(int argc, char const *argv[])
{
    /* code */
    int nums[] = {-1, 0, 1, 2, -1, -4};
    threeSum(nums,6,3);
    return 0;
}
