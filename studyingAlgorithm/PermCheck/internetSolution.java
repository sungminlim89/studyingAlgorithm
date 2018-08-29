public static int solution_4_PermCheck(int[] A) {
 
    int sumOfElements = 0;
    int expectedSumOfElements = 0;
    int[] countArray = new int[A.length + 1];
 
    for (int i = 0; i < A.length; i++) {
 
        if (A[i] >= countArray.length)
            return 0;
 
        if (countArray[A[i]] != 0)
            return 0;
 
        countArray[A[i]]++;
 
        sumOfElements += A[i];
        expectedSumOfElements += i + 1;
 
    }
 
    if (sumOfElements == expectedSumOfElements)
        return 1;
    else
        return 0;
}