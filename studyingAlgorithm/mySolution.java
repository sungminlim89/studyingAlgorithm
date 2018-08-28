// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        if (A.length < 0 || A.length > 1000000000) return -1;
        if(A.length % 2 == 0) return  -1;
        
        if (A.length == 3) return A[1];

        
        Set<Integer> set = new HashSet<Integer>();
        int result = 0;;
        
        for (int i : A) {
            if (set.add(i)) result = i;
        }
        
        return result;
        
        
    }
}