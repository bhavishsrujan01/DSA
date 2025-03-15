//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static int evenlyDivides(int n) {
        int cnt = 0;
        int original = n; // Store original number
        
        while (n > 0) {
            int lastdigit = n % 10; // Extract the last digit
            
            // Check if lastdigit is non-zero and divides original number evenly
            if (lastdigit != 0 && original % lastdigit == 0) {
                cnt++; // Increment count
            }
            
            n = n / 10; // Remove the last digit
        }
        
        return cnt;
    }
}
