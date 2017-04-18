package linkedList;

public class ReverseN {
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
		
		int m = 2;
	
		V =reverseList(A,m);
		
		printNodes(V);
		
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	public static ListNode reverseList(ListNode A, int B) {
		ListNode rev = reverse(A,B);
		return rev;
    }
	public static ListNode reverse(ListNode A, int B){
		ListNode prev= null;
		ListNode next=null;
		ListNode Curr = A;
		int count =0;
		while(count <B && Curr!= null){
			next = Curr.next;
			Curr.next = prev;
			prev = Curr;
			Curr = next;
			count++;
		}
		// using A.next is the key here. A will have the last element(formerly first element)
		if( next != null){
			A.next = reverse(next,B);
		}
		return prev;
	}
	
}
