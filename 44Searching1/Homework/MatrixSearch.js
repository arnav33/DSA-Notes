module.exports = {
    //param A : array of array of integers
    //param B : integer
    //return an integer
    searchMatrix: function (A, B) {
        let arrI = getArr(A, B, 0, A.length - 1);
        return getEl(A[arrI], B, 0, A[0].length - 1);

    }
};
function getEl(A, B, start, end) {
    if (start > end) return 0;
    if (A[start] === B) return 1;
    if (A[end] === B) return 1;
    let mid = Math.floor((start + end) / 2);
    if (A[mid] === B) return 1;
    if (B > A[mid]) start = mid + 1;
    else end = mid - 1;
    return getEl(A, B, start, end);
}
function getArr(A, B, start, end) {
    if (start > end) return 0;
    if (A[start][0] <= B && B <= A[start][A[0].length - 1]) return start;
    if (A[end][0] <= B && B <= A[end][A[0].length - 1]) return end;
    let mid = Math.floor((start + end) / 2);
    if (A[mid][0] <= B && B <= A[mid][A[0].length - 1]) return mid;
    if (B > A[mid][A[0].length - 1]) start = mid + 1;
    else end = mid - 1;
    return getArr(A, B, start, end);
}

/*

Q1. Matrix Search
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a matrix of integers A of size N x M and an integer B. Write an efficient algorithm that searches for integer B in matrix A.

This matrix A has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than or equal to the last integer of the previous row.

Return 1 if B is present in A, else return 0.

NOTE: Rows are numbered from top to bottom, and columns are from left to right.



Problem Constraints

1 <= N, M <= 1000
1 <= A[i][j], B <= 106



Input Format

The first argument given is the integer matrix A.
The second argument given is the integer B.



Output Format

Return 1 if B is present in A else, return 0.



Example Input

Input 1:

A = [ 
      [1,   3,  5,  7]
      [10, 11, 16, 20]
      [23, 30, 34, 50]  
    ]
B = 3

Input 2:

A = [   
      [5, 17, 100, 111]
      [119, 120, 127, 131]    
    ]
B = 3



Example Output

Output 1:

1

Output 2:

0



Example Explanation

Explanation 1:

 3 is present in the matrix at A[0][1] position so return 1.

Explanation 2:

 3 is not present in the matrix so return 0.

*/