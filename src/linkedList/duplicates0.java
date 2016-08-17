package linkedList;

public class duplicates0 {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(1);
		ListNode C = new ListNode(2);
		ListNode D = new ListNode(2);
		ListNode E = new ListNode(2);
		ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		ListNode V; 
		// print the Linked List
		//printNodes(A);
		V =deleteDuplicates(A);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode deleteDuplicates(ListNode A){
		ListNode X = A;
		while(X.next != null){
			if( X.val == X.next.val){
				X.next = X.next.next;
			}
			else{
				X = X.next;
			}
			
		}
		return A;
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
}
