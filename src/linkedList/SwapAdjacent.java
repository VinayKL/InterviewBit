package linkedList;

public class SwapAdjacent {
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
		V =SwapAdjacent(A);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode SwapAdjacent(ListNode a){
		ListNode X = a;
		int temp =0;
		while( X!= null){
			if( X.next != null){
				temp = X.next.val;
				X.next.val = X.val;
				X.val = temp;
				X = X.next.next;
			}
			else {
				X = X.next;
			}
		}
		return a;
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
}
