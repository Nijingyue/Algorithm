package Interview.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//快速排序最好的情况下是每次都正好能将数组对半分，这样递归调用次数才是最少的。这种情况下比较次数为 CN=2CN/2+N，复杂度为 O(NlogN)。
//最坏的情况下，第一次从最小的元素切分，第二次从第二小的元素切分，如此这般。
//因此最坏的情况下需要比较 N^2/2。为了防止数组最开始就是有序的，在进行快速排序时需要随机打乱数组。
public class QuickSort <T extends Comparable<T>> extends Sort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		shuffle(nums);
		
	}
	private void shuffle(T[]nums){
		List<Comparable>list=Arrays.asList(nums);
		Collections.shuffle(list);
		list.toArray(nums);
	}
	private void sort(T[]nums,int l,int h){
		if(h<=l){
			return;
		}
		int j=partition(nums,l,h);
		sort(nums,l,j-1);
		sort(nums,j+1,h);
		
	}
	private int partition(T[] nums, int l, int h) {
		// TODO Auto-generated method stub
		int i=l,j=h+1;
		T v=nums[l];
		while(true){
			while(less(nums[++i], v)&&i!=h);
			while(less(v, nums[--j])&&j!=l);
			if(i>=j){
				break;
			}
			swap(nums, i, j);
		}
		swap(nums, l, j);
		return j;
	}
	
	// 基于切分的快速选择算法
	//可以利用这个特性找出数组的第 k 个元素。
	public T select(T[] nums,int k){
		int l=0,h=nums.length-1;
		while(h>l){
			int j=partition(nums, l, h);
			if(j==k){
				return nums[k];
			}else if(j>k){
				h=j-1;
			}else{
				l=j+1;
			}
		}
		return nums[k];
	}
	
	

}
