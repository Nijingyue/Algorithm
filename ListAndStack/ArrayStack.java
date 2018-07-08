package Interview.StackandList;

import java.util.Iterator;

//数组模拟栈
public class ArrayStack<Item> implements MyStack<Item> {
	
	private Item[] a=(Item[])new Object[1];
	private int N=0;
	
	private void check(){
		if(N>=a.length){
			resize(2*a.length);
		}else if(N>0&&N<a.length/4){
			resize(a.length/2);
		}
	}
	/*
	 * 调整数组大小，使得栈具有伸缩性
	 */
	private void resize(int size){
		Item[]tmp=(Item[])new Object[size];
		for(int i=0;i<N;i++){
			tmp[i]=a[i];
		}
		a=tmp;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		//逆序遍历
		return new Iterator<Item>() {
			private int i=N;

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return i>0;
			}

			@Override
			public Item next() {
				// TODO Auto-generated method stub
				return a[--i];
			}
		};
	}

	@Override
	public MyStack<Item> push(Item item) {
		// TODO Auto-generated method stub
		check();
		a[N++]=item;
		return this;
	}

	@Override
	public Item pop() throws Exception {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new Exception();
		}
		Item item=a[--N];
		check();
		//避免对象游离
		a[N]=null;
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
