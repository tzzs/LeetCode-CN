class Solution:
    def nextGreaterElement(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        greater = []
        len2 = len(nums2)
        for num1 in nums1:
            flag = False
            for k in range(nums2.index(num1)+1, len2):
                if nums2[k] > num1:
                    flag = True
                    greater.append(nums2[k])
                    break
            if flag == False:
                greater.append(-1)
        return greater
