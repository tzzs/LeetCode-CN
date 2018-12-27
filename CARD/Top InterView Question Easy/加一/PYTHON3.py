class Solution:
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        l = len(digits)
        if digits[-1]+1 > 9:
            flag = 0
            for i in range(-1, -l-1, -1):
                if i == -1:
                    digits[i] += 1
                digits[i] += flag
                flag = int(digits[i]/10)
                digits[i] %= 10
                if i == -l and flag > 0:
                    digits.insert(0, flag)
        else:
            digits[-1] += 1
        return digits
