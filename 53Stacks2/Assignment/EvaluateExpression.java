import java.util.Stack;

public class EvaluateExpression {
    public int evalRPN(String[] A) {
        if(A.length == 1) return Integer.parseInt(A[0]);
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i = 0; i < A.length; i++) {
            String c = A[i];
            if(s.empty()) {
                s.push(Integer.parseInt(c));
                continue;
            }
            if("+-*/".indexOf(c) >= 0) {
                int x = s.pop();
                int y = s.pop();
                switch(c) {
                    case "+":
                        ans = (y + x);
                        break;
                    case "-":
                        ans = (y - x);
                        break;
                    case "*":
                        ans = (y * x);
                        break;
                    case "/":
                        ans = (y / x);
                        break;
                }
                s.push(ans);
            } else s.push(Integer.parseInt(c));
        }
        return ans;
    }
}

/*

Q2. Evaluate Expression
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

An arithmetic expression is given by a character array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each character may be an integer or an operator.



Problem Constraints

1 <= N <= 105



Input Format

The only argument given is character array A.



Output Format

Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input

Input 1:
    A =   ["2", "1", "+", "3", "*"]

Input 2:
    A = ["4", "13", "5", "/", "+"]



Example Output

Output 1:
    9

Output 2:
    6



Example Explanation

Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9

Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    13 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6


*/