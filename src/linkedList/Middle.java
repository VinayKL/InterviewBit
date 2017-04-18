package linkedList;

public class Middle {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);
		ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		ListNode V;
		
		V =middle(A);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode middle(ListNode A){
		ListNode slow = A;
		ListNode fast = A;
		while( fast!= null && fast.next!= null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static void printNodes(ListNode A){
		ListNode curr = A;
		while(curr!= null){
			System.out.println(curr.val);
			curr = curr.next;
		}
	}
}
