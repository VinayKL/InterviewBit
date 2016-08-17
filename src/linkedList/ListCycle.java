package linkedList;

import java.util.HashMap;
import java.util.HashSet;

public class ListCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		F.next = null;
		
		ListNode result = detectCycle(A);
		System.out.println(result);

	}
	public static ListNode detectCycle(ListNode a) {
		ListNode result = null;
		HashSet vkl = new HashSet();
		int flag = 0;
		while( a.next != null){
			if( vkl.contains(a)){
				flag =1;
				result = a;
				break;
			}
			vkl.add(a);
			a = a.next;
		}
		if( flag ==0){
			return null;
		}else{
			return result;
		}
		
	}
}
