import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsWithGivenDifference {
    public int solve(int[] A, int B) {
        // Storing frequency of elements in A
        Map<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < A.length; i++) {
			int count = hm.getOrDefault(A[i], 0);
			hm.put(A[i], ++count);
		}
        // Creating an array C without repeat
		int[] C = new int[hm.size()];
		int k = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			C[k++] = entry.getKey();
		}
		Arrays.sort(C);
        // finding answer using 2 pointer
        int ans = 0, i = 0, j = 0;
        while(j < C.length) {
            if(C[j] - C[i] > B) i++;
            else if(C[j] - C[i] < B) j++;
            else {
                if(B == 0) {
                    if(hm.get(C[i]) > 1) ans++;
                } else {
                    ans++;
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}

/*

Q2. Pairs with Given Difference
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an one-dimensional integer array A of size N and an integer B.

Count all distinct pairs with difference equal to B.

Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.



Problem Constraints

1 <= N <= 104

0 <= A[i], B <= 105



Input Format

First argument is an one-dimensional integer array A of size N.

Second argument is an integer B.



Output Format

Return an integer denoting the count of all distinct pairs with difference equal to B.


Example Input

Input 1:

 A = [1, 5, 3, 4, 2]
 B = 3

Input 2:

 A = [8, 12, 16, 4, 0, 20]
 B = 4

Input 3:

 A = [1, 1, 1, 2, 2]
 B = 0



Example Output

Output 1:

 2

Output 2:

 5

Output 3:

 2



Example Explanation

Explanation 1:

 There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2} 

Explanation 2:

 There are 5 unique pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20} 

Explanation 3:

 There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.


*/