

int titleToNumber(char *s)
{
    if (s == NULL)
    {
        return 0;
    }
    int len = strlen(s);
    int sum = 0;
    for (int i = 0; i < len; i++)
    {
        sum += (s[i] - 'A' + 1) * pow(26, len - i - 1);
    }
    return sum;
}
