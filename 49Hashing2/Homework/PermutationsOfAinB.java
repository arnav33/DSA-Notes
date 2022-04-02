import java.util.HashMap;
import java.util.Map;

public class PermutationsOfAinB {
    public int solve(String A, String B) {
        String s = "0abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), (int)(1e6 * Math.random()));
        }
        int ans = 0;
        long h1 = 0;
        for(int i = 0; i < A.length(); i++) {
            h1 += hm.get(A.charAt(i));
        }
        long h2 = 0;
        for(int i = 0; i < A.length(); i++) {
            h2 += hm.get(B.charAt(i));
        }
        if(h1 == h2) ans++;
        int p = 0;
        for(int i = A.length(); i < B.length(); i++) {
            h2 += hm.get(B.charAt(i)) - hm.get(B.charAt(p++));
            if(h1 == h2) ans++;
        }
        return ans;
    }
}

/*

Q2. Permutations of A in B
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given two strings, A and B, of size N and M, respectively.

You have to find the count of all permutations of A present in B as a substring. You can assume a string will have only lowercase letters.



Problem Constraints

1 <= N < M <= 105



Input Format

Given two arguments, A and B of type String.



Output Format

Return a single integer, i.e., number of permutations of A present in B as a substring.



Example Input

Input 1:

 A = "abc"
 B = "abcbacabc"

Input 2:

 A = "aca"
 B = "acaa"



Example Output

Output 1:

 5

Output 2:

 2



Example Explanation

Explanation 1:

 Permutations of A that are present in B as substring are:
    1. abc
    2. cba
    3. bac
    4. cab
    5. abc
    So ans is 5.

Explanation 2:

 Permutations of A that are present in B as substring are:
    1. aca
    2. caa 




*/