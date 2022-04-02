import java.util.Collections;
import java.util.Stack;

public class DoubleCharacterTrouble {
    public String solve(String A) {
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(s.empty()) s.push(c);
            else if(s.peek().equals(c)) s.pop();        // abbbcd
            else s.push(c);
        }
        Collections.reverse(s); // n
        StringBuilder sb = new StringBuilder();
        while(!s.empty()) sb.append(s.pop());   // n
        return sb.toString();
    }
}


/*

Q1. Double Character Trouble
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given a string A.

An operation on the string is defined as follows:

Remove the first occurrence of the same consecutive characters. eg for a string "abbcd", the first occurrence of same consecutive characters is "bb".

Therefore the string after this operation will be "acd".

Keep performing this operation on the string until there are no more occurrences of the same consecutive characters and return the final string.



Problem Constraints

1 <= |A| <= 100000



Input Format

First and only argument is string A.



Output Format

Return the final string.



Example Input

Input 1:

 A = abccbc

Input 2:

 A = ab



Example Output

Output 1:

 "ac"

Output 2:

 "ab"



Example Explanation

Explanation 1:

Remove the first occurrence of same consecutive characters. eg for a string "abbc", 
the first occurrence of same consecutive characters is "bb".
Therefore the string after this operation will be "ac".

Explanation 2:

 No removals are to be done.


*/