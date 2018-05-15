#include <stdio.h>

//冒泡排序
void sort(int *nums, int numsSize)
{
    for (int i = 0; i < numsSize; i++)
    {
        for (int j = 0; j < numsSize - i - 1; j++)
        {
            if (nums[j] > nums[j + 1])
            {
                int temp = nums[j + 1];
                nums[j + 1] = nums[j];
                nums[j] = temp;
            }
        }
    }
}
//快速排序
void kspx(int *nums, int begin, int end)
{
    int i, j, x;
    if (begin < end)
    {
        i = begin;
        j = end;
        x = nums[begin];

        while (i < j)
        {
            while (nums[j] >= x && j > i)
            {
                j--;
            }

            if (i < j)
            {
                nums[i] = nums[j];
                i++;
            }

            while (nums[i] <= x && i < j)
            {
                i++;
            }

            if (i < j)
            {
                nums[j] = nums[i];
                j--;
            }
            nums[i] = x;
            kspx(nums, begin, j - 1);
            kspx(nums, j + 1, end);
        }
    }
}
int arrayPairSum(int *nums, int numsSize)
{
    for (int i = 0; i < numsSize; i++)
    {
        printf("%d ", nums[i]);
    }
    printf("\n");
    // sort(nums, numsSize);
    kspx(nums, 0, numsSize);

    for (int i = 0; i < numsSize; i++)
    {
        printf("%d ", nums[i]);
    }

    int num = 0;
    for (int i = 0; i < numsSize; i++)
    {
        if (i % 2 == 0)
        {
            num += nums[i];
        }
    }
    return num;
}

int main(int argc, char const *argv[])
{
    /* code */
    int nums[] = {1, 3, 4, 2};
    int num = arrayPairSum(nums, 4);
    printf("\n%d\n", num);
    return 0;
}
