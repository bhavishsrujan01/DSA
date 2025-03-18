import java.util.HashMap;

class Solution {
    public boolean divideArray(int[] nums) {
        // If the length of the array is odd, it's impossible to divide it into pairs
        if (nums.length % 2 != 0) {
            return false;
        }

        // Create a map to store the frequency of each number
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count the frequency of each number in the array
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Check if every number has an even frequency
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                return false;  // If any number has an odd frequency, return false
            }
        }

        return true;  // All numbers have even frequency, so it's possible to divide into pairs
    }
}