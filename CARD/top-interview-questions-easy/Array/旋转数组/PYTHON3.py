class Solution:
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: void Do not return anything, modify nums in-place instead.
        """
        k = k % len(nums)
        lt = nums[-k:]+nums[:-k]
        for i in range(len(lt)):
            nums[i] = lt[i]


"""
直接 nums = nums[-k:]+nums[:-k] 无效，其没有改变参数的值，只是改变了函数retoate中的值
需要重新给每一个单独赋值
"""
