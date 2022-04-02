const mod = 1e9 + 7;
module.exports = {
    //param A : array of integers
    //return an integer
    solve: function (A) {
        sort(A);
        let arr = [1];
        for (let i = 1; i < A.length; i++) {
            let x = arr[i - 1] * 2 % mod;
            arr.push(x);
        }
        let min = 0, max = 0;
        for (let i = 0; i < A.length; i++) {
            min += A[i] * arr[i] % mod;
            max += A[i] * arr[A.length - i - 1] % mod;
            max %= mod;
            min %= mod;
        }
        let res = min - max;
        res %= mod;
        if (res < 0) res += mod;
        return res;
    }
};
function sort(A) {
    if (A.length < 2) return;
    let mid = Math.floor(A.length / 2);
    let left = [], right = [];
    for (let i = 0; i < mid; i++) {
        left.push(A[i]);
    }
    for (let i = mid; i < A.length; i++) {
        right.push(A[i]);
    }
    sort(left);
    sort(right);
    merge(left, right, A);
}
function merge(left, right, A) {
    let i = 0, j = 0, k = 0;
    let arr = null, x = 0;
    while (i < left.length && j < right.length) {
        if (left[i] <= right[j]) {
            A[k++] = left[i++];
        } else {
            A[k++] = right[j++];
        }
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

Q2. Sum the Difference
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description
Given an integer array, A of size N.

You have to find all possible non-empty subsequences of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence. Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.



Problem Constraints

1 <= N <= 10000

1<= A[i] <=1000



Input Format

First argument is an integer array A.



Output Format

Return an integer denoting the output.



Example Input

Input 1:

A = [1, 2] 

Input 2:

A = [1]



Example Output

Output 1:

 1 

Output 2:

 0



Example Explanation

Explanation 1:

All possible non-empty subsets are:
[1]    largest-smallest = 1 - 1 = 0
[2]    largest-smallest = 2 - 2 = 0
[1 2]  largest-smallest = 2 - 1 = 1
Sum of the differences = 0 + 0 + 1 = 1
So, the resultant number is 1 

Explanation 2:

 Only 1 subsequence of 1 element is formed.

*/