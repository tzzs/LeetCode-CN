class Solution:
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = re.sub(r'\W+', '', s).lower()
        return True if s == s[::-1] else False