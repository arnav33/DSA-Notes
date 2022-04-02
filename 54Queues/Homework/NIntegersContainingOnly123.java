import java.util.LinkedList;
import java.util.Queue;

public class NIntegersContainingOnly123 {
    public int[] solve(int A) {
        if(A <= 3) {
            int[] ans = new int[A];
            int i = 0;
            while(i < A) {
                ans[i] = ++i;
            }
            return ans;
        }
        Queue<String> q = new LinkedList<>();
        int max = 3;
        int c = 0;      // ans index which has to be equal to A - 1 finally
        int[] ans = new int[A];
        while(c < max) {
            ans[c] = ++c;
            q.add(Integer.toString(c));
        }
        m: while(c < A) {
            String x = q.remove();     // removed element from Queue
            int j = 1;              // from 1 to 3 (3 is max)
            while(j <= max) {
                String newNum = x + Integer.toString(j++);
                q.add(newNum);
                ans[c] = Integer.parseInt(newNum);
                if(c++ == A - 1) break m;
            }
        }
        return ans;
    }
}

/*

Q1. N integers containing only 1, 2 & 3
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer, A. Find and Return first positive A integers in ascending order containing only digits 1, 2, and 3.

NOTE: All the A integers will fit in 32-bit integers.



Problem Constraints

1 <= A <= 29500



Input Format

The only argument given is integer A.



Output Format

Return an integer array denoting the first positive A integers in ascending order containing only digits 1, 2 and 3.



Example Input

Input 1:

 A = 3

Input 2:

 A = 7



Example Output

Output 1:

 [1, 2, 3]

Output 2:

 [1, 2, 3, 11, 12, 13, 21]



Example Explanation

Explanation 1:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.

Explanation 2:

 Output denotes the first 3 integers that contains only digits 1, 2 and 3.

*/