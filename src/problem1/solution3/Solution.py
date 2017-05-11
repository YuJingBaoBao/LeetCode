class Solution(object):
    def twoSum(self,nums, target):
        map = {}
        for i in range(0, len(nums)):
            x = target - nums[i]
            if (map.has_key(x)):
                return [map[x], i]
            else:
                map[nums[i]] = i


nums = [2, 7, 11, 15]
target = 9
solution=Solution()
print solution.twoSum(nums, target)
