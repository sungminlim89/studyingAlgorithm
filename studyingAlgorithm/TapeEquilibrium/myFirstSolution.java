// you can also use imports, for example:
import java.util.*;
import java.util.stream.*;
import java.lang.Math.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        if (A.length <= 1) return 0;
        if (A.length == 2) return Math.abs(A[0] - A[1]);
        if (A.length == 3) return Math.abs(A[0]-A[1]-A[2]);
        
        int result = Integer.MAX_VALUE;
        
        int p = 1;
        while (p < A.length) {
            int firstSum = Arrays.stream(A, 0, p).sum();
            int secondSum = Arrays.stream(A, p, A.length).sum();
            
            int curResult = Math.abs(firstSum - secondSum);
            if (result > curResult) result = curResult;
            
            p++;
        }

        return result;
        
    }
}