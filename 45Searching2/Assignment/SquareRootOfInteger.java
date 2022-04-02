public class SquareRootOfInteger {
    public int sqrt(int A) {
        long i = 1, j = A - 1;
        int ans = 1;
        while(i <= j) {
            long mid = (i + j) / 2;
            if((mid * mid == A) || ((mid) * (mid) < A && (mid + 1) * (mid + 1) > A)) return (int)mid;
            if(mid * mid < A) i = mid + 1;
            else j = mid - 1;
        }
        if(A == 0) return 0;
        return 1;
    }
}

/*

Q4. Square Root of Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer A.

Compute and return the square root of A.

If A is not a perfect square, return floor(sqrt(A)).

DO NOT USE SQRT FUNCTION FROM THE STANDARD LIBRARY.

NOTE: Do not use the sqrt function from the standard library. Users are expected to solve this in O(log(A)) time.



Problem Constraints

0 <= A <= 1010



Input Format

The first and only argument given is the integer A.



Output Format

Return floor(sqrt(A))



Example Input

Input 1:

 11

Input 2:

 9



Example Output

Output 1:

 3

Output 2:

 3



Example Explanation

Explanation:

 When A = 11 , square root of A = 3.316. It is not a perfect square so we return the floor which is 3.
 When A = 9 which is a perfect square of 3, so we return 3.

*/