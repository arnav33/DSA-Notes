import java.util.HashSet;
import java.util.Set;

public class LongestConsequitiveSequence {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int longestConsecutive(final int[] A) {
        // Creating hasset
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            hs.add(A[i]);
        }
        // finding min and max of the array
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        // counting current sequence length, comparing with max sequence length
        int m = 0, c = 0;
        for(int i = min; i <= max; i++) {
            if(hs.contains(i)) c++;
            else c = 0;
            m = Math.max(m, c);
        }
        return m;
    }
}

/*

Q3. Longest Consecutive Sequence
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.



Problem Constraints

1 <= N <= 106

-106 <= A[i] <= 106



Input Format

First argument is an integer array A of size N.



Output Format

Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input

Input 1:

A = [100, 4, 200, 1, 3, 2]

Input 2:

A = [2, 1]



Example Output

Output 1:

 4

Output 2:

 2



Example Explanation

Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].

Explanation 2:

 The set of consecutive elements will be [1, 2].


*/