package linkedList;

// good question.
// done from scratch
public class RotatebyKplaces {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		ListNode D = new ListNode(4);
		ListNode E = new ListNode(5);
		//ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		//E.next = F;
		ListNode V;
		int b = 6;
		// print the Linked List
		//printNodes(A);
		V =rotate(A,b);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode rotate(ListNode a, int b){
		ListNode X = a;
		ListNode Y = X;
		int counter =1;
		int vkl =0;
		while( Y.next != null){
			Y = Y.next;
			counter++;
		}
		int mod =0;
		mod = b % counter;
		
		Y.next = a;
		Y = Y.next;
		vkl = counter - mod - 1;
		int temp = 0;
		while(temp != vkl){
			X = X.next;
			Y = Y.next;
			temp++;
		}
		X = X.next;
		Y.next = null;
		return X;
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
}
