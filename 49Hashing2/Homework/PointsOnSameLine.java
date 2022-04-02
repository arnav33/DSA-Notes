import java.util.HashMap;
import java.util.Map;

public class PointsOnSameLine {
    int mod = (int)1e9 + 7;
    public int solve(int[] A, int[] B) {
        int max = 0;
        for(int i = 0; i < A.length - 1; i++) {
            Map<String, Integer> hm = new HashMap<>();
            int duplicate = 1;
            int currentMax = 0;
            for(int j = i + 1; j < B.length; j++) {
                int x1 = A[i], y1 = B[i], x2 = A[j], y2 = B[j];
                int x = x1 - x2, y = y1 - y2;
                if(x == 0 && y == 0) {
                    duplicate++;
                    continue;
                }
                int g = gcd(x, y);
                x = x / g;
                y = y / g;
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toString(x)).append("_").append(Integer.toString(y));
                int count = hm.getOrDefault(sb.toString(), 0);
                hm.put(sb.toString(), ++count);
                currentMax = Math.max(currentMax, count);
            }
            max = Math.max(max, currentMax + duplicate);
        }
        return max;
    }
    private int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}

/*

Q4. Points on same line
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given two arrays of integers A and B describing a pair of (A[i], B[i]) coordinates in a 2D plane. A[i] describe x coordinates of the ith point in the 2D plane, whereas B[i] describes the y-coordinate of the ith point in the 2D plane.

Find and return the maximum number of points that lie on the same line.



Problem Constraints

1 <= (length of the array A = length of array B) <= 1000

-105 <= A[i], B[i] <= 105



Input Format

The first argument is an integer array A.
The second argument is an integer array B.



Output Format

Return the maximum number of points which lie on the same line.



Example Input

Input 1:

 A = [-1, 0, 1, 2, 3, 3]
 B = [1, 0, 1, 2, 3, 4]

Input 2:

 A = [3, 1, 4, 5, 7, -9, -8, 6]
 B = [4, -8, -3, -2, -1, 5, 7, -4]



Example Output

Output 1:

 4

Output 2:

 2



Example Explanation

Explanation 1:

 The maximum number of point which lie on same line are 4, those points are {0, 0}, {1, 1}, {2, 2}, {3, 3}.

Explanation 2:

 Any 2 points lie on a same line.

*/