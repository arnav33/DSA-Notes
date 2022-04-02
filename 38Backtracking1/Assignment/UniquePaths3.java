public class UniquePaths3 {
    int ans = 0;
    public int solve(int[][] A) {
        int i = 0, j = 0, pc = 0;
        for(int k = 0; k < A.length; k++) {
            for(int l = 0; l < A[0].length; l++) {
                if(A[k][l] == 1) {
                    i = k;
                    j = l;
                }
                if(A[k][l] == 0) pc++;
            }
        }
        eval(A, i, j, 0, pc);
        return ans;
    }
    private void eval(int[][] A, int i, int j, int lpc, int pc) {
        if(!check(A, i, j)) return;
        if(A[i][j] == 0) lpc++;
        if(A[i][j] == 2) {
            if(lpc == pc) ans++;
            return;
        }
        A[i][j] = -1;
        eval(A, i, j + 1, lpc, pc);
        eval(A, i, j - 1, lpc, pc);
        eval(A, i + 1, j, lpc, pc);
        eval(A, i - 1, j, lpc, pc);
        A[i][j] = 0;
    }
    private boolean check(int[][] A, int i, int j) {
        return 0 <= i && i < A.length && 0 <= j && j < A[0].length && A[i][j] != -1;
    }
}

/*

Q3. Unique Paths III
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a matrix of integers A of size N x M . There are 4 types of squares in it:

1. 1 represents the starting square.  There is exactly one starting square.
2. 2 represents the ending square.  There is exactly one ending square.
3. 0 represents empty squares we can walk over.
4. -1 represents obstacles that we cannot walk over.

Find and return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints

2 <= N * M <= 20
-1 <= A[i] <= 2


Input Format

The first argument given is the integer matrix A.


Output Format

Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.


Example Input

Input 1:

A = [   [1, 0, 0, 0]
        [0, 0, 0, 0]
        [0, 0, 2, -1]   ]

Input 2:

A = [   [0, 1]
        [2, 0]    ]



Example Output

Output 1:

2

Output 2:

0



Example Explanation

Explanation 1:

We have the following two paths: 
1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)

Explanation 1:

Answer is evident here.


*/