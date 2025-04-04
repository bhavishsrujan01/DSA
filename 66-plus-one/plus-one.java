class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
    
        // If we're here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; // e.g., 999 -> 1000
        return result;
    }
    
}
