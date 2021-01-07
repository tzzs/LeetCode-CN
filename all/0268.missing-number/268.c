#include <stdio.h>

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
                temp = nums[j];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
    for (int i = 0; i < numsSize; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");
}

int missingNumber(int *nums, int numsSize)
{
    sort(nums, numsSize);

    for (int i = 0; i < numsSize; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");
    int max = nums[0];
    for (int i = 0; i < numsSize; i++)
    {
        if (nums[i] - nums[i + 1] > 1)
        {
            printf("%d\n", nums[i]);
            max = nums[i + 1] + 1;
            break;
        }
    }
    return max;
}
int main(int argc, char const *argv[])
{
    int nums[] = {3, 0, 1, 4};
    int r = missingNumber(nums, 4);
    printf("%d", r);
    return 0;
}
