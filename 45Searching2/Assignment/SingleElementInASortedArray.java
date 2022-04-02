public class SingleElementInASortedArray {
    public int solve(int[] A) {
        int i = 0, j = A.length - 1;
        long ans = 0;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(mid == 0) {
                if(A[mid] != A[mid + 1]) return A[mid];
                else i = mid + 1;
            } else if(mid == A.length - 1) {
                if(A[mid] != A[mid - 1]) return A[mid];
                else j = mid - 1;
            } else if(A[mid] != A[mid - 1] && A[mid] != A[mid + 1]) return A[mid];
            else if(A[mid] == A[mid + 1] && mid % 2 == 0) i = mid + 1;
            else if(A[mid] == A[mid - 1] && mid % 2 == 1) i = mid + 1;
            else j = mid - 1;
        }
        return (int)ans;
    }
}


/*

Q2. Single Element in a Sorted Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.



Output Format

Return the single element that appears only once.



Example Input

Input 1:

A = [1, 1, 7]

Input 2:

A = [2, 3, 3]



Example Output

Output 1:

 7

Output 2:

 2



Example Explanation

Explanation 1:

 7 appears once

Explanation 2:

 2 appears once


*/