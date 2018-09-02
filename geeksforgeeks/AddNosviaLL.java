class GfG
{
	Node addTwoLists(Node first, Node second)
	{
	   // Your code here
	   	int carry = 0;
	   	int val = first.data + second.data + carry;
	   	if(val >= 10){
	       	carry = 1;
	    	val = val%10;
	   	} else {
	        carry = 0;
	   	}
	   	Node n = new Node(val);
	   	first = first.next;
	   	second = second.next;
	   	Node head = n;
	   	//System.out.println("Value of head = "+head.data);
	   	while(first != null && second != null){
	        val = first.data + second.data + carry;
	        if(val >= 10){
	            carry = 1;
	            val = val%10;
	        } else {
	            carry = 0;
	        }
	        n.next = new Node(val);
	        first = first.next;
	        second = second.next;
	        n = n.next;
	    }
	    while(first != null){
	        n.next = new Node(first.data + carry);
	        n = n.next;
	        first = first.next;
	        carry = 0;
	    }
	    while(second != null){
	        n.next = new Node(second.data + carry);
	        n = n.next;
	        second = second.next;
	        carry = 0;
	    }
	    return head;
	}
}