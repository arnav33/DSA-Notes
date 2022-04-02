import java.util.Stack;

public class RedundantBraces {
    public int braces(String A) {
        String p = "(+-*/";
        String o = "+-*/";
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(A.charAt(i) == ')' && s.peek() == '(') return 1;
            if(p.indexOf(c) >= 0) s.push(c);
            else {
                if(c == ')') {
                    while(o.indexOf(s.peek()) >= 0) {
                        s.pop();
                    }
                    if(s.peek() == '(') s.pop();
                }
            }
        }
        return 0;
    }
}

/*

Q2. Redundant Braces
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.

Check whether A has redundant braces or not.

NOTE: A will be always a valid expression and will not contain any white spaces.



Problem Constraints

1 <= |A| <= 105



Input Format

The only argument given is string A.



Output Format

Return 1 if A has redundant braces else, return 0.



Example Input

Input 1:

 A = "((a+b))"

Input 2:

 A = "(a+(a+b))"



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 ((a+b)) has redundant braces so answer will be 1.

Explanation 2:

 (a+(a+b)) doesn't have have any redundant braces so answer will be 0.

*/