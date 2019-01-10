class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # 默认其重复只出现两次 
        res = 0
        for n in nums:
            res^=n
        return res