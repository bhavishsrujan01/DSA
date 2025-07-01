class Solution(object):
    def majorityElement(self, nums):
        hashlist = {}
        val = len(nums)/2
        for i in range(len(nums)):
            hashlist[nums[i]]=hashlist.get(nums[i],0)+1
        for i,j in hashlist.items():
            if j>val:
                return i
        return None
