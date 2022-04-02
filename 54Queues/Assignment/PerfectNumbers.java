import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {
    public String solve(int A) {
        if(A == 1) return "11";
        if(A == 2) return "22";
        Queue<String> q = new LinkedList<>();
        int i = 0;
        while(i != A) {
            if(q.size() == 0) q.add("1");
            else if(q.size() == 1) q.add("2");
            else {
                String str = q.remove();
                String nStr = str + "1";
                q.add(nStr);
                i++;
                if(i == A) {
                    StringBuilder sb = new StringBuilder(nStr);
                    nStr += sb.reverse();
                    return nStr;
                }
                nStr = str + "2";
                q.add(nStr);
                if(i + 1 == A) {
                    StringBuilder sb = new StringBuilder(nStr);
                    nStr += sb.reverse();
                    return nStr;
                }
            }
            i++;
        }
        return "1";
    }
}

/*

Q2. Perfect Numbers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.

The number of digits in a Perfect number is even.

It is a palindrome number.

For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.



Problem Constraints

1 <= A <= 100000



Input Format

The only argument given is an integer A.



Output Format

Return a string that denotes the Ath Perfect Number.



Example Input

Input 1:

 A = 2

Input 2:

 A = 3



Example Output

Output 1:

 22

Output 2:

 1111



Example Explanation

Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221

Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221


*/