class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int beg =0 ;
        int end = numbers.length-1;
        while(beg<=end){
            int cursum = numbers[beg]+numbers[end];
            if(cursum>target){
                end--;
            }
            else if(cursum<target){
                beg++;
            }
            else if(cursum==target){
                return new int[]{beg+1,end+1};
            }
        }
        return new int[]{-1, -1};
    }
}