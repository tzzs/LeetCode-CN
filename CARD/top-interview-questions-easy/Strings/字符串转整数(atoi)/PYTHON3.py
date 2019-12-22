class Solution:
    def myAtoi(self, str):
        """
        :type str: str
        :rtype: int
        """
        str = str.strip()
        try:
            str = re.search(r'^[\+\-]?\d+',str).group()
            num = int(str)
            max = 2**31-1 # 直接写出结果 运行速度会更快
            min = -2**31
            num = max if num > max else num
            num = min if num < min else num
            return num
        except:
            return 0
