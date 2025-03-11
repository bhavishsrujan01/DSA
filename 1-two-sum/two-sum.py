class Solution(object):
    def twoSum(self, nums, target):
        seen = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in seen:
                return [seen[complement], i]  # Return the indices of the two numbers
            seen[num] = i
        return []  # Return an empty list if no pair is found