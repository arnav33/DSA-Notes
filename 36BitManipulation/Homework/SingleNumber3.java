public class SingleNumber3 {
    public int[] solve(int[] A) {
        int a = A[0];
        for(int i = 1; i < A.length; i++) {
            a ^= A[i];
        }
        int n = a - (a & (a - 1));
        boolean xx = false, yy = false;
        int x = 0, y = 0;
        for(int i = 0; i < A.length; i++) {
            int z = n & A[i];
            if(z == n) {
                if(!xx) {
                    xx = true;
                    x = A[i];
                } else {
                    x ^= A[i];
                }
            } else {
                if(!yy) {
                    yy = true;
                    y = A[i];
                } else {
                    y ^= A[i];
                }
            }
        }
        int ans[] = new int[2];
        ans[0] = Math.min(x, y);
        ans[1] = Math.max(x, y);
        return ans;
    }
}

/*

Q3. Single Number III
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.



Problem Constraints

2 <= |A| <= 100000
1 <= A[i] <= 109



Input Format

The first argument is an array of integers of size N.



Output Format

Return an array of two integers that appear only once.



Example Input
Input 1:

A = [1, 2, 3, 1, 2, 4]

Input 2:

A = [1, 2]



Example Output
Output 1:

[3, 4]

Output 2:

[1, 2]



Example Explanation
Explanation 1:

3 and 4 appear only once.

Explanation 2:

1 and 2 appear only once.


*/