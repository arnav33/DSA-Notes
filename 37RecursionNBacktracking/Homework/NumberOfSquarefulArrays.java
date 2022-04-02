import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfSquarefulArrays {
    Set<String> str = new HashSet<>();
    public int solve(int[] A) {
        if(A.length == 1) return 0;
        eval(A, 0);
        return str.size();
    }
    private void eval(int[] A, int i) {
        if(i == A.length) {
            str.add(Arrays.toString(A));
            return;
        }
        for(int j = i; j < A.length; j++) {
            int num = 0;
            int sqrt = 0;
            if(i > 0) {
                num = A[i - 1] + A[j];
                sqrt = (int)Math.sqrt(num);
            }
            if(sqrt * sqrt == num) {
                swap(i, j, A);
                eval(A, i + 1);
                swap(i, j, A);
            }
        }
    }
    private void swap(int i, int j, int[] A) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

/*
Q2. Number of Squareful Arrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints

1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format

The only argument given is the integer array A.


Output Format

Return the number of permutations of A that are squareful.


Example Input

Input 1:

 A = [2, 2, 2]

Input 2:

 A = [1, 17, 8]



Example Output

Output 1:

 1

Output 2:

 2



Example Explanation

Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.

Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].
*/