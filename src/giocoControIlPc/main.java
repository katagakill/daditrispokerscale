package giocoControIlPc;

public class main {
	public static int vincitore(int puntiumano,int puntiai) {//confronto punteggi
		if(puntiumano>puntiai) {
			return  1;
		}else if(puntiumano<puntiai) {
			return 0;
		}else {
			return  2;
		}
	}

	public static void main(String[] args) {
		int ndadi=5;//numero dei dadi da 6 sei  facce
		int ntiri=10;// numero di lanci  da effetturare
		int vince;
		//***********************************
		risultato umano= new  risultato();
		risultato AI= new  risultato();
		dado d1= new dado();
		dado d2= new dado();
		//***********************************
		//creazione oggetti
		for(int i=0;i<ntiri;i++){//ciclo per il lancio dei dadi in questo caso  10
			System.out.println("ora lancio i dadi e ti dirò i risultati");
			d1.setNdadi(ndadi);//impostazione dei dadi  alla classe dado  
			d1.lancio();
			umano.riordino(d1.getV());//metodo  per portare il vettore dell'oggetto dado alla  classe riuslato
			umano.punteggio(d1.getV());
			System.out.println(umano.toString());//restituzione  punteggio  parziale umano
			System.out.println("ora lancio i dadi del computer");
			d2.setNdadi(ndadi);
			d2.lancio();
			AI.riordino(d2.getV());
			AI.punteggio(d2.getV());
			System.out.println(AI.toString());//restituzione  punteggio  parziale AI
	
		}
		//*******************************************************
		vince=vincitore(umano.getPunteggio(),AI.getPunteggio());
		if(vince==1) {
			System.out.println("il vincitor è   l'umano");
		}else if(vince==2) {
			System.out.println("il  vincitore  è AI");
		}else {
			System.out.println("pareggio!!");
		}
		//***************************************************
		//determina  il vincitore
        
	}

}
