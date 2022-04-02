module.exports = {
    //param A : array of integers
    //return a array of array of integers
    permute: function (A) {
        let ans = [];
        go([], [...A], ans);
        return ans;
    }
};
function go(out, A, ans) {
    if (A.length === 0) {
        let length = ans.length;
        ans.push(out);
        return;
    }
    for (let i = 0; i < A.length; i++) {
        let eq = false;
        if (i > 0) {
            for (let j = 0; j < i; j++) {
                if (A[i] === A[j]) {
                    eq = true;
                    break;
                }
            }
        }
        if (eq) continue;
        let num = A[i];
        let arr = [...out];
        arr.push(num);
        let B = A.filter((e, j) => i !== j);
        go(arr, B, ans);
    }
}

/*

Q1. All Unique Permutations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of size N denoting collection of numbers that might contain duplicates, return all possible unique permutations.

NOTE: No 2 entries in the permutation sequence should be the same.

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.



Problem Constraints

1 <= |A| <= 9

0 <= A[i] <= 10



Input Format

Only argument is an integer array A of size N.


Output Format

Return a 2-D array denoting all possible unique permutation of the array.


Example Input

Input 1:

A = [1, 1, 2]

Input 2:

A = [1, 2]



Example Output

Output 1:

[ [1,1,2]
  [1,2,1]
  [2,1,1] ]

Output 2:

[ [1, 2]
  [2, 1] ]



Example Explanation

Explanation 1:

 All the possible unique permutation of array [1, 1, 2].

Explanation 2:

 All the possible unique permutation of array [1, 2].

*/