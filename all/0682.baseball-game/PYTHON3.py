class Solution:
    def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        stack = []
        for s in ops:
            if s == "C":  # 无效
                points = stack.pop()
            elif s == "D":  # 双倍
                points = stack[-1]*2
                stack.append(points)
            elif s == "+":  # 之和
                points = stack[-1]+stack[-2]
                stack.append(points)
            else:
                stack.append(int(s))
        return sum(stack)