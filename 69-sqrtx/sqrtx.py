class Solution(object):
    def mySqrt(self, x):
        l,r=1,x
        while l<=r:
            mid =(l+r)//2
            m_squared = mid * mid 
            if m_squared == x:
                return mid
            elif m_squared<x:
                l=mid+1
            else:
                r=mid-1
        return r