package linkedList;

public class duplicates {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(1);
		ListNode C = new ListNode(2);
		ListNode D = new ListNode(3);
		ListNode E = new ListNode(5);
		ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = D;
		D.next = E;
		E.next = F;
		ListNode V; 
		// print the Linked List
		//printNodes(A);
		V =deleteDuplicates(A);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode duplicates(ListNode X){
		if(X.next  == null){
			return X;
		}
		
		ListNode D = new ListNode(0);
		D.next = X;
		ListNode C = D;
		// Sort the linked list
		//sort(A);
		//System.out.println("After sorting");
		//printNodes(A);
		// remove the duplicates
		int flag =0;
		int counter = 0;
		while(C.next != null){
			ListNode A = C.next;
			while(A.next!= null){
				ListNode B = A.next;
				while(B != null){
					flag =0;
					while( A.val == B.val)
					{
						B = B.next;
						flag =1;
					}
					if( flag == 1){
						if( counter == 0){
							C = B;
							break;
						}
						else{
							C.next = B;
							break;
						}	
					}
					else if(flag ==0 ){	
						A= A.next;
						counter++;
						break;
					}
				}	
					
			}
			C = C.next;
		}
		
		return D.next;
		
	}
	// copied code
	// Understand the pointers usage here.
	public static ListNode deleteDuplicates(ListNode a) {
	    ListNode t = new ListNode(0);
	    t.next = a;
	 
	    ListNode p = t;
	    while(p.next!=null&&p.next.next!=null){
	        if(p.next.val == p.next.next.val){
	            int dup = p.next.val;
	            while(p.next!=null&&p.next.val==dup){
	                p.next = p.next.next;
	            }
	        }else{
	            p=p.next;
	        }
	 
	    }
	 
	    return t.next;
	}

	public static void sort(ListNode A){
		int temp;
		while(A != null){
			ListNode B = A.next;
			while(B!= null){
				if(B.val < A.val){
					temp = A.val;
					A.val = B.val;
					B.val = temp;
				}
				B = B.next;
			}
			
			A = A.next;
		}
	
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	
}
