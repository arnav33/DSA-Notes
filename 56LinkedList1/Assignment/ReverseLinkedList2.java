class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x) { val = x; next = null; }
}

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode prev = null;
        ListNode current = A;
        ListNode next = null;
        ListNode prevB = null;
        ListNode b = null;
        int i = 1;
        while(i <= C) {
            if(i < B) {
                if(i == B - 1) {
                    prevB = current;
                }
                current = current.next;
                i++;
            } else if(i == B) {
                b = current;
                prev = current;
                current = current.next;
                if(current != null) next = current.next;
                i++;
            } else {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null) next = current.next;
                i++;
            }
        }
        b.next = current;
        if(prevB != null) prevB.next = prev;
        else return prev;
        return A;
    }
}

/*

Q1. Reverse Link List II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.



Problem Constraints

1 <= |A| <= 106

1 <= B <= C <= |A|



Input Format

The first argument contains a pointer to the head of the given linked list, A.

The second arugment contains an integer, B.

The third argument contains an integer C.



Output Format

Return a pointer to the head of the modified linked list.


Example Input

Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4


Input 2:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5



Example Output

Output 1:

 1 -> 4 -> 3 -> 2 -> 5

Output 2:

 5 -> 4 -> 3 -> 2 -> 1



Example Explanation

Explanation 1:

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5 
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5 

Explanation 2:

 In the second example, we want to reverse the highlighted part of the given linked list : 1 -> 4 -> 3 -> 2 -> 5  
 Thus, the output is 5 -> 4 -> 3 -> 2 -> 1 

*/