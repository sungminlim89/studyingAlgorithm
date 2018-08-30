// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
		// write your code in Java SE 8
        
        Set<Integer> set = new HashSet<Integer>();
        int resultIndex = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] > X) return -1;
            
            if (A[i] <= X) set.add(A[i]);
            
            if (set.size() == X) {
                if (resultIndex == -1) {
                    resultIndex = i;
                }
            }
        }
        
        
        if (set.size() != X) return -1;
        
        return resultIndex;
        
        
    }
}