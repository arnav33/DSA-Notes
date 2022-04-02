class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class PalindromeList {
    public int lPalin(ListNode A) {
        if(A == null || A.next == null) return 1;
        int size = 0;
        ListNode cur = A;
        while(cur != null) {
            size++;
            cur = cur.next;
        }
        int fMId = size / 2;
        if(size % 2 == 1) fMId = (size - 1) / 2;
        ListNode prev = null;
        int i = 1;
        while(i <= fMId) {
            ListNode next = A.next;
            A.next = prev;
            prev = A;
            A = next;
            i++;
        }
        if(size % 2 == 1) A = A.next;
        while(prev != null && A != null && prev.val == A.val) {
            prev = prev.next;
            A = A.next;
            if(prev == null && A == null) return 1;
        }
        return 0;
    }
}

/*

Q3. Palindrome List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.



Problem Constraints

1 <= |A| <= 105



Input Format

The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format

Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.



Example Input

Input 1:

A = [1, 2, 2, 1]

Input 2:

A = [1, 3, 2]



Example Output

Output 1:

 1 

Output 2:

 0 



Example Explanation

Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.

Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].


*/