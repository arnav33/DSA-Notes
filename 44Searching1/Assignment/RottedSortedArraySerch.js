module.exports = {
    //param A : array of integers
    //param B : integer
    //return an integer
    search: function (A, B) {
        return findIndex(0, A.length - 1, A, B);
    }
};
function findIndex(start, end, A, B) {
    if (start >= end) return -1;
    if (A[start] === B) return start;
    if (A[end] === B) return end;
    let mid = Math.floor((start + end) / 2);
    if (A[mid] === B) return mid;
    if (A[0] < A[mid]) {
        if (B >= A[0] && B <= A[mid]) end = mid - 1;
        else start = mid + 1;
    } else {
        if (B <= A[A.length - 1] && B >= A[mid]) start = mid + 1;
        else end = mid - 1;
    }
    return findIndex(start, end, A, B);
}

/*

Q2. Rotated Sorted Array Search
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a sorted array of integers A of size N and an integer B.

array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2 ).

You are given a target value B to search. If found in the array, return its index otherwise, return -1.

You may assume no duplicate exists in the array.

NOTE: Users are expected to solve this in O(log(N)) time.



Problem Constraints

1 <= N <= 1000000

1 <= A[i] <= 10^9

all elements in A are distinct.



Input Format

The first argument given is the integer array A.

The second argument given is the integer B.



Output Format

Return index of B in array A, otherwise return -1



Example Input

Input 1:

A = [4, 5, 6, 7, 0, 1, 2, 3]
B = 4 

Input 2:

A = [1]
B = 1



Example Output

Output 1:

 0 

Output 2:

 0



Example Explanation

Explanation 1:

 
Target 4 is found at index 0 in A. 

Explanation 2:

 
Target 1 is found at index 0 in A.

*/