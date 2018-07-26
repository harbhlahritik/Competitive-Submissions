package com.hritik;

public class Stack {
	int maxsize;
	int top;
	int [] arr;
	
	public Stack(int n) {
		maxsize = n;
		arr = new int [maxsize];
		top = -1;
	}
	
	public void push(int data) {
		if(top == maxsize-1) {
			System.out.println("Stack overflow");
			return;
		}
		top++;
		arr[top] = data;
	}
	
	public boolean empty() {
		if(top == -1) { return true; }
		return false;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack empty");
			return -1;
		}
		int n = arr[top];
		top--;
		return n;
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("No element in stack");
			return -1;
		}
		return arr[top];
	}
	
	public static void print_stack(Stack s) {
		for(int i = 0;i <= s.top;i++) {
			System.out.print(s.arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Stack s = new Stack(16);
		s.push(1); s.push(2); s.push(3); s.push(4);
		print_stack(s);
		System.out.println(s.pop());
		print_stack(s);
		System.out.println(s.peek());
		print_stack(s);
	}
}