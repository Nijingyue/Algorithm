package Interview.StackandList;

import java.util.Iterator;
//队列
public class ListQueue<Item>implements MyQueue<Item> {
	private Node first;
	private Node last;
	int N=0;
	
	private class Node{
		Item item;
		Node next;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<Item>) new Iterator<Item>() {
			Node cur=first;

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
	public int size() {
		// TODO Auto-generated method stub
		return N;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return N==0;
	}

	@Override
	public MyQueue<Item> add(Item item) {
		// TODO Auto-generated method stub
		Node newNode=new Node();
		newNode.item=item;
		newNode.next=null;
		if(isEmpty()){
			last=newNode;
			first=newNode;
		}else{
			last.next=newNode;
			//新节点做尾节点
			last=newNode;
		}
		N++;
		return this;
	}

	@Override
	public Item remove() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new Exception("queue is empty");
		}
		Node node=first;
		first=first.next;
		N--;
		if(isEmpty()){
			last=null;
		}
		return node.item;
	}

}
