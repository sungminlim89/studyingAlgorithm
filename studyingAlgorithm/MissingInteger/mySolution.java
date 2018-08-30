// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                set.add(A[i]);
        }
        
        if (set.isEmpty()) return 1;
        
        int result = 0;
        
        for (int i = 1; i <= set.size(); i++) {
            if (!set.contains(i)){
                result = i;
                break;
            } 
        }
        
        if (result == 0) return set.size()+1;
        else return result;
        
    }
}