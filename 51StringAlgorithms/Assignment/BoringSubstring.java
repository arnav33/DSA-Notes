public class BoringSubstring {
    public int solve(String A) {
        int ol = 'y', or = 'a', el = 'z', er = 'b';
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            int cv = (int)c;
            if(cv % 2 == 0) {
                er = Math.max(er, c);
                el = Math.min(el, c);
            } else {
                or = Math.max(or, c);
                ol = Math.min(ol, c);
            }
        }
        if(Math.abs(el - ol) > 1 ||
            Math.abs(el - or) > 1 ||
            Math.abs(er - ol) > 1 ||
            Math.abs(er - or) > 1
        ) return 1;
        return 0;
    }
}

/*

Q2. Boring substring
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given a string A of lowercase English alphabets. Rearrange the characters of the given string A such that there is no boring substring in A.

A boring substring has the following properties:

    Its length is 2.
    Both the characters are consecutive, for example - "ab", "cd", "dc", "zy" etc.(If the first character is C then the next character can be either (C+1) or (C-1)).

Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Problem Constraints

1 <= |A| <= 105



Input Format

The only argument given is a string A.



Output Format

Return 1 if it is possible to rearrange the letters of A such that there are no boring substrings in A else, return 0.



Example Input

Input 1:

 A = "abcd"

Input 2:

 A = "aab"



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 String A can be rearranged into "cadb" or "bdac" 

Explanation 2:

 No arrangement of string A can make it free of boring substrings.




*/