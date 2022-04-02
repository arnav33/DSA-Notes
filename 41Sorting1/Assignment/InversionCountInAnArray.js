const mod = 1e9 + 7;
module.exports = {
    //param A : array of integers
    //return an integer
    solve: function (A) {
        let sum = [0];
        sort(A, sum);
        return sum[0];
    }
};
function sort(A, sum) {
    if (A.length < 2) return;
    let mid = Math.floor(A.length / 2);
    let left = [], right = [];
    for (let i = 0; i < mid; i++) {
        left.push(A[i]);
    }
    for (let i = mid; i < A.length; i++) {
        right.push(A[i]);
    }
    sort(left, sum);
    sort(right, sum);
    merge(left, right, A, sum);
}
function merge(left, right, A, sum) {
    let i = 0, j = 0, k = 0;
    let arr = null, x = 0;
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            A[k++] = left[i++];
        }
        else {
            A[k++] = right[j++];
            sum[0] += left.length - i;
            sum[0] %= mod;
        };
        if (i === left.length) {
            arr = right;
            x = j;
        }
        if (j === right.length) {
            arr = left;
            x = i;
        }
    }
    while (x < arr.length) {
        A[k++] = arr[x++];
    }
}

/*

Q3. Inversion count in an array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints

1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.



Output Format

Return the number of inversions of A modulo (109 + 7).



Example Input

Input 1:

A = [3, 2, 1]

Input 2:

A = [1, 2, 3]



Example Output

Output 1:

3

Output 2:

0



Example Explanation

Explanation 1:

 All pairs are inversions.

Explanation 2:

 No inversions.

 
*/