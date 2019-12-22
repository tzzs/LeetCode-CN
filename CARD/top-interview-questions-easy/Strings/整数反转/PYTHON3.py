class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        max = 2**31-1
        min = -2**31
        while x > 10 and x % 10 == 0:
            x //= 10
        if x >= 0:
            x = int(str(x)[::-1])
            return 0 if x > max or x < min else x
        else:
            x = -int(str(x)[:0:-1])
            return 0 if x > max or x < min else x
