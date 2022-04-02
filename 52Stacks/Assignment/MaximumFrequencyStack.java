import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class MaximumFrequencyStack {
    Map<Integer, Integer> nf = new HashMap<>();
    TreeMap<Integer, Stack<Integer>> fns = new TreeMap<>();
    public int[] solve(int[][] A) {
        int[] ans = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            int o = A[i][0], v = A[i][1];
            if(o == 1) {
                ans[i] = push(v);
            } else {
                ans[i] = pop();
            }
        }
        return ans;
    }
    private int push(int x) {
        // adjusting number-frequency map
        int f = nf.getOrDefault(x, 0) + 1;
        nf.put(x, f);
        
        // adjusting frequency-number map
        if(!fns.containsKey(f)) fns.put(f, new Stack<Integer>());
        fns.get(f).push(x);
        
        // returing the required value
        return -1;
    }
    private int pop() {
        // adjusting frequency-number map
        int mi = fns.lastKey();
        int x = fns.get(mi).pop();
        if(fns.get(mi).empty()) {
            fns.remove(mi);
            mi--;
        }
        
        // adjusting number-frequency map
        int f = nf.get(x) - 1;
        nf.put(x, f);
        
        // returning the element with maximum frequency
        return x;
    }
}


/*

Q3. Maximum Frequency stack
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given a matrix A which represents operations of size N x 2. Assume initially you have a stack-like data structure you have to perform operations on it.

Operations are of two types:

1 x: push an integer x onto the stack and return -1.

2 0: remove and return the most frequent element in the stack.

If there is a tie for the most frequent element, the element closest to the top of the stack is removed and returned.

A[i][0] describes the type of operation to be performed. A[i][1] describe the element x or 0 corresponding to the operation performed.



Problem Constraints

1 <= N <= 100000

1 <= A[i][0] <= 2

0 <= A[i][1] <= 109



Input Format

The only argument given is the integer array A.



Output Format

Return the array of integers denoting the answer to each operation.



Example Input

Input 1:

A = [
            [1, 5]
            [1, 7]
            [1, 5]
            [1, 7]
            [1, 4]
            [1, 5]
            [2, 0]
            [2, 0]
            [2, 0]
            [2, 0]  ]

Input 2:

 A =  [   
        [1, 5]
        [2, 0]
        [1, 4]   ]



Example Output

Output 1:

 [-1, -1, -1, -1, -1, -1, 5, 7, 5, 4]

Output 2:

 [-1, 5, -1]



Example Explanation

Explanation 1:

 Just simulate given operations.

Explanation 2:

 Just simulate given operations.


*/