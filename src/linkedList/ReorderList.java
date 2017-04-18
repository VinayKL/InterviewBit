package linkedList;

public class ReorderList {
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
		// print the Linked List
		printNodes(A);
		V =ReorderN(A);
		System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	private static ListNode Reorder(ListNode a) {
		// TODO Auto-generated method stub
		ListNode t1,t2,t3,t4,t5,ret;
		ret =a;
		t1 =a;
		while(t1!= null ){
			t2 =t1;
			t5 = t1.next;
			t3=t1.next;
			t4= null;
			int flag =0;
			while(t5!= null && t3.next!= null){
				flag =1;
				t4 =t3;
				t3 =t3.next;	
			}
			if( flag == 1){
				t4.next= null;
				t2.next = t3;
				t3.next = t5;
				t1 = t1.next.next;
			}
			else{
				t1= t1.next;
			}
			
		}
		
		return ret;
	}
	private static ListNode ReorderN(ListNode a) {
		ListNode res=a;
		ListNode t0,t1,t2,t3,t4,t5;
		t0=a;
		t1= a;
		t2 =a;
		
		// Step 1 :- Get the middle element
		while(t1 != null && t1.next != null ){
			t2 = t2.next;
			t1= t1.next.next;
			
		}
		
		// t2 has the middle element
		// Reserve from the second half
		t3 = t2.next;
		t2.next = null;
	
		
		t3 = Reverse(t3);
		
		
	
	    res = t0;
	    ListNode t0_next;
	    ListNode t3_next;
		while( t3!= null && t0!=null ){
			t0_next = t0.next;
			t3_next = t3.next;
			
			t0.next = t3;
			t3.next = t0_next;
			
			t3 = t3_next;
			t0 = t0_next;
			
		}
		return res;
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
	public static void printNodes(ListNode B){
		ListNode A = B;
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	
	
}
