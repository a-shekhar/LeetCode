class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        dic = dict()
        for num in set(nums):
            if num % 2 == 0:
                dic[num] = nums.count(num)
        if len(dic) != 0:
            sorteddic = dict(sorted(dic.items(), key = lambda x:(-x[1], x[0])))
            print(sorteddic)
            for key, val in sorteddic.items():
                return key
        return -1
        