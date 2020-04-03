int trap(int *height, int heightSize)
{
    int res = 0;
    if (heightSize <= 2)
    {
        return 0;
    }
    for (int i = 1; i < heightSize - 1; i++)
    {
        res += count(height, heightSize, i);
    }
    return res;
}

int count(int *height, int heightSize, int pos)
{
    int l = 0, r = 0, n = height[pos], count = 0;
    for (int i = pos - 1; i >= 0; i--)
    {
        if (height[i] > l)
        {
            l = height[i];
        }
    }
    for (int i = pos + 1; i < heightSize; i++)
    {
        if (height[i] > r)
        {
            r = height[i];
        }
    }
    count = (l > r ? r : l) - n;
    return count > 0 ? count : 0;
}
