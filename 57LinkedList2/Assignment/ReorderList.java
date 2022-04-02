class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class ReorderList {
    public ListNode reorderList(ListNode A) {
        if(A == null || A.next == null) return A;
        ListNode middle = A;
        ListNode end = A;
        while(end != null && middle != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }
        ListNode t = middle.next;
        middle.next = null;
        middle = t;
        ListNode prev = null;
        if(middle == null) return A;
        while(middle.next != null) {
            ListNode next = middle.next;
            middle.next = prev;
            prev = middle;
            middle = next;
        }
        middle.next = prev;
        ListNode start = A;
        while(start != null && middle != null) {
            ListNode temp = middle.next;
            middle.next = start.next;
            start.next = middle;
            middle = temp;
            start = start.next.next;
        }
        return A;
    }
}

/*

Q3. Reorder List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a singly linked list A

 A: A0 → A1 → … → An-1 → An 

reorder it to:

 A0 → An → A1 → An-1 → A2 → An-2 → … 

You must do this in-place without altering the nodes' values.



Problem Constraints

1 <= |A| <= 106


Input Format

The first and the only argument of input contains a pointer to the head of the linked list A.


Output Format

Return a pointer to the head of the modified linked list.


Example Input

Input 1:

 A = [1, 2, 3, 4, 5] 

Input 2:

 A = [1, 2, 3, 4] 



Example Output

Output 1:

 [1, 5, 2, 4, 3] 

Output 2:

 [1, 4, 2, 3] 



Example Explanation

Explanation 1:

 The array will be arranged to [A0, An, A1, An-1, A2].

Explanation 2:

 The array will be arranged to [A0, An, A1, An-1, A2].


*/