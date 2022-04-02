import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[][] anagrams(final String[] A) {
        // Creating hashmap of hashes
        String s = "0abcdefghijklmnopqrstuvwxyz";
        Map<Character, Integer> characterHash = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            characterHash.put(s.charAt(i), (int)(1e9 * Math.random()));
        }
        // Converting string to hash to use B as a new input instead of A
        int[] B = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            String str = A[i];
            int stringHash = 0;
            for(int j = 0; j < str.length(); j++) {
                stringHash += characterHash.get(str.charAt(j));
            }
            B[i] = stringHash;
        }
        Map<Integer, Integer> ansOrder = new HashMap<>();
        int ind = 0;
        for(int i = 0; i < B.length; i++) {
            if(!ansOrder.containsKey(B[i])) ansOrder.put(B[i], ind++);
        }
        int[] lastIndex = new int[ansOrder.size()];
        for(int i = 0; i < lastIndex.length; i++) {
            lastIndex[i] = 0;
        }
        ArrayList<Integer>[] ans = new ArrayList[ansOrder.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < B.length; i++) {
            int orderIndex = ansOrder.get(B[i]);
            ans[orderIndex].add(i + 1);
        }
        int[][] ansMap = new int[ansOrder.size()][];
        for(int i = 0; i < ans.length; i++) {
            int[] subAns = new int[ans[i].size()];
            for(int j = 0; j < ans[i].size(); j++) {
                subAns[j] = ans[i].get(j);
            }
            ansMap[i] = subAns;
        }
        return ansMap;
    }
}

/*`

Q3. Anagrams
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array A of N strings, return all groups of strings that are anagrams.

Represent a group by a list of integers representing the index(1-based) in the original list. Look at the sample case for clarification.

NOTE: Anagram is a word, phrase, or name formed by rearranging the letters, such as 'spar', formed from 'rasp'.



Problem Constraints

1 <= N <= 104

1 <= |A[i]| <= 104

Each string consists only of lowercase characters.

The sum of the length of all the strings doesn't exceed 107



Input Format

The first and only argument is an integer array A.



Output Format

Return a two-dimensional array where each row describes a group.

Note:

Ordering of the result :
You should not change the relative ordering of the strings within the group suppose within a group containing A[i] and A[j], A[i] comes before A[j] if i < j.



Example Input

Input 1:

 A = [cat, dog, god, tca]

Input 2:

 A = [rat, tar, art]



Example Output

Output 1:

 [ [1, 4],
   [2, 3] ]

Output 2:

 [ [1, 2, 3] ]



Example Explanation

Explanation 1:

 "cat" and "tca" are anagrams which correspond to index 1 and 4 and "dog" and "god" are another set of anagrams which correspond to index 2 and 3.
 The indices are 1 based ( the first element has index 1 instead of index 0).

Explanation 2:

 All three strings are anagrams.

*/