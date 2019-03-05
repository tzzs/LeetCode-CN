class Solution:
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        h = len(matrix)
        if h == 0:
            return False
        w = len(matrix[0])
        if w == 0:
            return False
        i = h-1
        j = 0
        while i >= 0 and j < w:
            m = matrix[i][j]
            if m == target:
                return True
            elif m < target:
                j = j+1
            else:
                i = i-1
        return False
