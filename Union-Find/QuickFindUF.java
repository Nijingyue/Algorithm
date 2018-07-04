package Interview.UF;

public class QuickFindUF extends UF{
	public QuickFindUF(int N) {
		// TODO Auto-generated constructor stub
		super(N);
	}

	@Override
	public int find(int p) {
		// TODO Auto-generated method stub
		return id[p];
	}

	@Override
	public void union(int p, int q) {
		// TODO Auto-generated method stub
		int pID=find(p);
		int qID=find(q);
		if(pID==qID){
			return;
		}
		for(int i=0;i<id.length;i++){
			if(id[i]==pID){
				id[i]=qID;
			}
		}
	}

}
