class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class Add2NumbersAsLists {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode ans = new ListNode(0);
        ListNode ansit = ans;
        int c = 0;
        while(A != null || B != null) {
            int a = 0, b = 0;
            if(A != null) a = A.val;
            if(B != null) b = B.val;
            int num = a + b + c;
            ListNode newNode = new ListNode(num % 10);
            c = num / 10;
            ansit.next = newNode;
            ansit = ansit.next;
            if(A != null) A = A.next;
            if(B != null) B = B.next;
        }
        if(c > 0) {
            ListNode newNode = new ListNode(c);
            ansit.next = newNode;
        }
        return ans.next;
    }
}

/*

Q1. Add Two Numbers as Lists
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

You are given two linked lists, A and B, representing two non-negative numbers.

The digits are stored in reverse order, and each of their nodes contains a single digit.

Add the two numbers and return it as a linked list.



Problem Constraints

1 <= |A|, |B| <= 105



Input Format

The first argument of input contains a pointer to the head of linked list A.

The second argument of input contains a pointer to the head of linked list B.



Output Format

Return a pointer to the head of the required linked list.



Example Input

Input 1:

 
 A = [2, 4, 3]
 B = [5, 6, 4]

Input 2:

 
 A = [9, 9]
 B = [1]



Example Output

Output 1:

 
 [7, 0, 8]

Output 2:

 
 [0, 0, 1]



Example Explanation

Explanation 1:

 A = 342 and B = 465. A + B = 807. 

Explanation 2:

 A = 99 and B = 1. A + B = 100. 




*/