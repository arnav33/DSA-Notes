import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GameOfBottles {
    public int solve(int[] A) {
        Arrays.sort(A);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++) {
            int count = hm.getOrDefault(A[i], 0);
            hm.put(A[i], ++count);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> es : hm.entrySet()) {
            ans = (int)Math.max(ans, es.getValue());
        }
        return ans;
    }
}

/*

Q3. Game of Bottles
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description
Given an array of integers, A of length N denotes N cylindrical empty bottles. The radius of the ith bottle is A[i].

You can put the ith bottle into the jth bottle if the following conditions are met:

    The ith bottle is not put into another bottle.
    The jth bottle doesn't contain any other bottle.
    The radius of bottle i is smaller than bottle j (A[i] < A[j]).

You can put bottles into each other any number of times. You want to MINIMIZE the number of visible bottles. A bottle is visible if it is not put into any other bottle.

Find and return the minimum number of visible bottles.



Problem Constraints

1 <= N <= 100000

1<= A[i] <= 100000000



Input Format

The first argument is an integer array A denoting the radius of the cylindrical bottles.



Output Format

Return a single integer corresponding to the minimum number of visible bottles.



Example Input

Input 1:

A = [1, 2, 3]

Input 2:

A = [1, 1]



Example Output

Output 1:

 1

Output 2:

 2



Example Explanation

Explanation 1:

 In example 1 it is possible to put bottle 1 into bottle 2, and 2 into 3.

Explanation 2:

 Both bottles will be visible.

 
*/