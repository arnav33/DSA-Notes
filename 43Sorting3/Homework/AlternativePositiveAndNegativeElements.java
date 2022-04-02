import java.util.LinkedList;
import java.util.Queue;

public class AlternativePositiveAndNegativeElements {
    public int[] solve(int[] A) {
        Queue<Integer> qp = new LinkedList<>();
        Queue<Integer> qn = new LinkedList<>();
        for(int i = 0; i < A.length; i++) {
            int n = A[i];
            if(n < 0) qn.add(n);
            else qp.add(n);
        }
        Queue<Integer> first = new LinkedList<>();
        Queue<Integer> second = new LinkedList<>();
        boolean ch = true;
        int[] ans = new int[A.length];
        int i = 0;
        while(!qp.isEmpty() && !qn.isEmpty()) {
            int n = 0;
            if(ch) n = qn.remove();
            else n = qp.remove();
            ans[i++] = n;
            ch = !ch;
        }
        while(!qp.isEmpty()) {
            int n = qp.remove();
            ans[i++] = n;
        }
        while(!qn.isEmpty()) {
            int n = qn.remove();
            ans[i++] = n;
        }
        return ans;
    }
}

/*

Q2. Alternate positive and negative elements
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A, arrange them in an alternate fashion such that every non-negative number is followed by negative and vice-versa, starting from a negative number, maintaining the order of appearance. The number of non-negative and negative numbers need not be equal.

If there are more non-negative numbers, they appear at the end of the array. If there are more negative numbers, they also appear at the array's end.

Note: Try solving with O(1) extra space.



Problem Constraints

1 <= length of the array <= 7000
-109 <= A[i] <= 109



Input Format

The first argument given is the integer array A.



Output Format

Return the modified array.



Example Input

Input 1:

 A = [-1, -2, -3, 4, 5]

Input 2:

 A = [5, -17, -100, -11]



Example Output

Output 1:

 [-1, 4, -2, 5, -3]

Output 2:

 [-17, 5, -100, -11]



Example Explanation

Explanation 1:

A = [-1, -2, -3, 4, 5]
Move 4 in between -1 and -2, A => [-1, 4, -2, -3, 5]
Move 5 in between -2 and -3, A => [-1, 4, -2, 5, -3]

*/