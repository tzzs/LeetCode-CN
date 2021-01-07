class Solution:
    def minAddToMakeValid(self, S):
        """
        :type S: str
        :rtype: int
        """
        stack = []
        for s in S:
            if len(stack) > 0:
                if s == ")" and stack[-1] == "(":
                    stack.pop()
                else:
                    stack.append(s)
            else:
                stack.append(s)
        return len(stack)
