import java.util.Stack;

public class MaximumRectangle {
    public int solve(int[][] A) {
        // copy of A prefixsum vertically
        int[][] B = new int[A.length][A[0].length];
        // 1 0 0    // i = 0
        // 0 1 1
        // 1 1 1
        // [1]
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A[0].length; j++) {
                if(i == 0 || A[i][j] == 0) B[i][j] = A[i][j];
                else B[i][j] = B[i - 1][j] + 1;
            }
        }
        // [1 2 3 1 2] // sl
        // [1 2 3 1 2] // sr
        // [-1 0 1]
        // 
        int max = 0;
        // for(int i = 0; i < A.length; i++) {
        //     System.out.println(Arrays.toString(A[i]));
        // }
        for(int i = 0; i < B.length; i++) {
            int[] sl = smallLeft(B[i]);
            int[] sr = smallRight(B[i]);
            // System.out.println(Arrays.toString(B[i]));
            // System.out.println(Arrays.toString(sl));
            // System.out.println(Arrays.toString(sr));
            // System.out.println(i);
            for(int j = 0; j < B[0].length; j++) {
                // int wl = j - sl[j];
                // int wr = sr[j] - j;
                // int wt = wl + wr;
                int w = sr[j] - sl[j] - 1;
                int area = w * B[i][j];
                max = (int)Math.max(max, area);
            }
        }
        return max;
    }
    private int[] smallRight(int[] A) {
        int[] B = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = A.length - 1; i >= 0; i--) {
            while(!s.empty() && A[s.peek()] >= A[i]) s.pop();
            if(s.empty()) B[i] = A.length;
            else if(A[s.peek()] < A[i]) B[i] = s.peek();
            s.push(i);
        }
        return B;
    }
    private int[] smallLeft(int[] A) {
        int[] B = new int[A.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            while(!s.empty() && A[s.peek()] >= A[i]) s.pop();
            if(s.empty()) B[i] = -1;
            else if(A[s.peek()] < A[i]) B[i] = s.peek();
            s.push(i);
        }
        return B;
    }
}

/*

Q3. Maximum Rectangle
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Given a 2D binary matrix of integers A containing 0's and 1's of size N x M.

Find the largest rectangle containing only 1's and return its area.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.


Input Format

The only argument given is the integer matrix A.

Output Format

Return the area of the largest rectangle containing only 1's.

Constraints

1 <= N, M <= 1000
0 <= A[i] <= 1

For Example

Input 1:
    A = [   [0, 0, 1]
            [0, 1, 1]
            [1, 1, 1]   ]
Output 1:
    4

Input 2:
    A = [   [0, 1, 0, 1]
            [1, 0, 1, 0]    ]
Output 2:
    1


*/