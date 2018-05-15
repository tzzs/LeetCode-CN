class Solution(object):
    def replace(self, n, time):
        if n == 1:
            return n, time
        else:
            time += 1
            if n % 2 == 0:
                n = n/2
                return self.replace(n, time)
            else:
                n = n+1
                return self.replace(n, time)

    def integerReplacement(self, n):
        """
        :type n: int
        :rtype: int
        """
        time = 0
        n, time = self.replace(n, time)
        return time
