package com.hritik;

public class Queue {
	int capacity,front,rear,size;
	int [] array;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue queue) {
		return queue.size == queue.capacity;
	}
	
	boolean isEmpty(Queue queue) {
		return queue.size == 0;
	}
	
	public void enqueue(int item) {
		if(isFull(this)) {
			return;
		}
		this.rear = (this.rear+1)%this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item+" is enqueued to the queue");
	}
	
	public int dequeue() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		int item = this.array[this.front];
		this.front = (this.front+1)%this.capacity;
		this.size = this.size - 1;
		return item;
	}
	
	public int front() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.front];
	}
	
	public int rear() {
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		return this.array[this.rear];
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(1000);
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue()+" dequeued from the queue\n");
		System.out.println("Front item is "+queue.front());
		System.out.println("Rear item is "+queue.rear());
	}
}
