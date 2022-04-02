import java.util.ArrayDeque;
import java.util.Deque;

public class SumOfMinAndMax {
    public int solve(int[] A, int B) {
        long mod = 1000000007;

        Deque<Integer> dMax = new ArrayDeque<>();
        Deque<Integer> dMin = new ArrayDeque<>();

        long ans = 0;

        // Finding max
        for(int i = 0; i < A.length; i++) {
            while(dMax.size() > 0 && i - dMax.peekFirst() >= B) dMax.removeFirst();

            // Inserting elements to the Queue
            if(dMax.size() == 0) dMax.addLast(i);
            else {
                while(dMax.size() > 0 && A[dMax.peekLast()] <= A[i]) dMax.removeLast();
                dMax.addLast(i);
            }

            // Updating ans and removing first element
            if(i >= B - 1) {
                ans += A[dMax.peekFirst()];
                ans %= mod;
            }
        }

        // Finding min
        for(int i = 0; i < A.length; i++) {
            while(dMin.size() > 0 && i - dMin.peekFirst() >= B) dMin.removeFirst();

            // Inserting elements to the Queue
            if(dMin.size() == 0) dMin.addLast(i);
            else {
                while(dMin.size() > 0 && A[dMin.peekLast()] >= A[i]) dMin.removeLast();
                dMin.addLast(i);
            }

            // Updating ans and removing first element
            if(i >= B - 1) {
                ans += A[dMin.peekFirst()];
                ans %= mod;
            }
        }

        if(ans < 0) {
            ans += mod;
        }

        return (int)ans;
    }
}

/*

Q3. Sum of min and max
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of both positive and negative integers.

Your task is to compute the sum of minimum and maximum elements of all sub-array of size B.

NOTE: Since the answer can be very large, you are required to return the sum modulo 109 + 7.



Problem Constraints

1 <= size of array A <= 105

-109 <= A[i] <= 109

1 <= B <= size of array



Input Format

The first argument denotes the integer array A.
The second argument denotes the value B



Output Format

Return an integer that denotes the required value.



Example Input

Input 1:

 A = [2, 5, -1, 7, -3, -1, -2]
 B = 4

Input 2:

 A = [2, -1, 3]
 B = 2



Example Output

Output 1:

 18

Output 2:

 3



Example Explanation

Explanation 1:

 Subarrays of size 4 are : 
    [2, 5, -1, 7],   min + max = -1 + 7 = 6
    [5, -1, 7, -3],  min + max = -3 + 7 = 4      
    [-1, 7, -3, -1], min + max = -3 + 7 = 4
    [7, -3, -1, -2], min + max = -3 + 7 = 4   
    Sum of all min & max = 6 + 4 + 4 + 4 = 18 

Explanation 2:

 Subarrays of size 2 are : 
    [2, -1],   min + max = -1 + 2 = 1
    [-1, 3],   min + max = -1 + 3 = 2
    Sum of all min & max = 1 + 2 = 3 

*/