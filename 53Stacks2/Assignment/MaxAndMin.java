import java.util.Stack;

public class MaxAndMin {
    public int solve(int[] A) {
        int mod = (int)1e9+7;
        int[] ls = smallerLeft(copy(A));        // index of nearest smaller element at left
        int[] rs = smallerRight(copy(A));       // index of nearest smaller element at right
        int[] ll = largerLeft(copy(A));         // index of nearest larger element at left
        int[] rl = largerRight(copy(A));        // index of nearest larger element at right
        long max = 0, min = 0;
        for(int i = 0; i < A.length; i++) {
            int v = A[i];
            int psi = ls[i];        // left - small - for i
            int nsi = rs[i];        // right - small - for i
            int pli = ll[i];        // left - large - for i
            int nli = rl[i];        // right - large - for i
            long iMax = (long)(i - pli) * (nli - i) * A[i];    // contribution for max
            long iMin = (long)(i - psi) * (nsi - i) * A[i];    // contribution for min
            max += iMax;
            min += iMin;
        }
        return (int)((max - min) % mod);
    }
    private int[] copy(int[] A) {
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        return B;
    }
    private int[] smallerLeft(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            while(!s.empty() && A[s.peek()] > A[i]) s.pop();
            if(s.empty()) ans[i] = -1;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
    private int[] smallerRight(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = A.length - 1; i >= 0; i--) {
            while(!s.empty() && A[s.peek()] > A[i]) s.pop();
            if(s.empty()) ans[i] = ans.length;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
    private int[] largerLeft(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            while(!s.empty() && A[s.peek()] < A[i]) s.pop();
            if(s.empty()) ans[i] = -1;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
    private int[] largerRight(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = A.length - 1; i >= 0; i--) {
            while(!s.empty() && A[s.peek()] < A[i]) s.pop();
            if(s.empty()) ans[i] = ans.length;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
}

/*

Q4. MAX and MIN
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A.

value of a array = max(array) - min(array).

Calculate and return the sum of values of all possible subarrays of A modulo 109+7.



Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 1000000



Input Format

The first and only argument given is the integer array A.



Output Format

Return the sum of values of all possible subarrays of A modulo 109+7.



Example Input

Input 1:

 A = [1]

Input 2:

 A = [4, 7, 3, 8]



Example Output

Output 1:

 0

Output 2:

 26



Example Explanation

Explanation 1:

Only 1 subarray exists. Its value is 0.

Explanation 2:

value ( [4] ) = 4 - 4 = 0
value ( [7] ) = 7 - 7 = 0
value ( [3] ) = 3 - 3 = 0
value ( [8] ) = 8 - 8 = 0
value ( [4, 7] ) = 7 - 4 = 3
value ( [7, 3] ) = 7 - 3 = 4
value ( [3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3] ) = 7 - 3 = 4
value ( [7, 3, 8] ) = 8 - 3 = 5
value ( [4, 7, 3, 8] ) = 8 - 3 = 5
sum of values % 10^9+7 = 26


*/