import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {
    public int solve(int[] A, int B) {
		int m = (int)1e9+7;
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < A.length; i++) {
			int count = hm.getOrDefault(A[i], 0);
			hm.put(A[i], ++count);
		}
		int[] C = new int[hm.size()];
		int k = 0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			C[k++] = entry.getKey();
		}
		Arrays.sort(C);
		long sum = 0;
		int i = 0, j = C.length - 1;
		if(B % 2 == 0 && hm.getOrDefault(B / 2, 0) > 0) {
			long x = (long)hm.getOrDefault(B / 2, 0);
			sum += (x * (x - 1)) / 2;
			sum %= m;
		}
		while(i < j) {
			int s = C[i] + C[j];
			if(s > B) j--;
			else if(s < B) i++;
			else {
				if(i != j) {
					sum += (long)hm.get(C[i]) * (long)hm.get(C[j]);
				} else {
					// sum += (long)hm.get(C[i]) * (long)(hm.get(C[i]) - 1) / 2;
				}
				sum %= m;
				i++;
				j--;
			}
		}
		return (int)sum;
    }
}

/*

Q1. Pairs with given sum II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.

Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).



Problem Constraints

1 <= |A| <= 100000

1 <= A[i] <= 10^9

1 <= B <= 10^9



Input Format

The first argument given is the integer array A.

The second argument given is integer B.



Output Format

Return the number of pairs for which sum is equal to B modulo (10^9+7).


Example Input

Input 1:

A = [1, 1, 1]
B = 2

Input 2:

 
A = [1, 1]
B = 2



Example Output

Output 1:

 3

Output 2:

 1



Example Explanation

Explanation 1:

 Any two pairs sum up to 2.

Explanation 2:

 only pair (1, 2) sums up to 2.


*/