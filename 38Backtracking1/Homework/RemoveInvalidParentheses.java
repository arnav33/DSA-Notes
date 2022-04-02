import java.util.ArrayList;
import java.util.HashSet;

public class RemoveInvalidParentheses {
    int ob = 0, cb = 0;
    HashSet<String> s = new HashSet<>();
    public ArrayList<String> solve(String A) {
        count(A);
        eval(new String(A), "", ob, cb, 0, 0);
        ArrayList<String> ans = new ArrayList<>();
        for(String sans : s) {
            ans.add(sans);
        }
        return ans;
    }
    private void eval(String A, String lout, int ob, int cb, int balance, int i) {
        if(i == A.length()) {
            if(ob == 0 && cb == 0) s.add(lout);
        }
        else if(balance >= 0) {
            char c = A.charAt(i);
            if(c == '(' && ob > 0) eval(A, lout, ob - 1, cb, balance, i + 1);
            if(c == ')' && cb > 0) eval(A, lout, ob, cb - 1, balance, i + 1);
            int d = 0;
            if(c == '(') d = 1;
            if(c == ')') d = -1;
            eval(A, lout + A.charAt(i), ob, cb, balance + d, i + 1);
        }
    }
    private void count(String A) {
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(c == '(') ob++;
            if(c == ')') {
                if(ob > 0) ob--;
                else cb++;
            }
        }
    }
}

/*

Q3. Remove Invalid Parentheses
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a string A consisting of lowercase English alphabets and parentheses '(' and ')'. Remove the minimum number of invalid parentheses in order to make the input string valid.

Return all possible results.

You can return the results in any order.



Problem Constraints

1 <= length of the string <= 20


Input Format

The only argument given is string A.


Output Format

Return all possible strings after removing the minimum number of invalid parentheses.


Example Input

Input 1:

 A = "()())()"

Input 2:

 A = "(a)())()"



Example Output

Output 1:

 ["()()()", "(())()"]

Output 2:

 ["(a)()()", "(a())()"]



Example Explanation

Explanation 1:

 By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 4 then string becomes : "()()()"
        2. Remove the parentheses at index 2 then string becomes : "(())()"

Explanation 2:

 By removing 1 parentheses we can make the string valid.
        1. Remove the parentheses at index 5 then string becomes : "(a)()()"
        2. Remove the parentheses at index 2 then string becomes : "(a())()"

        
*/