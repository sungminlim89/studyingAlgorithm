// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        if (A[0] != 1) return 0;
        if (A[0] == 1 && A[A.length-1] == A.length) return 1;
        
        if (A.length == 2) {
            if (A[0] != 1 || A[1] != 2) return 0;
        }
        
        if (A.length == 3) {
            if (A[2] != 3) return 0;
        }
        
        int now = 0;
        int result = 1;
        for (int i = 0; i < A.length; i++) {
            now ^= A[i];
            if ((i+1) % 3 == 0 && now != 0) return 0;
        }
        
        return result;
    }
}