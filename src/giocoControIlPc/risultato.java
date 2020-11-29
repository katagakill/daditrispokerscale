package giocoControIlPc;

public class risultato {
	private int punteggio=0;
	private int parziale=0;
	private boolean  flag=true;					//flag  per  il controllo dell'asgnamento dei punti bonus(volevo provare la varibile boolean, non sò se fosse meglio mettrla qui oppure nella  classe punteggio)
	private int n15=18;							// risulato ottenuno con scala 1/5
	private int n26=20;							//risulatot ottnetuno con scala  2/6
	private  int tris=3;						// varibile  usata  per il controllo della  presnza  di un tris nel'lancio dei 5 dadi
	private int poker=5;						// varibile  usata  per il controllo della  presnza  di un poker nel'lancio dei 5 dadi
	private int puntipoker=30;					//punti da moltiplicare con il poker
	private int puntitris=5;					// punti da  moltiplicare  per il tris
	public void riordino (int v[]) {// riordinamento del  vettore
		int scambio; 
		for(int i=1;i<v.length;i++) {
			for(int j=0;j<v.length;j++) {
				if(v[j]>v[i]) {
					scambio=v[j];
					v[j]=v[i];
					v[i]=scambio;
					
				}
			}
		}
		this.parziale=0;
		for(int i=0;i<v.length;i++) {
			this.parziale=parziale+v[i];
		}
	}
	public   void punteggio(int v[]) {//assegnazione punteggi 
	this.punteggio=punteggio+this.parziale;// punteggio senza bonus
		
	//controlli per l'asegnazione dei punti bonus
	if(this.parziale==n15||this.parziale==n26) {
			for(int j=0;j<(v.length-1);j++) {
					if((v[j]+1)!=v[j+1]) {
						this.flag=false;// questa flag diventa falsa per non eseguire  l'asegnazione dei punti per le scale 
				}
			}
					if(this.flag==true) {
						if(v[0]==1) {// punti bonus  scala  1/5
							this.punteggio=punteggio+25;
			
						}else {//  punti bonus scala 2/6
							this.punteggio=punteggio+28;
						
						}
					}
			}
	//  se  la bandira è falsa  l'algoritmo verificherà se  i lanci  hanno portato ad un tris o  a un poker
		if(flag==false) {
		int contatore=0; //varibile per la verifica della  riuscita di un poker o di un tris
		for(int n=1;n<6;n++) {
			contatore=0;
			for(int g=0;g<v.length;g++) {
				if(v[g]==n) {
					contatore=contatore++;
				}
				
			}
			if(contatore==tris) {
				this.punteggio=punteggio+(n*puntitris);
			}else  if(contatore==poker) {
				this.punteggio=punteggio+(n*puntipoker);
			}
		}
			}
	}
	
	

	public int getPunteggio() {
		return punteggio;
	}
	@Override
	public String toString() {// to string del puteggio parziale e totale
		return "risultato [punteggio=" + punteggio + "]";
	}
	


}