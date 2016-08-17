package linkedList;

public class partitionList {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(4);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(2);
		ListNode E = new ListNode(5);
		ListNode F = new ListNode(2);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		F.next = null;
		int value = 3;
		ListNode input = A;
		while(input != null){
			System.out.print(input.val+" ");
			input= input.next;
		}
		System.out.println();
		ListNode result = partition(A,value);
		while(result != null){
			System.out.println(result.val);
			result= result.next;
		}
	}
	public static ListNode partition(ListNode a, int b) {
		ListNode startNode = null;
		ListNode start=null;
		ListNode great = null;
		ListNode greatNode = null;
		while( a != null){
			if(a.val < b){
				if( start == null){
					start = a;
					startNode = a;
				}else{
					start.next = a;
					start = start.next;
				}
			}else{
				if( great == null){
					great = a;
					greatNode = a;
				}else{
					great.next = a;
					great = great.next;
				}
			}
			a = a.next;
		}
		great.next = null;
		if( start == null){
			a = greatNode;
		}else{
			start.next = greatNode;
			a = startNode;
		}
		return a;
	}
}
