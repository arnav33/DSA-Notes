public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String A) {
        int max = 0, c = 0;
        String str = "";
        for(int i = 0; i < A.length(); i++) {
            if(str.contains(Character.toString(A.charAt(i)))) {
                int j = str.indexOf(A.charAt(i));
                if(str.length() - 1 > j) str = str.substring(j + 1);
                else str = "";
                str += A.charAt(i);
                c = str.length();
            } else {
                str += A.charAt(i);
                c++;
                max = Math.max(c, max);
            }
        }
        return max;
    }
}

/*

Q2. Longest Substring Without Repeat
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a string A, find the length of the longest substring without repeating characters.

Note: Users are expected to solve in O(N) time complexity.



Problem Constraints

1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format

Single Argument representing string A.



Output Format

Return an integer denoting the maximum possible length of substring without repeating characters.



Example Input

Input 1:

 A = "abcabcbb"

Input 2:

 A = "AaaA"



Example Output

Output 1:

 3

Output 2:

 2



Example Explanation

Explanation 1:

 Substring "abc" is the longest substring without repeating characters in string A.

Explanation 2:

 Substring "Aa" or "aA" is the longest substring without repeating characters in string A.

*/