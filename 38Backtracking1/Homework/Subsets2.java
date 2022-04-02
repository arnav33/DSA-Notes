import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Subsets2 {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    Set<String> tset = new HashSet<>();
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ans.add(new ArrayList<>());
        Collections.sort(A);
        eval(A, new ArrayList<>(), 0);
        return ans;
    }
    private void eval(ArrayList<Integer> A, ArrayList<Integer> lout, int i) {
        if(!check(A, i)) return;
        // Including part
        lout.add(A.get(i));
        ArrayList<Integer> c_lout = new ArrayList<>(lout);
        ans.add(c_lout);
        eval(A, new ArrayList<>(lout), i + 1);
        lout.remove(lout.size() - 1);
        // Not including
        while(i < A.size() - 1 && A.get(i).equals(A.get(i + 1))) {
            i++;
        }
        eval(A, new ArrayList<>(lout), i + 1);
    }
    private boolean check(ArrayList<Integer> A, int i) {
        return 0 <= i && i < A.size();
    }
}

/*

Q2. Subsets II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a collection of integers denoted by array A of size N that might contain duplicates, return all possible subsets.

NOTE:

Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
The subsets must be sorted lexicographically.



Problem Constraints

0 <= N <= 16


Input Format

Only argument is an integer array A of size N.


Output Format

Return a 2-D vector denoting all the possible subsets.


Example Input

Input 1:

 A = [1, 2, 2]

Input 2:

 A = [1, 1]



Example Output

Output 1:

 [
    [],
    [1],
    [1, 2],
    [1, 2, 2],
    [2],
    [2, 2]
 ]

Output 2:

 [
    [],
    [1],
    [1, 1]
 ]



Example Explanation

Explanation 1:

All the subsets of the array [1, 2, 2] in lexicographically sorted order.

*/