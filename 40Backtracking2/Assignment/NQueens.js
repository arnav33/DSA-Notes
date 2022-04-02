module.exports = {
    //param A : integer
    //return a array of array of integers
    solveNQueens: function (A) {
        let ans = [];
        eval(parse(A), 0, 0, A, ans);
        return ans.reverse();
    }
};
function eval(x, i, j, A, ans) {
    if (check(x, i, j, A)) {
        let y = JSON.parse(JSON.stringify(x));
        x[i] = update(x[i], j, "Q");
        if (i == A - 1) {
            ans.push(x);
            return;
        }
        if (i < A - 1) eval(x, i + 1, 0, A, ans);
        if (j < A - 1) eval(y, i, j + 1, A, ans);
    } else {
        if (j < A - 1) eval(x, i, j + 1, A, ans);
    }
}
function update(s, j, v) {
    let d = s.split('');
    d[j] = v;
    return d.join('');
}
function parse(A) {
    let y = [];
    for (let i = 0; i < A; i++) {
        let str = "";
        for (let j = 0; j < A; j++) {
            str += ".";
        }
        y.push(str);
    }
    return y;
}
function check(x, i, j, A) {
    let ans = true;
    for (let k = 0; k < A; k++) {
        let c1 = x[i][k] === "Q";
        let c2 = x[k][j] === "Q";
        let c3 = i >= k && j >= k && x[i - k][j - k] === "Q";
        let c4 = i >= k && j + k < A && x[i - k][j + k] === "Q";
        if (c1 || c2 || c3 || c4) {
            ans = false;
            break;
        }
    }
    return ans;
}

/*

Q1. NQueens
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

Given an integer A, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.



Problem Constraints

1 <= A <= 10


Input Format

First argument is an integer n denoting the size of chessboard


Output Format

Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.


Example Input

Input 1:

A = 4

Input 2:

A = 1



Example Output

Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]

Output 1:

[
 [Q]
]



Example Explanation

Explanation 1:

There exist only two distinct solutions to the 4-queens puzzle:

Explanation 1:

There exist only one distinct solutions to the 1-queens puzzle:

*/