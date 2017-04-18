package linkedList;

public class Test{
	public static void main(String args[]){
		ListNode A = new ListNode(2);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(4);
		ListNode D = new ListNode(26);
		A.next = B;
		B.next = C;
		C.next = D;
		ListNode Result = compute(A);
		while( Result != null){
			System.out.println(Result.val);
			Result = Result.next;
		}
	}

	public static ListNode compute(ListNode root){
		ListNode temp = root;
		while( temp != null){
			if( temp.val == temp.next.val){
				temp = temp.next.next;
			}else{
				temp = temp.next;
			}
		}
		return root;
	}
}

