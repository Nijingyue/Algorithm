package Interview.sort;

//归并方法
//归并排序的思想是将数组分成两部分，分别进行排序，然后归并起来。
public abstract class MergeSort<T extends Comparable<T>> extends Sort<T> {
	protected T[] aux;

	protected void merge(T[] nums, int l, int m, int h) {
		//i左序列指针，j右序列指针
		int i = l, j = m + 1;
		for (int k = l; k <= h; k++) {
			aux[k] = nums[k];// 将数据复制到辅助数组
		}
		/*for (int k = l; k <= h; k++) {
			if (i > m) {
				nums[k] = aux[j++];//j后面的剩余元素
			} else if (j > h) {
				nums[k] = aux[i++];//i后面的剩余元素
			} else if (aux[i].compareTo(nums[j]) <= 0) {
				nums[k] = aux[i++]; //先进行这一步，保证稳定性
			} else {
				nums[k] = aux[j++];
			}
		}*/
		//下面的代码同上面注释的含义一样，只是更好理解一些
		int k=0;
		while(i<=m&&j<=h){
			if(aux[i].compareTo(nums[j]) <= 0){
				nums[k++]=aux[i++];
			}else{
				nums[k++]=aux[j++];
			}
		}
		//添加左边剩余元素
		while(i<=m){
			nums[k++]=aux[i++];
		}
		//添加右边剩余元素
		while(j<=h){
			nums[k++]=aux[j++];
		}
		
	}
}
