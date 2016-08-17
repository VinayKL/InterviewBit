package linkedList;

public class Add2numbers {
	public static void main(String args[]){
		ListNode A = new ListNode(9);
		ListNode B = new ListNode(9);
		ListNode C = new ListNode(1);
		ListNode D = new ListNode(1);
		ListNode E = new ListNode(6);
		ListNode F = new ListNode(4);
		
		A.next = B;
		B.next = C;
		C.next = null;
		
		D.next = null;
		E.next = F;
		F.next = null;
		
		ListNode result = addTwoNumbers(A,D);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}
	public static ListNode addTwoNumbers1(ListNode a, ListNode b) {
		ListNode result = null;
		
		int num1 =0;
		int var=0;
		while(a != null){
			num1 = (int) (num1 +(a.val * Math.pow(10, var)));
			var++;
			a = a.next;
		}
		int num2 = 0;
		var=0;
		
		while(b != null){
			num2 = (int) (num2 + (b.val *Math.pow(10, var)));
			var++;
			b = b.next;
		}
		
		//System.out.println(num1 + " "+ num2);
		int res = num1 + num2;
		ListNode temp = null;
		while(res != 0){
			if( temp == null){
				result = new ListNode(res % 10);
				res = res /10;
				temp = result;
				//System.out.println(result.val);
			}else{
				result.next = new ListNode(res % 10);
				res = res /10;
				result = result.next;
			}
		}
		return temp;
		
	}
	public static ListNode addTwoNumbers(ListNode a, ListNode b) {
		ListNode result = null;
		ListNode temp = result;
		int carry =0;
		while( a  != null || b!= null){
			int num1 = 0;
			int num2 =0;
			if(a == null){
				num1 = 0;
			}else{
				num1 = a.val;
				a = a.next;
			}
			if( b == null){
				num2 = 0;
			}else{
				num2 = b.val;
				b = b.next;
			}
			int sum = carry + (num1 + num2);
			if( temp == null){
				result = new ListNode(sum%10);
				carry = sum /10;
				temp = result;
			}
			else{
				result.next = new ListNode(sum %10);
				carry = sum/10;
				result = result.next;
			}
			
			
		}
		if( carry != 0){
			result.next = new ListNode(carry);
		}
		return temp;
	}
}
