public class Merge2SortedArrays {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] solve(final int[] A, final int[] B) {
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while(i < A.length && j < B.length) {
            if(A[i] < B[j]) C[k++] = A[i++];
            else C[k++] = B[j++];
        }
        while(i < A.length) {
            C[k++] = A[i++];
        }
        while(j < B.length) {
            C[k++] = B[j++];
        }
        return C;
    }
}

/*

Q2. Merge Two Sorted Arrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.



Problem Constraints

-1010 <= A[i], B[i] <= 1010



Input Format

First Argument is a 1-D array representing A.

Second Argument is also a 1-D array representing B.



Output Format

Return a 1-D vector which you got after merging A and B.



Example Input

Input 1:

A = [4, 7, 9 ]
B = [2, 11, 19 ]

Input 2:

A = [1]
B = [2]



Example Output

Output 1:

[2, 4, 7, 9, 11, 19]

Output 2:

[1, 2]



Example Explanation

Explanation 1:

Merging A and B produces the output as described above.

Explanation 2:

 Merging A and B produces the output as described above.


*/