// you can also use imports, for example:
import java.util.*;
import java.lang.Math.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        
        if (N < 1 || N > 100000) return A;
        
        int result[] = new int[N];
        int maxCounter = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] > N) {
                Arrays.fill(result, maxCounter);
            } else {
                result[A[i]-1] += 1;
                maxCounter = Math.max(result[A[i]-1], maxCounter);
            }
        }
        
        return result;
    }
}