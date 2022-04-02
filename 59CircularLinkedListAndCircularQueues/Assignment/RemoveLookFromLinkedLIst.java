class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class RemoveLookFromLinkedLIst {
    public ListNode solve(ListNode A) {
        ListNode slow = A.next, fast = A.next.next;
        while(slow != null && fast != null && fast.next != null && slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = A;
        while(cur.next != slow.next) {
            cur = cur.next;
            slow = slow.next;
        }
        slow.next = null;
        return A;
    }
}

/*

Q1. Remove Loop from Linked List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given a linked list that contains a loop.
You need to find the node, which creates a loop and break it by making the node point to NULL.



Problem Constraints

1 <= number of nodes <= 1000



Input Format

Only argument is the head of the linked list.



Output Format

return the head of the updated linked list.



Example Input

Input 1:

 
1 -> 2
^    |
| - - 

Input 2:

3 -> 2 -> 4 -> 5 -> 6
          ^         |
          |         |    
          - - - - - -



Example Output

Output 1:

 1 -> 2 -> NULL

Output 2:

 3 -> 2 -> 4 -> 5 -> 6 -> NULL



Example Explanation

Explanation 1:

 Chain of 1->2 is broken.

Explanation 2:

 Chain of 4->6 is broken.


*/