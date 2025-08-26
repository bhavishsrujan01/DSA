class Solution:
    def moveZeroes(self, nums):
        pos = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[pos] = nums[i]
                pos += 1
        while pos < len(nums):
            nums[pos] = 0
            pos += 1
        
        return nums
