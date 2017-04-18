package linkedList;

public class InsertionSort {
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
		V =insertionSortList(A);
		System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode insertionSortList(ListNode a) {
		
		
		ListNode t1 =a;
		int counter=0;
		while(t1 != null){
			counter++;
			t1= t1.next;
		}
		
		ListNode s = null;
		ListNode p = null;
		ListNode q = new ListNode(Integer.MIN_VALUE);
		
		// Create a new list with dummy at the beginning
		q.next = a;
		
		
		for ( int i=2 ; i<= counter ;i++){
			s =q;
			p =q;
			int j=0;
			ListNode w = null;
			while(j != i){
				w = s;
				s = s.next;
				j++;		
			}
			int val = s.val;
			
			//System.out.println("Current one is "+val + " previous one is "+ w.val);
			
			
			while (p.next.val < val){			
				p = p.next;
			}
			
			//System.out.println("Place after "+ p.val);
			
			if( p.next.val == s.val){
				
			}else{
				ListNode temp =  p.next;
				p.next = s;
				w.next = s.next;
				s.next = temp;
				
			}
			//printNodes(q);
			
		}
		
		return q.next;
		
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
