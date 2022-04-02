public class SearchForARange {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] searchRange(final int[] A, int B) {
        int[] ans = new int[2];

        // Finding 1st index

        int i = 0, j = A.length - 1, k = -1;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(A[mid] < B) i = mid + 1;
            else if(A[mid] == B) {
                j = mid - 1;
                k = mid;
            }
            else j = mid - 1;
        }
        ans[0] = k;

        // Finding last index
        i = 0;
        j = A.length - 1;
        while(i <= j) {
            int mid = (i + j) / 2;
            if(A[mid] < B) i = mid + 1;
            else if(A[mid] == B) {
                i = mid + 1;
                k = mid;
            }
            else j = mid - 1;
        }
        ans[1] = k;
        return ans;
    }
}

/*

Q3. Search for a Range
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a sorted array of integers A(0 based index) of size N, find the starting and the ending position of a given integer B in array A.

Your algorithm's runtime complexity must be in the order of O(log n).

Return an array of size 2, such that the first element = starting position of B in A and the second element = ending position of B in A, if B is not found in A return [-1, -1].



Problem Constraints

1 <= N <= 106

1 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return an array of size 2, such that the first element = starting position of B in A and the second element = the ending position of B in A if B is not found in A return [-1, -1].



Example Input

Input 1:

 A = [5, 7, 7, 8, 8, 10]
 B = 8

Input 2:

 A = [5, 17, 100, 111]
 B = 3



Example Output

Output 1:

 [3, 4]

Output 2:

 [-1, -1]



Example Explanation

Explanation 1:

 The first occurence of 8 in A is at index 3.
 The second occurence of 8 in A is at index 4.
 ans = [3, 4]

Explanation 2:

 There is no occurence of 3 in the array.

*/