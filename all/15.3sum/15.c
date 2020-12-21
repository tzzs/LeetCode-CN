#include <stdio.h>
#include <stdlib.h>

//冒泡排序
void sort(int *nums, int numsSize)
{
    for (int i = 0; i < numsSize - 1; i++)
    {

        for (int j = 0; j < numsSize - i - 1; j++)
        {
            int temp = nums[0];
            if (nums[j] > nums[j + 1])
            {
                temp = nums[j + 1];
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
    int **Sum = (int **)malloc(sizeof(int *) * (numsSize * (numsSize - 1) * (numsSize - 2)) / 6);

    if (numsSize < 3)
    {
        *returnSize = 0;
        return Sum;
    }
    sort(nums, numsSize);

    int j, k, top = 0;

    //排序输出测试
    for (int i = 0; i < numsSize; i++)
    {
         printf("%d %d\n ", i, nums[i]);
    }

    for (int i = 0; i < numsSize - 2; i++)
    {
        if (i > 0 && nums[i - 1] == nums[i])
        {
            continue;
        }
        j = i + 1;
        k = numsSize - 1;

        while (j < k)
        {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum < 0)
            {
                j++;

                while (nums[j] == nums[j - 1] && j < k)
                {
                    j++;
                }
            }
            else if (sum > 0)
            {
                k--;

                while (nums[k] == nums[k + 1] && j < k)
                {
                    k--;
                }
            }
            else
            {
                Sum[top] = (int *)malloc(sizeof(int)*3);
                Sum[top][0] = nums[i];
                Sum[top][1] = nums[j];
                Sum[top][2] = nums[k];
                top++;
                //处理重复
                j++;
                k--;
                while (nums[j] == nums[j - 1] && j < k)
                {
                    j++;
                }

                while (nums[k] == nums[k + 1] && j < k)
                {
                    k--;
                }
            }
        }
    }
    *returnSize = top;
    return Sum;
}

int main(int argc, char const *argv[])
{
    int nums[] = {-1, 0, 1, 2, -1, -4};
    int *returnSize = (int *)malloc(sizeof(int));
    int **res = threeSum(nums, 6, returnSize);
    printf("{");
    for (int i = 0; i < *returnSize; ++i) {
        for (int j = 0; j < 3; ++j) {
            printf("%d ",res[i][j]);
        }
        printf("\n")
    }
    return 0;
}
