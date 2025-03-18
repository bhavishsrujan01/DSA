class Solution {
    public boolean isPalindrome(int x) {
        int revno=0;
        int dup = x;
        while(x>0){
            int lastdigit=x%10;
            revno=(revno*10)+lastdigit;
            x=x/10;
        }
        if(revno==dup){
            return true;
        }
        else{
            return false;
        }
    }
}