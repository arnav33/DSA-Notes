module.exports = {
    //param A : array of integers
    //return an integer
    singleNumber: function (A) {
        let arr = new Array(32).fill(0);
        for (let i = 0; i < A.length; i++) {
            let str = A[i].toString(2);
            str = str.split("").reverse().join("");
            for (let j = 0; j < str.length; j++) {
                arr[j] += Number(str[j]);
            }
        }
        for (let i = 0; i < arr.length; i++) {
            arr[i] %= 3;
        }
        arr = arr.reverse();
        return parseInt(arr.join(""), 2);
    }
};

/*

Q2. Single Number II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?



Problem Constraints

    2 <= A <= 5*106

    0 <= A <= INTMAX



Input Format

First and only argument of input contains an integer array A.



Output Format

Return a single integer.



Example Input

Input 1:

 A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]

Input 2:

 A = [0, 0, 0, 1]



Example Output

Output 1:

 4

Output 2:

 1



Example Explanation

Explanation 1:

 4 occurs exactly once in Input 1.
 1 occurs exactly once in Input 2.
 
*/