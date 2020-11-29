

package giocoControIlPc;



public class dado {
	
	private int ndadi;			//  impostato  dall'esetro mediante set
	private int nfaccie=6;		//  facce  impostabili dei tramite  comando di set,  ora lasciato in default a 6
	private int v[];			// vettore  che contiene i risulati, non  impstato perchè gli verrà  asseganata la lunghezza 
								//	di ndadi  nel set della variabile  n dadi
	
	
	
	public int getNfaccie() {
		return nfaccie;
	}
    public int[] getV() {
      return this.v;
    }
    
	public void setV(int[] v) {
		this.v = v;
	}
	public void setNdadi(int ndadi) {
		this.v= new int[ndadi];
		this.ndadi=ndadi;
	}
	public int getNdadi() {
		return ndadi;
	}
	public  void  lancio () {//  lancio dei dadi
		for(int i=0;i<v.length;i++) {
			v[i]=(int) (Math.random()*nfaccie)+1;
//			System.out.println("il lancio n:"+(i+1)+", ha dato:"+v[i]);  debug
		}
	}
}
