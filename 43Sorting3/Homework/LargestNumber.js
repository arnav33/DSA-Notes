module.exports = {
    //param A : array of integers
    //return a strings
    largestNumber: function (A) {
        let B = A.map(x => String(x));
        sort(B);
        let ans = B.join('');
        let index = 0;
        while (ans[index] === '0') {
            index++;
        }
        ans = ans.substring(index);
        if (ans.length === 0) return '0';
        return ans;
    }
};
function sort(B) {
    if (B.length < 2) return;
    let mid = Math.floor(B.length / 2);
    let left = [], right = [];
    for (let i = 0; i < mid; i++) {
        left.push(B[i]);
    }
    for (let i = mid; i < B.length; i++) {
        right.push(B[i]);
    }
    sort(left);
    sort(right);
    merge(left, right, B);
}
function merge(left, right, B) {
    let i = 0, j = 0, k = 0;
    let x = 0, arr = null;
    while (i < left.length && j < right.length) {
        if (comp(left[i], right[j])) B[k++] = left[i++];
        else B[k++] = right[j++];
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
        B[k++] = arr[x++];
    }
}
function comp(x, y) {
    if (x + y <= y + x) return false;
    else return true;
}

/*

Q1. Largest Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of non-negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints

1 <= len(A) <= 100000
0 <= A[i] <= 2*109



Input Format

The first argument is an array of integers.



Output Format

Return a string representing the largest number.



Example Input

Input 1:

 A = [3, 30, 34, 5, 9]

Input 2:

 A = [2, 3, 9, 0]



Example Output

Output 1:

 "9534330"

Output 2:

 "9320"



Example Explanation

Explanation 1:

Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.

Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.




*/