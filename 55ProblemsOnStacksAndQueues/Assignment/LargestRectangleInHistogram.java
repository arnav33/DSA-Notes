import java.util.Stack;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] A) {
        int[] al = smallerLeft(A);
        int[] ar = smallerRight(A);
        long area = 0;
        for(int i = 0; i < A.length; i++) {
            int li = al[i], lr = ar[i];
            long ca = (lr - li - 1) * A[i];
            area = (int)Math.max(area, ca);
        }
        return (int)area;
    }
    private int[] smallerLeft(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            while(!s.empty() && A[s.peek()] >= A[i]) s.pop();
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
            while(!s.empty() && A[s.peek()] >= A[i]) s.pop();
            if(s.empty()) ans[i] = ans.length;
            else ans[i] = s.peek();
            s.push(i);
        }
        return ans;
    }
}

/*

Q1. Largest Rectangle in Histogram
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A.

A represents a histogram i.e A[i] denotes the height of the ith histogram's bar. Width of each bar is 1.

Find the area of the largest rectangle formed by the histogram.



Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 1000000000



Input Format

The only argument given is the integer array A.



Output Format

Return the area of the largest rectangle in the histogram.



Example Input

Input 1:

 A = [2, 1, 5, 6, 2, 3]

Input 2:

 A = [2]



Example Output

Output 1:

 10

Output 2:

 2



Example Explanation

Explanation 1:

The largest rectangle has area = 10 unit. Formed by A[3] to A[4].

Explanation 2:

Largest rectangle has area 2.

*/