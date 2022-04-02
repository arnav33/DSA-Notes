import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CombinationSum1 {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < A.size(); i++) {
            s.add(A.get(i));
        }
        ArrayList<Integer> list = new ArrayList<>(s);
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            traverse(list, new ArrayList<>(), i, B);
        }
        return ans;
    }
    private void traverse(ArrayList<Integer> A, ArrayList<Integer> sAns, int j, int B) {
        int num = A.get(j);
        sAns.add(num);
        if(B - num == 0) {
            ans.add(sAns);
        }
        if(B - num <= 0) {
            return;
        }
        for(int i = j; i < A.size(); i++) {
            traverse(A, new ArrayList<>(sAns), i, B - num);
        }
    }
}

/*

Q1. Combination Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of candidate numbers A and a target number B, find all unique combinations in A where the candidate numbers sums to B.

The same repeated number may be chosen from A unlimited number of times.

Note:

1) All numbers (including target) will be positive integers.

2) Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).

3) The combinations themselves must be sorted in ascending order.

4) CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) OR ... (a1 = b1 AND a2 = b2 AND ... ai = bi AND ai+1 > bi+1)

5) The solution set must not contain duplicate combinations.



Problem Constraints

1 <= |A| <= 20

1 <= A[i] <= 50

1 <= B <= 500



Input Format

The first argument is an integer array A.

The second argument is integer B.



Output Format

Return a vector of all combinations that sum up to B.



Example Input

Input 1:

A = [2, 3]
B = 2

Input 2:

A = [2, 3, 6, 7]
B = 7



Example Output

Output 1:

[ [2] ]

Output 2:

[ [2, 2, 3] , [7] ]



Example Explanation

Explanation 1:

All possible combinations are listed.

Explanation 2:

All possible combinations are listed.


*/