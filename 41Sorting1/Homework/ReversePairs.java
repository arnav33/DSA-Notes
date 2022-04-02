public class ReversePairs {
    int ans = 0;
    public int solve(int[] A) {
        sort(A);
        return ans;
    }
    private void sort(int[] A) {
        if(A.length < 2) return;
        int mid = A.length / 2;
        int[] left = getArray(0, mid - 1, A);
        int[] right = getArray(mid, A.length - 1, A);
        sort(left);
        sort(right);
        merge(left, right, A);
    }
    private void merge(int[] left, int[] right, int[] A) {
        int i = 0, j = 0;
        while(i < left.length && j < right.length) {
            long x = left[i];
            long y = right[j];
            if(x > 2 * y) {
                ans += left.length - i;
                j++;
            } else i++;
        }
        i = 0;
        j = 0;
        int k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) A[k++] = left[i++];
            else A[k++] = right[j++];
        }
        while(i < left.length) {
            A[k++] = left[i++];
        }
        while(j < right.length) {
            A[k++] = right[j++];
        }
    }
    private int[] getArray(int start, int end, int[] A) {
        int[] ans = new int[end - start + 1];
        int j = 0;
        for(int i = start; i <= end; i++) {
            ans[j++] = A[i];
        }
        return ans;
    }
}

/*

Q3. Reverse pairs
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description
Given an array of integers A, we call (i, j) an important reverse pair if i < j and A[i] > 2*A[j].

Return the number of important reverse pairs in the given array A.



Problem Constraints

1 <= length of the array <= 105

-2 * 109 <= A[i] <= 2 * 109



Input Format

The only argument given is the integer array A.



Output Format

Return the number of important reverse pairs in the given array A.



Example Input

Input 1:

 A = [1, 3, 2, 3, 1]

Input 2:

 A = [4, 1, 2]



Example Output

Output 1:

 2

Output 2:

 1



Example Explanation

Explanation 1:

 There are two pairs which are important reverse i.e (3, 1) and (3, 1).

Explanation 2:

 There is only one pair i.e (4, 1).
 
*/