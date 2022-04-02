import java.util.Stack;

public class InfixToPostfix {
    public String solve(String A) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> s = new Stack<>();
        String clist = "abcdefghijklmnopqrstuvwxyz";
        String pm = "+-";
        String md = "*/";
        String e = "^";
        String b = "()";
        // qct*o*+gg*qia-*p+il*
        // qct*o*+gg*+qia-*p*+il*-              // qct*o*+
        // q+(c*t)*o+(g*g)+q*(i-a)*p-(i*l)      // 
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(clist.indexOf(c) >= 0) ans.append(c);    // c - operand
            else if(s.empty()) s.push(c);               // s is empty
            else {                                      // operators
                char p = s.peek();
                if(b.indexOf(c) >= 0) {                     // c - brackets
                    if(b.indexOf(p) >= 0) {                 // p - brackets
                        if(c == p) {
                            s.push(c);
                            p = s.peek();
                        }
                        else {
                            s.pop();
                            if(s.empty()) p = '$';
                            else p = s.peek();
                        }
                    }
                    else {                              // p - no bracket, c - bracket
                        if(c == '(') {
                            s.push(c);
                            p = s.peek();
                        }
                        else {                          // c - closing nracket
                            while(!s.empty() && !(b.indexOf(p) >= 0)) {
                                ans.append(s.pop());
                                if(s.empty()) p = '$';
                                else p = s.peek();
                            }
                            if(!s.empty()) {
                                s.pop();
                                if(s.empty()) p = '$';
                                else p = s.peek();
                            }
                            
                        }
                    }
                } else {
                    // Incoming higher precedence
                    boolean pe = e.indexOf(c) >= 0 && (md.indexOf(p) >= 0 || pm.indexOf(p) >= 0);
                    boolean pmd = md.indexOf(c) >= 0 && pm.indexOf(p) >= 0;
                    boolean pb = b.indexOf(p) >= 0;
                    if(pe || pmd || pb) {
                        s.push(c);
                        p = s.peek();
                        continue;
                    }

                    // Incoming lower or equal precedence
                    p = s.peek();
                    boolean ppm = pm.indexOf(c) >= 0 && (pm.indexOf(p) >= 0 || md.indexOf(p) >= 0 || e.indexOf(p) >= 0);
                    pmd = md.indexOf(c) >= 0 && (md.indexOf(p) >= 0 || e.indexOf(p) >= 0);
                    pe = e.indexOf(c) >= 0 && e.indexOf(p) >= 0;
                    while(!s.empty() && (ppm || pmd || pe)) {
                        ans.append(s.pop());
                        if(s.empty()) break;
                        if(s.empty()) {
                            p = '$';
                            break;
                        } p = s.peek();
                        ppm = pm.indexOf(c) >= 0 && (pm.indexOf(p) >= 0 || md.indexOf(p) >= 0 || e.indexOf(p) >= 0);
                        pmd = md.indexOf(c) >= 0 && (md.indexOf(p) >= 0 || e.indexOf(p) >= 0);
                        pe = e.indexOf(c) >= 0 && e.indexOf(p) >= 0;
                        // pp = b.indexOf(p) >= 0;
                    }
                    s.push(c);
                }
            }
        }
        while(!s.empty()) ans.append(s.pop());
        return ans.toString();
    }
}



// Q1. Infix to Postfix
// Solved
// character backgroundcharacter
// Stuck somewhere?
// Ask for help from a TA & get it resolved
// Get help from TA

// Problem Description

// Given string A denoting an infix expression. Convert the infix expression into a postfix expression.

// String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are operands and ^, /, *, +, - are operators.

// Find and return the postfix expression of A.

// NOTE:

//     ^ has the highest precedence.
//     / and * have equal precedence but greater than + and -.
//     + and - have equal precedence and lowest precedence among given operators.



// Problem Constraints

// 1 <= length of the string <= 500000



// Input Format

// The only argument given is string A.



// Output Format

// Return a string denoting the postfix conversion of A.



// Example Input

// Input 1:

//  A = "x^y/(a*z)+b"

// Input 2:

//  A = "a+b*(c^d-e)^(f+g*h)-i"



// Example Output

// Output 1:

//  "xy^az*/b+"

//  Output 2:

//  "abcd^e-fgh*+^*+i-"



// Example Explanation

// Explanation 1:

//  Ouput dentotes the postfix expression of the given input.

