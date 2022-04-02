import java.util.List;

public class MedianOfArray {
    // DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        if(a.size() > b.size()) return findMedianSortedArrays(b, a);
        int l1 = 0, r1 = a.size();
        return search(a, b, l1, r1);
	}
    private double search(List<Integer> a, List<Integer> b, int l1, int r1) {
        int mid1 = (l1 + r1) / 2;
        int mid2 = (a.size() + b.size() + 1) / 2 - mid1;
        int min1 = mid1 >= a.size() ? Integer.MAX_VALUE : a.get(mid1);
        int max1 = mid1 <= 0 ? Integer.MIN_VALUE : a.get(mid1 - 1);
        int min2 = mid2 >= b.size() ? Integer.MAX_VALUE : b.get(mid2);
        int max2 = mid2 <= 0 ? Integer.MIN_VALUE : b.get(mid2 - 1);
        if(max1 <= min2 && max2 <= min1) {
            int size = a.size() + b.size();
            if(size % 2 == 0) return (double)(((double)Math.min(min1, min2) + (double)Math.max(max1, max2)) / 2);
            else return (double)(Math.max(max1, max2));
        }
        if(max1 > min2) r1 = mid1 - 1;
        else l1 = mid1 + 1;
        return search(a, b, l1, r1);
    }
}

/*

Q2. Median of Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

There are two sorted arrays A and B of sizes N and M respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

NOTE:

    The overall run time complexity should be O(log(m+n)).
    IF the number of elements in the merged array is even, then the median is the average of (n/2)th and (n/2+1)th element. For example, if the array is [1 2 3 4], the median is (2 + 3) / 2.0 = 2.5.



Problem Constraints

1 <= N, M <= 106



Input Format

The first argument is an integer array A of size N.
The second argument is an integer array B of size M.



Output Format

Return a decimal value denoting the median of two sorted arrays.



Example Input

Input 1:

 A = [1, 4, 5]
 B = [2, 3]

Input 2:

 A = [1, 2, 3]
 B = [4]



Example Output

Output 1:

 3.0

Output 2:

 2.5



Example Explanation

Explanation 1:

 The median of both the sorted arrays will be 3.0.

Explanation 2:

 The median of both the sorted arrays will be (2+3)/2 = 2.5.

*/