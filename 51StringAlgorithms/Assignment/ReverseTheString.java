public class ReverseTheString {
    public String solve(String A) {
        String[] C = A.split(" ");
        int i = 0, j = C.length - 1;
        while(i < j) {
            String t = C[i];
            C[i] = C[j];
            C[j] = t;
            i++;
            j--;
        }
        return String.join(" ", C);
    }
}

/*

Q1. Reverse the String
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

    A sequence of non-space characters constitutes a word.
    Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
    If there are multiple spaces between words, reduce them to a single space in the reversed string.



Problem Constraints

1 <= N <= 3 * 105



Input Format

The only argument given is string A.



Output Format

Return the string A after reversing the string word by word.



Example Input

Input 1:
    A = "the sky is blue"

Input 2:
    A = "this is ib"



Example Output

Output 1:
    "blue is sky the"

Output 2:
    "ib is this"    



Example Explanation

Explanation 1:
    We reverse the string word by word so the string becomes "the sky is blue".

Explanation 2:
    We reverse the string word by word so the string becomes "this is ib".


*/