class Solution(object):
    def removeElement(self, nums, val):
        k = 0  # Pointer for the next position to insert a non-val element
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1
        return k
