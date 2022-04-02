class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class MiddleElementOfLinkedList {
    public int solve(ListNode A) {
        int size = 0;
        ListNode current = A;
        while(current != null) {
            size++;
            current = current.next;
        }
        int n = (size / 2) + 1;
        int i = 1;
        current = A;
        while(i < n) {
            current = current.next;
            i++;
        }
        if(current == null) return 0;
        return current.val;
    }
}

/*

Q2. Middle element of linked list
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a linked list of integers, find and return the middle element of the linked list.

NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.



Problem Constraints

1 <= length of the linked list <= 100000

1 <= Node value <= 109



Input Format

The only argument given head pointer of linked list.



Output Format

Return the middle element of the linked list.



Example Input

Input 1:

 1 -> 2 -> 3 -> 4 -> 5

Input 2:

 1 -> 5 -> 6 -> 2 -> 3 -> 4



Example Output

Output 1:

 3

Output 2:

 2



Example Explanation

Explanation 1:

 The middle element is 3.

Explanation 2:

 The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.

*/