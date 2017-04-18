package linkedList;

public class Merge2SortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(5);
		ListNode C = new ListNode(7);
		ListNode D = new ListNode(2);
		ListNode E = new ListNode(4);
		ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		//C.next = D;
		D.next = E;
		E.next = F;
		ListNode V; 
		V = mergeTwoLists1(A,D);
		// print
		printNodes(V);
		
		
	}
	public static ListNode mergeTwoLists(ListNode a, ListNode b) {
		
		ListNode X = new ListNode(0);
		ListNode V = X;
		while( a != null && b != null){
			if(a.val < b.val){
				V.next = new ListNode(a.val);
				a = a.next;
				
			}
			else if(b.val<= a.val){
				V.next = new ListNode(b.val);
				b = b.next;
			}
			V = V.next;
		}
		while( a != null){
			V.next = new ListNode(a.val);
			a = a.next;
			V = V.next;
		}
		while( b != null){
			V.next = new ListNode(b.val);
			b = b.next;
			V = V.next;
		}
		return X.next;
	}
	public static void printNodes(ListNode A){
		System.out.println("The linked list is");
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	public static ListNode mergeTwoLists1(ListNode a, ListNode b) {
		ListNode main = new ListNode(0);
		ListNode head = main;
		ListNode first = a;
		ListNode second = b;
		while(first!= null && second!= null){
			if(first.val <= second.val){
				head.next = first;
				head = head.next;
				first= first.next;
			}else{
				head.next = second;
				head = head.next;
				second = second.next;
			}
		}
		while( first!= null){
			head.next = first;
			head = head.next;
			first= first.next;
		}
		while(second != null){
			head.next = second;
			head = head.next;
			second = second.next;
		}
		return main.next;
	}
}
