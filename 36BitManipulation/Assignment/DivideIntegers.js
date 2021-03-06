module.exports = {
    //param A : integer
    //param B : integer
    //return an integer
    divide: function (A, B) {
        let a = Math.abs(A), b = Math.abs(B), ans = 0;
        while (a >= b) {
            ans++;
            a -= b;
        }
        if (A < 0 && B < 0) {
            if (B == -1)
                ans--;
        } else if (A < 0 || B < 0) {
            ans *= -1;
        }
        return ans % (2e31 - 1);
    }
};



/*

Q1. Divide Integers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Also, consider if there can be overflow cases i.e output is greater than INT_MAX, return INT_MAX.

NOTE: INT_MAX = 2^31 - 1



Problem Constraints

-231 <= A, B <= 231-1

B != 0



Input Format

The first argument is an integer A denoting the dividend.
The second argument is an integer B denoting the divisor.



Output Format

Return an integer denoting the floor value of the division.



Example Input

Input 1:

 A = 5
 B = 2

Input 2:

 A = 7
 B = 1



Example Output

Output 1:

 2

Output 2:

 7



Example Explanation

Explanation 1:

 floor(5/2) = 2
 
*/