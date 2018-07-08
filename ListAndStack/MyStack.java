package Interview.StackandList;

public interface MyStack <Item>extends Iterable<Item>{
	MyStack<Item> push(Item item);
	Item pop() throws Exception;
	boolean isEmpty();
	int size();
}
