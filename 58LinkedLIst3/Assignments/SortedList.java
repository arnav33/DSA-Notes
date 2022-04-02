class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class SortedList {
    public ListNode sortList(ListNode A) {
        return sort(A);
    }
    private ListNode sort(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode head1 = head;
        ListNode head2 = getMid(head);
        ListNode sortedHead1 = sort(head1);
        ListNode sortedHead2 = sort(head2);
        return merge(sortedHead1, sortedHead2);
    }
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode ans = new ListNode(Integer.MIN_VALUE);
        ListNode ansIterator = ans;
        while(head1 != null && head2 != null) {
            if(head1.val <= head2.val) {
                ansIterator.next = head1;
                head1 = head1.next;
            } else {
                ansIterator.next = head2;
                head2 = head2.next;
            }
            ansIterator = ansIterator.next;
        }
        while(head1 != null) {
            ansIterator.next = head1;
            ansIterator = ansIterator.next;
            head1 = head1.next;
        }
        while(head2 != null) {
            ansIterator.next = head2;
            ansIterator = ansIterator.next;
            head2 = head2.next;
        }
        return ans.next;
    }
    private ListNode getMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        return head2;
    }
}

/*

Q2. Sort List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Sort a linked list, A in O(n log n) time using constant space complexity.


Problem Constraints

0 <= |A| = 105


Input Format

The first and the only arugment of input contains a pointer to the head of the linked list, A.


Output Format

Return a pointer to the head of the sorted linked list.


Example Input

Input 1:

A = [3, 4, 2, 8]

Input 2:

A = [1]



Example Output

Output 1:

[2, 3, 4, 8]

Output 2:

[1]



Example Explanation

Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].

Explanation 2:

 The sorted form of [1] is [1].


*/