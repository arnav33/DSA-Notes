import java.util.HashSet;
import java.util.Set;

public class SubarrayWith0Sum {
    public int solve(int[] A) {
        long[] ps = new long[A.length];
        ps[0] = A[0];
        for(int i = 1; i < A.length; i++) {
            ps[i] = ps[i - 1] + A[i];
        }
        Set<Long> hs = new HashSet<>();
        for(int i = 0; i < ps.length; i++) {
            if(ps[i] == 0) return 1;
            if(hs.contains(ps[i])) return 1;
            hs.add(ps[i]);
        }
        return 0;
    }
}

/*

Q2. Sub-array with 0 sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.



Problem Constraints

1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.



Output Format

Return whether the given array contains a subarray with a sum equal to 0.



Example Input

Input 1:

 A = [1, 2, 3, 4, 5]

Input 2:

 A = [-1, 1]



Example Output

Output 1:

 0

Output 2:

 1



Example Explanation

Explanation 1:

 No subarray has sum 0.

Explanation 2:

 The array has sum 0.


*/