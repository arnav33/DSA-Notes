import java.util.HashMap;
import java.util.Stack;

public class BalancedParenthesis {
    HashMap<Character, Character> hm = new HashMap<>();
    char c1 = '(', c2 = ')', c3 = '[', c4 = ']', c5 = '{', c6 = '}';
    Stack<Character> s = new Stack<>();
    public int solve(String A) {
        hm.put(c1, c2);
        hm.put(c3, c4);
        hm.put(c5, c6);
        for(int i = 0; i < A.length(); i++) {
            if(s.empty()) {
                s.push(A.charAt(i));
                continue;
            }
            char c = s.peek();
            if(hm.containsKey(c) && hm.get(c) == A.charAt(i)) {
                s.pop();
                continue;
            }
            s.push(A.charAt(i));
        }
        if(s.size() == 0) return 1;
        return 0;
    }
}

/*

Q1. Balanced Paranthesis
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints

1 <= |A| <= 100



Input Format

The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format

Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input

Input 1:

 A = {([])}

Input 2:

 A = (){

Input 3:

 A = ()[] 



Example Output

Output 1:

 1 

Output 2:

 0 

Output 3:

 1 



Example Explanation

You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.

*/