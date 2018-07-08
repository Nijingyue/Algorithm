package Interview.sort;
//对于有大量重复元素的数组，可以将数组切分为三部分，分别对应小于、等于和大于切分元素。
//三向切分快速排序对于只有若干不同主键的随机数组可以在线性时间内完成排序。
public class ThreeWayQuickSort <T extends Comparable<T>>  extends QuickSort<T> {
	protected void sort(T[] nums,int l,int h) {
		if(h<=l){
			return;
		}
		//lt表示左侧小于比较值的下标
		//gt表示右侧大于比较值的下标
		//i是当前要进行比较的下标。i从左向右
		int lt=l,i=l+1,gt=h;
		T v=nums[l];
		//当i与gt相遇，表示首次分析完成
		while(i<=gt){
			int cmp=nums[i].compareTo(v);
			//如果i小于比较值，i和lt互换，lt递增，存储下一个小的值，i也递增
			if(cmp<0){
				swap(nums, lt++, i++);
			//如果i大于比较的值，当前i与gt交换，gt递减，准备一个下一个大的值，
			//i不用递进，因为i是从左向右移动的，
			//对于小于比较的处理，因为i已经知道左侧的值都是经过它处理的,一定是比它小的，所以小于时i递增；
			//当前处理大于比较值的时候，右侧的数据什么情况不清楚，所以当右侧数据交换到当前索引i，i不能递进。
			}else if(cmp>0){
				swap(nums, i, gt--);
			}else{
				i++;
			}
		}
		sort(nums, l, lt-1);
		sort(nums,gt+1,h);
	}
}
