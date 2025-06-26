class Solution(object):
    def scoreOfString(self, s):
        arr = []
        for i in s:
            arr.append(ord(i))
        length = len(arr)
        score = 0
        for i in range(0,length-1):
            score=score+abs(arr[i]-arr[i+1])
        return score

