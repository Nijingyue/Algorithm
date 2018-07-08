package Interview.sort;
/*
 * 选择排序
 * 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
 * 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
 * 不断进行这样的操作，直到将整个数组排序。
 * N^2/2次比较和N次交换
 */
public class Selection<T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		int N=nums.length;
		for(int i=0;i<N;i++){
			int min=i;
			for(int j=i+1;j<N;j++){
				if(less(nums[j],nums[min])){
					min=j;
				}
				swap(nums, i, min);
			}
		}
		
	}

}
