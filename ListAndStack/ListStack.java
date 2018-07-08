package Interview.StackandList;

import java.util.Iterator;


//链表模拟栈（头插法）
public class ListStack<Item> implements MyStack<Item>{
	private Node top=null;
	private int N=0;
	
	private class Node{
		Item item;
		Node next;
	}
	

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Item>() {
			private Node cur=top;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return cur!=null;
			}

			@Override
			public Item next() {
				// TODO Auto-generated method stub
				Item item=cur.item;
				cur=cur.next;
				return item;
			}
		};
	}

	@Override
	public MyStack<Item> push(Item item) {
		// TODO Auto-generated method stub
		Node newTop=new Node();
		newTop.item=item;
		newTop.next=top;
		N++;
		return this;
	}

	@Override
	public Item pop() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new Exception("stack is empty");
		}
		Item item=top.item;
		top=top.next;
		N--;
		return item;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return N==0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return N;
	}

}
