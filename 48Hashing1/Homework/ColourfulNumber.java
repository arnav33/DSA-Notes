import java.util.HashSet;
import java.util.Set;

public class ColourfulNumber {
    public int colorful(int A) {
        String str = String.valueOf(A);
        if(str.contains("0")) return 0;
        Set<Integer> hs = new HashSet<>();
        int[] pa = new int[str.length()];
        pa[0] = Character.getNumericValue(str.charAt(0));
        for(int i = 1; i < str.length(); i++) {
            int prev = pa[i - 1], current = Character.getNumericValue(str.charAt(i));
            pa[i] = prev * current;
        }
        for(int i = 0; i < pa.length; i++) {
            if(hs.contains(pa[i])) return 0;
            hs.add(pa[i]);
        }
        for(int i = 1; i < pa.length; i++) {
            for(int j = i; j < pa.length; j++) {
                int p = pa[j] / pa[i - 1];
                if(hs.contains(p)) return 0;
                hs.add(p);
            }
        }
        return 1;
    }
}

/*

Q1. Colorful Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different contiguous sub-subsequence parts. 
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.



Problem Constraints

1 <= A <= 2 * 109



Input Format

The first and only argument is an integer A.



Output Format

Return 1 if integer A is COLORFUL else return 0.



Example Input

Input 1:

 A = 23

Input 2:

 A = 236



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 Possible Sub-sequences: [2, 3, 23] where
 2 -> 2 
 3 -> 3
 23 -> 6  (product of digits)
 This number is a COLORFUL number since product of every digit of a sub-sequence are different. 

Explanation 2:

 Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 2 -> 2 
 3 -> 3
 6 -> 6
 23 -> 6  (product of digits)
 36 -> 18  (product of digits)
 236 -> 36  (product of digits)
 This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same. 


*/