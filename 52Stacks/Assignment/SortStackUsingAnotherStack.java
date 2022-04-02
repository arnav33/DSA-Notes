import java.util.Stack;

public class SortStackUsingAnotherStack {
    public int[] solve(int[] A) {
        // Creating reference stack
        Stack<Integer> ref = new Stack<>();
        for(int i = 0; i < A.length; i++) {
            ref.push(A[i]);
        }

        // Creating sorted stack
        Stack<Integer> sorted = new Stack<>();
        while(!ref.empty()) {
            int x = ref.pop();
            while(!sorted.empty()) {
                int y = sorted.peek();
                if(x < y) {
                    y = sorted.pop();
                    ref.push(y);
                } else break;
            }
            sorted.push(x);
        }

        // Creating ans array
        Object[] o = sorted.toArray();
        int[] ans = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            ans[i] = Integer.parseInt(o[i].toString());
        }

        return ans;
    }
}

/*

Q2. Sort stack using another stack
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a stack of integers A, sort it using another stack.

Return the array of integers after sorting the stack using another stack.



Problem Constraints

1 <= |A| <= 5000

0 <= A[i] <= 109



Input Format

The only argument is a stack given as an integer array A.



Output Format

Return the array of integers after sorting the stack using another stack.



Example Input

Input 1:

 A = [5, 4, 3, 2, 1]

Input 2:

 A = [5, 17, 100, 11]



Example Output

Output 1:

 [1, 2, 3, 4, 5]

Output 2:

 [5, 11, 17, 100]



Example Explanation

Explanation 1:

 Just sort the given numbers.

Explanation 2:

 Just sort the given numbers.


*/