class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if nums == []:
            return []
        d = {}
        for k in range(len(nums)):
            nk = nums[k]
            if nk in d:
                return [d[nk], k]
            d[target-nk] = k
