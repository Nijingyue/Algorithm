package Interview.UF;

public abstract class UF {
	protected int [] id;
	public UF(int N){
		for(int i=0;i<N;i++){
			id[i]=i;
		}
	}
	public abstract int find(int p);
	public abstract void union(int p,int q);
	
	public boolean connected(int p,int q){
		return find(p)==find(q);
	}
}
