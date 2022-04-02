module.exports = {
    //param A : integer
    //return an integer
    solve: function (A) {
        let s = A.toString(2);
        let x = '';
        for (let i = 0; i < s.length; i++) {
            if (s[i] == '1') x += '0';
            else if (s[i] == '0') x += '1';
        }
        let a = parseInt(x, 2);
        let y = '1';
        for (let i = 0; i < s.length; i++) {
            y += '0';
        }
        let b = parseInt(y, 2);
        return a + b;
    }
};


/*

Q3. Strange Equality
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer A.
Two numbers, X and Y, are defined as follows:

    X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
    Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.

Find and return the XOR of X and Y.

NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.

NOTE 2: Your code will be run against a maximum of 100000 Test Cases.



Problem Constraints

1 <= A <= 109



Input Format

First and only argument is an integer A.



Output Format

Return an integer denoting the XOR of X and Y.



Example Input

A = 5



Example Output

10



Example Explanation

The value of X will be 2 and the value of Y will be 8. The XOR of 2 and 8 is 10.




*/