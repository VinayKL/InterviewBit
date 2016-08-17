package checkpoints;

import java.util.LinkedList;

public class subtract_halfNodes {
	public static void main(String args[]){
		ListNode a =new ListNode(1);
		ListNode c =a;
		a.next = new ListNode(2);
		a.next = new ListNode(3);
		a.next = new ListNode(4);
		a.next = new ListNode(5);
		ListNode b;
		while(c.next != null){
			System.out.println(c.val+ " ");
			c = c.next;
		}
		b = subtract(a);
		while(b.next != null){
			System.out.println(b.val+ " ");
			b = b.next;
		}
		
	}
	public static ListNode subtract(ListNode a) {
		int counter =0;
		ListNode b =a;
		ListNode c =a;
		ListNode d =a;
		ListNode f =a;
		ListNode e = a;
		int half = 0;
		int interm =0;
		int interm1 =0;
		while(c.next != null){
			c =c.next;
			counter++;
		}
		half= counter /2;
		
		for( int i =0 ; i< half; i++){
		    b =f;
		    for( int k=0;k < i ; k++){
		        b = b.next;
		    }
			interm = b.val;
			d =f;
			for( int j = 0; j< counter-1 ; j++){
				d = d.next;
			}
			interm1 = d.val;
			a.val = interm1 - interm;
			a = a.next;
			counter--;
		}
		return e;
	    
	}
}

