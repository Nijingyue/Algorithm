package Interview.UF;

public class QuickUnionUF extends UF{
	public QuickUnionUF(int N) {
		// TODO Auto-generated constructor stub
		super(N);
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		while(p!=id[p]){
			p=id[p];
		}
		return p;
	}

	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pRoot=find(p);
		int qRoot=find(q);
		if(pRoot!=qRoot){
			id[pRoot]=qRoot;
		}else{
			return;
		}
	}

}
