package linkedList;

import linkedList.LinkedList.Node;

public class LLm_n {
	
	public static void llmn(Node head,int m,int n) {
		Node temp = head;
		while(temp!=null) {
			Node temp1 = temp;
			for(int i = 1;i < m;i++) {
				temp = temp.next;
			}
			temp1 = temp;
			for(int i = 0;i <= n;i++) {
				temp = temp.next;
			}
			temp1.next = temp;
		}
	}
	
	public static void deleteNafterM(Node head, int N, int M)
	{
		if(head==null)
			return;
		Node temp = head;
		int count = 1;
		while(temp!=null && count<M)
		{
			temp = temp.next;
			count++;
		}
		if(temp!=null)
		{
			temp.next = getAfterN(temp.next, N);
			deleteNafterM(temp.next, N, M);
		}
	}
	
	public static Node getAfterN(Node head, int N)
	{
		if(head==null)
			return head;
		int count = 0;
		Node temp = head;
		while(temp!=null && count < N)
		{
			temp = temp.next;
			count++;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.append(8);
		ll.append(9);
		ll.append(10);
		ll.append(11);
		ll.append(12);
		
		ll.print();
		
		deleteNafterM(ll.head, 2, 2);
		
		ll.print();
		
		LinkedList l = new LinkedList();
		
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.append(7);
		l.append(8);
		l.append(9);
		l.append(10);
		l.append(11);
		l.append(12);
		
		l.print();
		
		llmn(l.head, 2, 2);
		
		l.print();
	}
}
