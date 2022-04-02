import java.util.Arrays;

public class MaximumUnsortedSubarray {
    public int[] subUnsort(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        Arrays.sort(B);
        int x = -1;
        for(int i = 0; i < A.length; i++) {
            if(A[i] != B[i]) {
                x = i;
                break;
            }
        }
        if(x == -1) {
            int[] ans = new int[1];
            ans[0] = -1;
            return ans;
        }
        int y = -1;
        for(int i = A.length - 1; i >= 0; i--) {
            if(A[i] != B[i]) {
                y = i;
                break;
            }
        }
        int[] ans = new int[2];
        ans[0] = x;
        ans[1] = y;
        return ans;
    }
}

/*

Q2. Maximum Unsorted Subarray
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,..., Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.



Problem Constraints

1 <= N <= 1000000
1 <= A[i] <= 1000000



Input Format

First and only argument is an array of non-negative integers of size N.



Output Format

Return an array of length two where the first element denotes the starting index(0-based) and the second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.



Example Input

Input 1:

A = [1, 3, 2, 4, 5]

Input 2:

A = [1, 2, 3, 4, 5]



Example Output

Output 1:

[1, 2]

Output 2:

[-1]



Example Explanation

Explanation 1:

If we sort the sub-array A1, A2, then the whole array A gets sorted.

Explanation 2:

A is already sorted.

*/