package linkedList;
// Top Priority question
// Understand.
public class ReverseMN {
	public static void main(String args[]){
		ListNode A = new ListNode(1);
		ListNode B = new ListNode(2);
		ListNode C = new ListNode(3);
		//ListNode D = new ListNode(4);
		//ListNode E = new ListNode(5);
		//ListNode F = new ListNode(6);
		A.next = B;
		B.next = C;
		C.next = null;
		//D.next = E;
		//E.next = F;
		ListNode V;
		// print the Linked List
		//printNodes(A);
		int m = 1;
		int n = 2;
		V =ReverseMN1(A,m,n);
		//System.out.println("Final output is");
		// print the Linked List
		printNodes(V);
		
	}
	public static ListNode ReverseMN(ListNode head,int m, int n){
		if(m==n) return head;
		 
	    ListNode prev = null;//track (m-1)th node
	    ListNode first = new ListNode(0);//first's next points to mth
	    ListNode second = new ListNode(0);//second's next points to (n+1)th
	 
	    int i=0;
	    ListNode p = head;
	    while(p!=null){
	        i++;
	        if(i==m-1){
	            prev = p;
	        }
	 
	        if(i==m){
	            first.next = p;
	        }
	 
	        if(i==n){
	            second.next = p.next;
	            p.next = null;  // we need to come out of loop as soon as we touch 'n'
	        }
	 
	        p= p.next;
	    }
	    if(first.next == null)
	        return head;
	 
	    // Didn't understand this part.
	    // reverse list [m, n]    
	    ListNode p1 = first.next;
	    ListNode p2 = p1.next;
	    p1.next = second.next;
	    
	    ListNode next;
	    while(p1!=null && p2!=null){
	        next = p2.next;
	        p2.next = p1;
	        p1 = p2;
	        p2 = next;
	    }

	    if(prev!=null)
	        prev.next = p1;
	    else
	        return p1;
	 
	    return head;
	}
	public static void printNodes(ListNode A){
		while(A !=  null){
			System.out.println(A.val);
			A = A.next;
		}
	}
	public static ListNode ReverseMN1(ListNode head,int m, int n){
		int counter =1 ;
		ListNode temp = head;
		while(temp.next!= null){
			counter++;
			temp = temp.next;
		}
		if( m>n || counter < n){
			return head;
		}
		ListNode prev = null;
		ListNode curr = head;
		int count =0;
		if( m!= 1){
			while(count != m-1 ){
				prev = curr;
				curr = curr.next;
				count++;
			}
			prev.next = null;
		}
		
		ListNode end = curr;
		ListNode endp = null;
		while(count!= n){
			endp = end;
			end = end.next;
			count++;
		}
		
		ListNode conti= end;
		endp.next = null;
		ListNode rev = reverse(curr);
		//printNodes(rev);
		if( m != 1){
			prev.next = rev;
		}else{
			head = rev;
		}
		
		while(rev.next!= null){
			rev= rev.next;
		}
		
		rev.next = conti;
		return head;
	}
	private static ListNode reverse(ListNode head) {
		ListNode curr = head;
		ListNode prev= null;
		ListNode next = null;
		while(curr!= null){
			next = curr.next;
			curr.next = prev;
			prev= curr;
			curr = next;
		}
		return prev;
	}
	
}
