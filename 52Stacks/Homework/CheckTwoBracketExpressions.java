import java.util.Stack;

public class CheckTwoBracketExpressions {
    public int solve(String A, String B) {
        String[] a = eval(A);
        String[] b = eval(B);
        for(int i = 0; i < 26; i++) {
            if(!a[i].equals(b[i])) return 0;
        }
        return 1;
    }
    private String[] eval(String A) {
        String[] ans = new String[26];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = "0";
        }
        String str = "abcdefghijklmnopqrstuvwxyz";
        Stack<Boolean> sign = new Stack<>();
        sign.push(true);
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(c == '+' && A.charAt(i + 1) == '(') sign.push(sign.peek());
            if(c == '-' && A.charAt(i + 1) == '(') sign.push(!sign.peek());
            if(c == ')') sign.pop();
            if(str.indexOf(c) >= 0) {
                boolean es = true;
                if(i > 0 && A.charAt(i - 1) == '-') es = !sign.peek();
                else es = sign.peek();
                int j = str.indexOf(c);
                if(es) ans[j] = "+" + c;
                else ans[j] = "-" + c;
            }
        }
        return ans;
    }
}

/*

Q4. Check two bracket expressions
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given two strings A and B. Each string represents an expression consisting of lowercase English alphabets, '+', '-', '(' and ')'.

The task is to compare them and check if they are similar. If they are identical, return 1 else, return 0.

NOTE: It may be assumed that there are at most 26 operands from ‘a’ to ‘z’, and every operand appears only once.



Problem Constraints

1 <= length of the each String <= 100



Input Format

The given arguments are string A and string B.



Output Format

Return 1 if they represent the same expression else return 0.



Example Input

Input 1:

 A = "-(a+b+c)"
 B = "-a-b-c"

Input 2:

 A = "a-b-(c-d)"
 B = "a-b-c-d"



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 The expression "-(a+b+c)" can be written as "-a-b-c" which is equal as B. 

Explanation 2:

 Both the expression are different.

*/