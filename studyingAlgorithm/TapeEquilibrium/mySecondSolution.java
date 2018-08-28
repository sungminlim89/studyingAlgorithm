// you can also use imports, for example:
import java.lang.Math.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        int total = 0;
    	
    	for(int i : A)
    		total += i;
        
        int min = Integer.MAX_VALUE;
        int first = 0;
        int second = total;
        for (int p = 1; p < A.length; p++) {
            first += A[p - 1];
            second = total - first;
            min = Math.min(min, Math.abs(first-second));
        }
        
        return min;
    }
}