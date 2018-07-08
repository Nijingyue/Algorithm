package Interview.sort;
/*
 * 冒泡排序
 * 通过从左到右不断交换相邻逆序的相邻元素，在一轮的交换之后，可以让未排序的元素上浮到右侧。
 * 在一轮循环中，如果没有发生交换，就说明数组已经是有序的，此时可以直接退出。
 */
public class Bubble <T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N=nums.length;
		boolean hasSorted=false;
		for(int i=0;i<N&&!hasSorted;i++){
			hasSorted=true;
			for(int j=0;j<N-i-1;j++){
				if(less(nums[j+1], nums[j])){
					hasSorted=false;
					swap(nums, j, j+1);
				}
			}
		}
		
	}

}
