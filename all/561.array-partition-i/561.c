#include <stdio.h>

//快速排序
void kspx(int *a, int left, int right)
{
    if (left >= right) /*如果左边索引大于或者等于右边的索引就代表已经整理完成一个组了*/
    {
        return;
    }
    int i = left;
    int j = right;
    int key = a[left];

    while (i < j)
    {
        while (i < j && key <= a[j])
        {
            j--;
        }
        a[i] = a[j];

        while (i < j && key >= a[i])
        {
            i++;
        }
        a[j] = a[i];
    }
    a[i] = key;
    kspx(a, left, i - 1);
    kspx(a, i + 1, right);
}

int arrayPairSum(int *nums, int numsSize)
{
    kspx(nums, 0, numsSize - 1);

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
