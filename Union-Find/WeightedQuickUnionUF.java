package Interview.UF;

public class WeightedQuickUnionUF extends UF {
	//保存节点数量信息
	private int[] sz;
	public WeightedQuickUnionUF(int N) {
		// TODO Auto-generated constructor stub
		super(N);
		this.sz=new int[N];
		for(int i=0;i<N;i++){
			this.sz[i]=1;//初始每个组都是1
		}
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		while(p!=id[p]){
			/*路径压缩加权
			 * 将父节点设置成爷爷节点
			 * */
			p=id[p];
		}
		return p;
	}

	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int i=find(p);
		int j=find(q);
		if(i==j){
			return;
		}
		//将小树做大树的子树
		if(sz[i]<sz[j]){
			id[i]=j;
			sz[j]+=sz[i];
		}else{
			id[j]=i;
			sz[i]+=sz[j];
		}
		
	}

}
