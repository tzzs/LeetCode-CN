class Solution:
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        # 200 ms
        # d = []
        # for i in range(len(s)):
        #     if s[i] not in d and s[i] not in s[i+1:]:
        #         return i
        #     else:
        #         d.append(s[i])
        # return -1

        # 160 ms
        # d = {}
        # for r in s:
        #     d[r] = 1 if r not in d else d[r]+1
        # for i in range(len(s)):
        #     if d[s[i]]==1:
        #         return i
        # return -1

        # 132 ms
        d = collections.Counter(s)
        for i in range(len(s)):
            if d[s[i]] == 1:
                return i
        return -1
