import java.util.HashMap;
import java.util.Map;

public class CompareSortedSubarrays {
    public int[] solve(int[] A, int[][] B) {
        Map<Integer, Long> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            if(!hm.containsKey(A[i])) {
                hm.put(A[i], (long)(1e14 * Math.random()));
            }
        }
        long[] ps = new long[A.length];
        ps[0] = hm.get(A[0]);
        for(int i = 1; i < A.length; i++) {
            ps[i] = ps[i - 1] + hm.get(A[i]);
        }
        int[] ans = new int[B.length];
        for(int i = 0; i < B.length; i++) {
            int l1 = B[i][0], r1 = B[i][1], l2 = B[i][2], r2 = B[i][3];
            if(r1 - l1 != r2 - l2) {
                ans[i] = 0;
                continue;
            }

            long lSum = 0;
            if(l1 == 0) lSum = ps[r1];
            else lSum = ps[r1] - ps[l1 - 1];

            long rSum = 0;
            if(l2 == 0) rSum = ps[r2];
            else rSum = ps[r2] - ps[l2 - 1];

            if(lSum == rSum) ans[i] = 1;
            else ans[i] = 0;
        }
        return ans;
    }
}


/*

Q1. Compare Sorted Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of length N. You have to answer Q queries.

Each query will contain four integers l1, r1, l2, and r2. If sorted segment from [l1, r1] is the same as the sorted segment from [l2 r2], then the answer is 1 else 0.

NOTE The queries are 0-indexed.



Problem Constraints

0 <= A[i] <= 100000
1 <= N <= 100000
1 <= Q <= 100000



Input Format

The first argument is an array A.
The second is a 2D array B denoting queries with dimension Q * 4.
Consider ith query as l1 = B[i][0], r1 = B[i][1], l2 = A[i][2], r2 = B[i][3].



Output Format

Return an array of length Q with answers to the queries in the same order as the input.



Example Input

Input 1:

 A = [1, 7, 11, 8, 11, 7, 1]
 B = [ 
       [0, 2, 4, 6]
     ]

Input 2:

 A = [1, 3, 2]
 B = [
       [0, 1, 1, 2]
     ] 



Example Output

Output 1:

 [1]

Output 2:

 [0]



Example Explanation

Explanation 1:

 (0, 2) -> [1, 7, 11]
 (4, 6) -> [11, 7, 1]
 Both are same when sorted hence 1.

Explanation 2:

 (0, 1) -> [1, 3]
 (1, 2) -> [3, 2] 
 Both are different when sorted hence 0.

*/