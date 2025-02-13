import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution
{
    //Write if any supporting methods here
    Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next != null) {
            slow = slow.next;
            if(fast.next.next == null) {
                break;
            }
            fast = fast.next.next;
        }
        return slow;
    }

    Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if only one node, return as is
        }

        Node newHead = reverse(head.next); // Recursively reverse the rest of the list

        head.next.next = head; // Reverse the link (make next node point to current)
        head.next = null;      // Disconnect the old link

        return newHead; // Return the new head of the reversed list
        // Node prev = null;
        // Node curr = head;
        // Node next;

        // while (curr != null) {
        //     next = curr.next;  // Store next node
        //     curr.next = prev;   // Reverse the link
        //     prev = curr;        // Move prev to current
        //     curr = next;        // Move to next node
        // }

        // return prev; // New head of reversed list
    }


    boolean isPalindrome(Node head)
    {
        //Write your code here and return boolean value
        if(head == null || head.next == null) { //single node in LL
            return true;
        }

        Node middleEle = getMid(head);
        Node secondHalfStart = reverse(middleEle.next);
        middleEle.next = secondHalfStart;

        Node head1 = head;
        Node head2 = secondHalfStart;
        boolean ispalidn = true;

        while(head2 != null) {
            if(head1.data != head2.data) {
                ispalidn = false;
                break;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        middleEle = reverse(secondHalfStart);
        return ispalidn;

    }
}

public class PalindromeList
{
    public Node head = null;
    public Node tail = null;

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        PalindromeList list = new PalindromeList();
        String list2[]=sc.nextLine().split(" ");
        for(int i=0;i<list2.length;i++)
            list.addNode(Integer.parseInt(list2[i]));
        Solution sl=new Solution();
        System.out.println(sl.isPalindrome(list.head));
    }
}
