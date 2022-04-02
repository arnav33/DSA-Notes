public class LetterPhone {
    String[] ref = "0 1 abc def ghi jkl mno pqrs tuv wxyz".split(" ");
    public String[] letterCombinations(String A) {
        String[] temp = new String[1];
        temp[0] = "";
        // String[] ans = new String[1];
        return eval(temp, A.length() - 1, A);
        // return ans;
    }
    private String[] eval(String[] temp, int i, String A) {
        if(i == -1) {
            return temp;
        }
        int num = Integer.parseInt(Character.toString(A.charAt(i)));
        String str = ref[num];
        String[] t = new String[str.length() * temp.length];
        int l = 0;
        for(int j = 0; j < str.length(); j++) {
            for(int k = 0; k < temp.length; k++) {
                t[l++] = "" + str.charAt(j) + temp[k];
            }
        }
        return eval(t, i - 1, A);
    }
}

/*

Q1. Letter Phone
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a digit string A, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.

The digit 0 maps to 0 itself. The digit 1 maps to 1 itself.

NOTE: Make sure the returned strings are lexicographically sorted.



Problem Constraints

1 <= |A| <= 10


Input Format

The only argument is a digit string A.


Output Format

Return a string array denoting the possible letter combinations.


Example Input

Input 1:

 A = "23"

Input 2:

 A = "012"



Example Output

Output 1:

 ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]

Output 2:

 ["01a", "01b", "01c"]



Example Explanation

Explanation 1:

 There are 9 possible letter combinations.

Explanation 2:

 Only 3 possible letter combinations.
 
*/