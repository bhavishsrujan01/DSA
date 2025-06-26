class Solution(object):
    def containsDuplicate(self, nums):
        hash_list = dict()
        for num in range(len(nums)):
            hash_list[nums[num]]=hash_list.get(nums[num],0)+1
        for i in hash_list.values():
            if i>1:
                return True
        return False