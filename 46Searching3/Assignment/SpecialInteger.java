public class SpecialInteger {
    public int solve(int[] A, int B) {
        int i = 1, j = A.length;
        int ans = 0;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(check(mid, A, B)) {
                ans = mid;
                i = mid + 1;
            } else j = mid - 1;
        }
        return ans;
    }
    private boolean check(int window, int[] A, int B) {
        long sum = 0;
        for(int i = 0; i < window; i++) {
            sum += A[i];
        }
        if(sum > B) return false;
        boolean ans = true;
        for(int i = window; i < A.length; i++) {
            sum += (A[i] - A[i - window]);
            if(sum > B) {
                ans = false;
                break;
            }
        }
        return ans;
    }
}

/*

Q3. Special Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A and an integer B, find and return the maximum value K such that there is no subarray in A of size K with the sum of elements greater than B.



Problem Constraints
1 <= |A| <= 100000

1 <= A[i] <= 10^9

1 <= B <= 10^9



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the maximum value of K (sub array length).



Example Input

Input 1:

A = [1, 2, 3, 4, 5]
B = 10

Input 2:

A = [5, 17, 100, 11]
B = 130



Example Output

Output 1:

 2

Output 2:

 3



Example Explanation

Explanation 1:

Constraints are satisfied for maximal value of 2.

Explanation 2:

Constraints are satisfied for maximal value of 3.


*/