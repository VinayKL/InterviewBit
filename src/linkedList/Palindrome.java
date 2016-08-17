package linkedList;

public class Palindrome {
	public static void main(String args[]){
		ListNode A = new ListNode(6);
		ListNode B = new ListNode(1);
		ListNode C = new ListNode(2);
		ListNode D = new ListNode(2);
		ListNode E = new ListNode(7);
		ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		int result;
		result = lPalin(A);
		if(result == 0){
			System.out.println("Is a not a Palindrome");
		}
		else if(result == 1){
			System.out.println("It is a Palindrome");
		}
	}
	public static int lPalin(ListNode head) {
		
		if(head == null)
	        return 1;
	 
	    ListNode p = head;
	    ListNode prev = new ListNode(head.val);
	 
	    while(p.next != null){
	        ListNode temp = new ListNode(p.next.val);
	        temp.next = prev;
	        prev = temp;
	        p = p.next;
	    }
	 
	    ListNode p1 = head;
	    ListNode p2 = prev;
	 
	    while(p1!=null){
	        if(p1.val != p2.val)
	            return 0;
	 
	        p1 = p1.next;
	        p2 = p2.next;
	    }
	 
	    return 1;
	}
}
