class Solution:
    def decodeString(self, s):
        """
        :type s: str
        :rtype: str
        """
        rs = ""
        index = 0
        while index < len(s):
            k = index
            cs = ""
            index += 1
            while s[index] != ']':
                cs += s[index]
            index += 1
            rs += index*cs
        return rs


s = "3[a]2.两数相加[bc]"
solution = Solution()
print(solution.decodeString(s))
