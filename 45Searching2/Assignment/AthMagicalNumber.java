public class AthMagicalNumber {
    public int solve(int A, int B, int C) {
        int mod = (int)1e9+7;
        long ans = 0, i = 0, j = (long)1e18;
        while(i <= j) {
            long m = (i + j) / 2;
            long count = (m / B) + (m / C) - (m / lcm(B, C));
            // if(count == A) ans = m;
            if(count < A) i = m + 1;
            else {
                ans = m;
                j = m - 1;
            }
        }
        return (int)(ans % mod);
    }
    private int lcm(int x, int y) {
        int gcd = 1;
        for(int i = 1; i <= x && i <= y; i++) {
            if(x % i == 0 && y % i == 0) gcd = i;
        }
        int lcm = (x * y) / gcd;
        return lcm;
    }
}

/*

Q1. Ath Magical Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given three positive integers, A, B, and C.

Any positive integer is magical if divisible by either B or C.

Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.



Problem Constraints

1 <= A <= 109

2 <= B, C <= 40000



Input Format

The first argument given is an integer A.

The second argument given is an integer B.

The third argument given is an integer C.



Output Format

Return the Ath smallest magical number. Since the answer may be very large, return modulo 109 + 7.



Example Input

Input 1:

 A = 1
 B = 2
 C = 3

Input 2:

 A = 4
 B = 2
 C = 3



Example Output

Output 1:

 2

Output 2:

 6



Example Explanation

Explanation 1:

 1st magical number is 2.

Explanation 2:

 First four magical numbers are 2, 3, 4, 6 so the 4th magical number is 6.


*/