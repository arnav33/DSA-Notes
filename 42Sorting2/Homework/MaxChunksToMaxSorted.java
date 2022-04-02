public class MaxChunksToMaxSorted {
    public int solve(int[] A) {
        int max = 0;
        int chunk = 0;
        for(int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            if(i == max) chunk++;
        }
        return chunk;
    }
}

/*

Q1. Max Chunks To Make Sorted
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we split the array into some number of "chunks" (partitions), and individually sort each chunk. After concatenating them in order of splitting, the result equals the sorted array.

What is the most number of chunks we could have made?



Problem Constraints

1 <= N <= 100000
0 <= A[i] < N



Input Format

The only argument given is the integer array A.



Output Format

Return the maximum number of chunks that we could have made.



Example Input

Input 1:

 A = [1, 2, 3, 4, 0]

Input 2:

 A = [2, 0, 1, 3]



Example Output

Output 1:

 1

Output 2:

 2



Example Explanation

Explanation 1:

 A = [1, 2, 3, 4, 0]
 To get the 0 in the first index, we have to take all elements in a single chunk.

Explanation 2:

 A = [2, 0, 1, 3] 
 We can divide the array into 2 chunks.
 First chunk is [2, 0, 1] and second chunk is [3].
 
*/