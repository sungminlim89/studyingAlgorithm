// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        if (A.length < 1 || A.length > 100000) return 1;
        
        Arrays.sort(A);
        if (A[0] != 1) return 1;
        if (A[A.length-1] != A.length+1) return A.length+1;
        
        int result = 1;
        
        for (int i = 0; i < A.length-1; i++) {
            if (A[i+1] - A[i] != 1) result = A[i+1]-1;
        }
        
        if (result == 1) return A[A.length-1]+1;
        
        return result;
    }
}