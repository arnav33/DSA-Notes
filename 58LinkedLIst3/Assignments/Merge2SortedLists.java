class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Merge2SortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        if(A.val > B.val) return mergeTwoLists(B, A);
        while(A != null && B == null && A.val == B.val) {
            ListNode temp = A;
            A = A.next;
            temp.next = B;
            B = temp;
        }
        ListNode a = A, b = B, prev = null;
        while(a != null && b != null) {
            if(a.val <= b.val) {
                prev = a;
                a = a.next;
            } else {
                ListNode temp = b.next;
                prev.next = b;
                prev = b;
                b.next = a;
                b = temp;
            }
        }
        if(a == null) prev.next = b;
        return A;
    }
}

/*

Q1. Merge Two Sorted Lists
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Merge two sorted linked lists, A and B, and return it as a new list.

The new list should be made by splicing together the nodes of the first two lists and should also be sorted.



Problem Constraints

0 <= |A|, |B| <= 105



Input Format

The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format

Return a pointer to the head of the merged linked list.



Example Input

Input 1:

 A = 5 -> 8 -> 20
 B = 4 -> 11 -> 15

Input 2:

 A = 1 -> 2 -> 3
 B = Null



Example Output

Output 1:

 4 -> 5 -> 8 -> 11 -> 15 -> 20

Output 2:

 1 -> 2 -> 3



Example Explanation

Explanation 1:

 Merging A and B will result in 4 -> 5 -> 8 -> 11 -> 15 -> 20 

Explanation 2:

 We don't need to merge as B is empty. 

*/