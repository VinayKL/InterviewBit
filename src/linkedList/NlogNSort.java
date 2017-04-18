package linkedList;

public class NlogNSort {
	public static void main(String args[]){
		ListNode A = new ListNode(5);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(6);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(1);
		//ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		//E.next = F;
		ListNode V;
		// print the Linked List
		printNodes(A);
		V =sortList(A);
		System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode sortList(ListNode a) {
		ListNode result = a;
		
		
		return result;
		
	}
	
	public static void printNodes(ListNode B){
		ListNode A = B;
		while(A !=  null){
			System.out.print(A.val+ "  ");
			A = A.next;
		}
		System.out.println();
	}
}
