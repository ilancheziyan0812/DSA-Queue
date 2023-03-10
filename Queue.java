package com.queue;

import java.util.NoSuchElementException;

public class Queue {

	private ListNode front;
	private ListNode rear;
	private int length;
	private class ListNode
	{
		private int data;
		private ListNode next;
		public ListNode(int data)
		{
			this.data=data;
		}
	}
	public int length()
	{
		return length=0;
	}
	public boolean isEmpty()
	{
		return length==0 ;//length==null;
	}
	public ListNode enQueue(int value)
	{
		ListNode temp = new ListNode(value);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next=temp;
		}
		rear=temp;
		length++;
		return temp;
	}
	public void display()
	{
		ListNode  current = front;
		if(current==null)
		{
			System.out.println("No Node present");
		}
		
		while(current!=null)
		{
			System.out.print(current.data+" <--- ");
			current = current.next;
		}
		System.out.println("null");
	}
	public int deQueue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		int result=front.data;
		
		front = front.next;
		if(front==null)
		{
			rear=null;
		}
		length--;
		return result;
	}
	public static void main(String[] args) {

		Queue q = new Queue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.display();
		System.out.println(q.length);
		System.out.println(q.deQueue());
		q.display();
	}
}
