package linkedList;

import java.util.HashSet;

public class IntersectionOfLinkedLists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(5);
		
		
		ListNode C = new ListNode(7);
		ListNode C1 = new ListNode(6);
		
		ListNode D = new ListNode(2);
		ListNode E = new ListNode(4);
		ListNode F = new ListNode(6);
		
		A.next = B;
		
		
		D.next = E;
		E.next = F;
		
		F.next = C;
		B.next = C;
		C.next = C1;
		
		
		ListNode V; 
		V = getIntersectionNode(A,D);
		// print
		System.out.println(V.val);
		
		
	}
	public static ListNode getIntersectionNode(ListNode a, ListNode b) {
		
		int count1 =0;
		int count2 =0;
		ListNode c = a;
		ListNode d = b;
		while( c.next != null){
			count1++;
			c = c.next;
		}
		
		while( d.next != null){
			count2++;
			d = d.next;
		}
		
		int diff = count1 - count2;
		if( diff >0){
			count1=0;
			while( count1 != diff){
				a = a.next;
			}
			while( a.next != null && b.next!= null){
				if( a == b){
					return a;
				}else{
					a = a.next;
					b = b.next;
				}
			}
		}
		else{
			count2=0;
			diff = -diff;
			//System.out.println(diff + " "+b.val);
			while( count2 != diff){
				count2++;
				b = b.next;
			}
			while( a.next != null && b.next!= null){
				if( a == b){
					return b;
				}else{
					a = a.next;
					b = b.next;
				}
			}
		}
		
		return null;
		
	}
	
}
