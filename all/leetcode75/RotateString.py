class Solution:
    def rotateString(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: bool
        """
        # print(A, B)
        for i in range(len(A)):
            if B[i:] + B[:i] == A:
                return True
        return False


if __name__ == '__main__':
    print('A:')
    A = input()
    print('B:')
    B = input()
    Solution = Solution()
    print(Solution.rotateString(A, B))
