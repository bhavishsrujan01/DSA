class Solution(object):
    def isAnagram(self, s, t):
        x = sorted(s)
        y = sorted(t)
        if x==y:
            return True
        return False
        