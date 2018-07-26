package com.hritik;

import com.hritik.LinkedList1.Node;

class LinkedList1 {
	Node head;
	
	static class Node {
		int data; // data of linkedlist1
		Node next;
		// constructor
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
}

public class LinkedListImplementation {
	
	public static void print_ll(LinkedList1 llnode) {
		Node n = llnode.head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList1 llnode = new LinkedList1();
		llnode.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		llnode.head.next = second;
		second.next = third;
		print_ll(llnode);
	}
}
