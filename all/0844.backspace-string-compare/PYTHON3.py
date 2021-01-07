class Solution:
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        sStack = []
        tStack = []
        for s in S:
            if s == '#':
                if len(sStack) > 0:
                    sStack.pop()
            else:
                sStack.append(s)
        for t in T:
            if t == '#':
                if len(tStack) > 0:
                    tStack.pop()
            else:
                tStack.append(t)
        return sStack == tStack
