from collections import defaultdict 
class Solution(object):
    def groupAnagrams(self, strs):
        anagram = defaultdict(list)
        for s in strs :
            count = [0]*26
            for c in s:
                count[ord(c)-ord('a')]+=1
            key = tuple(count)
            anagram[key].append(s)
        return anagram.values()
        