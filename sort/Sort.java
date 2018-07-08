package Interview.sort;
//类型 T 必须实现 Comparable 接口，并且这个接口的类型是 T。
public abstract class Sort<T extends Comparable<T>> {
	
	public abstract void sort(T[] nums);
	protected boolean less(T v,T w){
		return v.compareTo(w)<0;
	}
	protected void swap(T[] a,int i,int j) {
		T t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
}
