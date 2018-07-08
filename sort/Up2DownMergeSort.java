package Interview.sort;
//自上而下的归并排序
//因为每次都将问题对半分成两个子问题，而这种对半分的算法复杂度一般为 O(NlogN)，
//因此该归并排序方法的时间复杂度也为 O(NlogN)。
public class Up2DownMergeSort <T extends Comparable<T>> extends MergeSort<T>{

	@Override
	public void sort(T[] nums) {
		// TODO Auto-generated method stub
		aux=(T[])new Comparable[nums.length];
		sort(nums,0,nums.length-1);
	}
	private void sort(T[]nums,int l,int h){
		if(h<=l)
			return;
		int mid=l+(h-l)/2;
		sort(nums,l,mid);
		sort(nums,mid+1,h);
		merge(nums, l, mid, h);
		
	}

}
