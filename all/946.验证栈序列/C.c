bool validateStackSequences(int *pushed, int pushedSize, int *popped, int poppedSize)
{
    if (pushedSize == 0 || pushedSize == 1)
    {
        return true;
    }
    int stack[pushedSize];
    int top = -1, cur = 0;
    for (int i = 0; i < pushedSize; i++)
    {
        stack[++top] = pushed[i];
        while (top >= 0 && stack[top] == popped[cur])
        {
            cur++;
            top--;
        }
    }
    if (top == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}
/**
 * 使用额外的栈保存栈放入的顺序，同时判断和当前输出栈顶元素是否相同，相同则弹出当前元素
 * 
 * 优化：先判断是否相同，不相同再压栈 -> 没有任何提升
 * 
 * [1,2,3,4,5]
 * [4,5,3,2,1]
 * [1,2,3,4,5]
 * [4,3,5,1,2]
 * []
 * []
 * [0,2,1]
 * [0,1,2]
*/
bool validateStackSequences2(int *pushed, int pushedSize, int *popped, int poppedSize)
{
    if (pushedSize == 0 || pushedSize == 1)
    {
        return true;
    }
    int stack[pushedSize];
    int top = -1, cur = 0;
    for (int i = 0; i < pushedSize; i++)
    {
        if (pushed[i] != popped[cur])
        {
            stack[++top] = pushed[i];
            continue;
        }
        else
        {
            cur++;
        }
        while (top >= 0 && stack[top] == popped[cur])
        {
            cur++;
            top--;
        }
    }
    if (top == -1)
    {
        return true;
    }
    else
    {
        return false;
    }
}
