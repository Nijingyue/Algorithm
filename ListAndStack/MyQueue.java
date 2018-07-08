package Interview.StackandList;

public interface MyQueue <Item>extends Iterable<Item>{
	int size();
	boolean isEmpty();
	MyQueue<Item> add(Item item);
	Item remove()throws Exception;
}
