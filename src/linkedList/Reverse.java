package linkedList;

// change the direction of the link
// next is temporary variable to hold cur.next ( we need to cur = cur.next . cur.next is changed. so use temporary) 
public class Reverse {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);
		//ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		//E.next = F;
		ListNode V;
		// print the Linked List
		//printNodes(A);
		V =Reverse(A);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode Reverse(ListNode cur){
		ListNode prev = null;
		ListNode next;
		while(cur != null){
			next = cur.next;
			cur.next = prev;
			prev = cur ;
			cur = next;
		}
		return prev;
		
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}

}
