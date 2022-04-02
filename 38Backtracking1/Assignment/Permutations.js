module.exports = {
    //param A : array of integers
    //return a array of array of integers
    permute: function (A) {
        let ans = [];   // final ans
        go([], [...A], ans);
        return ans;
    }
};
function go(arr, A, ans) {  // arr = individual array inside ans
    if (A.length === 0) {
        ans.push(arr);
        return;
    }
    for (let i = 0; i < A.length; i++) {
        let num = A[i];         // taken 1 element out
        let x = [...arr];
        x.push(num);
        let B = A.filter((e, j) => i !== j);    // remaining element after removing the element
        go(x, B, ans);
    }
}

/*

Q1. Permutations
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer array A of size N denoting collection of numbers , return all possible permutations.

NOTE:

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.
Return the answer in any order

WARNING: DO NOT USE LIBRARY FUNCTION FOR GENERATING PERMUTATIONS. Example : next_permutations in C++ / itertools.permutations in python.
If you do, we will disqualify your submission retroactively and give you penalty points.



Problem Constraints

1 <= N <= 9


Input Format

Only argument is an integer array A of size N.


Output Format

Return a 2-D array denoting all possible permutation of the array.


Example Input

A = [1, 2, 3]



Example Output

[ [1, 2, 3]
  [1, 3, 2]
  [2, 1, 3] 
  [2, 3, 1] 
  [3, 1, 2] 
  [3, 2, 1] ]



Example Explanation

All the possible permutation of array [1, 2, 3].

*/