import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public String solve(String A) {
        Queue<Character> q = new LinkedList<>();
        Map<Character, Integer> m = new HashMap<>();
        char ans = '$';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A.length(); i++) {
            char c = A.charAt(i);
            if(!m.containsKey(c)) q.add(c);
            int count = m.getOrDefault(c, 0);
            m.put(c, ++count);
            while(!q.isEmpty() && m.get(q.peek()) > 1) q.remove();
            if(q.isEmpty()) ans = '#';
            else ans = q.peek();
            sb.append(ans);
        }
        return sb.toString();
    }
}

/*

Q1. First non-repeating character
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a string A denoting a stream of lowercase alphabets, you have to make a new string B.
B is formed such that we have to find the first non-repeating character each time a character is inserted to the stream and append it at the end to B. If no non-repeating character is found, append '#' at the end of B.



Problem Constraints

1 <= |A| <= 100000



Input Format

The only argument given is string A.



Output Format

Return a string B after processing the stream of lowercase alphabets A.



Example Input

Input 1:

 A = "abadbc"

Input 2:

 A = "abcabc"



Example Output

Output 1:

"aabbdd"

Output 2:

"aaabc#"



Example Explanation

Explanation 1:

"a"      -   first non repeating character 'a'
"ab"     -   first non repeating character 'a'
"aba"    -   first non repeating character 'b'
"abad"   -   first non repeating character 'b'
"abadb"  -   first non repeating character 'd'
"abadbc" -   first non repeating character 'd'

Explanation 2:

"a"      -   first non repeating character 'a'
"ab"     -   first non repeating character 'a'
"abc"    -   first non repeating character 'a'
"abca"   -   first non repeating character 'b'
"abcab"  -   first non repeating character 'c'
"abcabc" -   no non repeating character so '#'




*/