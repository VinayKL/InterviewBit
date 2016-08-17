package linkedList;

// Key points ( Corner cases )
// size=1 and N =1
// size - N == 0    
public class RemoveNthNodeFromEnd {
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
		int b = 5;
		// print the Linked List
		//printNodes(A);
		V =removeNth(A,b);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode removeNth(ListNode a,int b){
		ListNode X = a;
		ListNode W = a;
		int counter = 0;
		int temp = 0;
		while( W != null){
			counter++;
			W = W.next;
		}
		
		if( counter < b){
			a = a.next;
			return a;
		}
		if(counter == 1 && b ==1){
			return null;
		}
		if( counter -b == 0){
			a = a.next;
			return a;
		}
		while(temp != (counter - b -1) && X!=null){
			temp++;
			X = X.next;
		}
		X.next = X.next.next;
		return a;
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
}
