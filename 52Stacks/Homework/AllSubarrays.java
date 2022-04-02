import java.util.Stack;

public class AllSubarrays {
    public int solve(int[] A) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < A.length; i++) {
            while(!s.empty()) {
                int xor = A[s.peek()] ^ A[i];
                max = (int)Math.max(max, xor);
                if(A[s.peek()] > A[i]) break;
                s.pop();
            }
            s.push(i);
        }
        return max;
    }
}

/*

Q3. All Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer array A of size N. You have to generate it's all subarrays having a size greater than 1.

Then for each subarray, find Bitwise XOR of its maximum and second maximum element.

Find and return the maximum value of XOR among all subarrays.



Problem Constraints

2 <= N <= 105

1 <= A[i] <= 107



Input Format

The only argument is an integer array A.



Output Format

Return an integer, i.e., the maximum value of XOR of maximum and 2nd maximum element among all subarrays.



Example Input

Input 1:

 A = [2, 3, 1, 4]

Input 2:

 A = [1, 3]



Example Output

Output 1:

 7

Outnput 2:

 2



Example Explanation

Explanation 1:

 All subarrays of A having size greater than 1 are:
 Subarray            XOR of maximum and 2nd maximum no.
 1. [2, 3]           1
 2. [2, 3, 1]        1
 3. [2, 3, 1, 4]     7
 4. [3, 1]           2
 5. [3, 1, 4]        7
 6. [1, 4]           5
 So maximum value of Xor among all subarrays is 7.

Explanation 2:

 Only subarray is [1, 3] and XOR of maximum and 2nd maximum is 2.




*/