import java.util.Arrays;

public class MinXORValue {
    public int findMinXor(int[] A) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i = 0; i < A.length - 1; i++) {
            min = Math.min(min, A[i] ^ A[i + 1]);
        }
        return min;
    }
}


/*

Q4. Min XOR value
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.



Problem Constraints

2 <= length of the array <= 100000
0 <= A[i] <= 109



Input Format

First and only argument of input contains an integer array A.



Output Format

Return a single integer denoting minimum xor value.



Example Input

Input 1:

 A = [0, 2, 5, 7]

Input 2:

 A = [0, 4, 7, 9]



Example Output

Output 1:

 2

Output 2:

 3



Example Explanation

Explanation 1:

 0 xor 2 = 2

 
*/