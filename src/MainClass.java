import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//Test date
		Data d1=new Data(1,2,1980);
		Data d2=new Data(1,1,1999);
		Data d3=new Data(1,1,1980);
		Data d4=new Data(1,2,1999);
		Data d5=new Data(1,2,2000);

		
		//test Array
		Dipendente dip1=new Dipendente(1,"Nino",d2,2012,3);
		Dipendente dip2=new Dipendente(2,"Claudio",d2,2012,3);
		Dipendente dip3=new Dipendente(3,"Luisa",d3,2008,6);
		Dipendente dip4=new Dipendente(4,"Marta",d4,2015,1);
		Dipendente dip5=new Dipendente(5,"Laura",d5,2014,3);
		
		Azienda a1=new Azienda();
		
		a1.setDipendente(dip1);
		a1.setDipendente(dip2);
		a1.setDipendente(dip3);
		a1.setDipendente(dip4);
		a1.setDipendente(dip5);
		
		//test getDipendente
		System.out.println(a1.toString());
		System.out.println("\n"+a1.getDipendente(4).toString());
		
		//test elencoDipendentiStipendio
		Dipendente[] elencoDipendentiStipendio;
		int stipendio=1175;
		elencoDipendentiStipendio=a1.dipendentiStipendio(stipendio);
		System.out.println("elenco dipendenti con stipendio pari a: "+stipendio);
		for (int i = 0; i < elencoDipendentiStipendio.length; i++) 
		{
			System.out.println(elencoDipendentiStipendio[i].toString());
		}
			
		//Test più retribuito
		System.out.println("Dipendente più retribuito:");
		System.out.println(a1.getPiuRetribuito().toString());
		
		//Test più giovane
		System.out.println("Dipendente più giovane:");
		System.out.println(a1.getPiuGiovane().toString());
	}
	
	
}




/*	----------------------FINE E SERCIZIO AZIENDA---------------------------------------------------------------------------------

//Interfaccia  esercizio impiegati
	Scanner tastiera=new Scanner(System.in);
	System.out.println("Quanti dipendenti?");
	int numeroDipendenti=tastiera.nextInt();
	Dipendente[] elencoDipendenti=new Dipendente[numeroDipendenti];
	int matricola;
	String nominativo;
	
	for (int i = 0; i < elencoDipendenti.length; i++) 
	{
		Data data=new Data();
		Dipendente dipendente=new Dipendente();
		System.out.println("Inserisci matricola");
		dipendente.setMatricola(tastiera.nextInt());
		tastiera.nextLine();
		System.out.println("Inserisci nominativo");
		dipendente.setNominativo(tastiera.nextLine());
		System.out.println("Inserisci giorno di nascita");
		data.setGiorno(tastiera.nextInt());
		System.out.println("Inserisci mese di nascita");
		data.setMese(tastiera.nextInt());
		System.out.println("Inserisci anno di nascita");
		data.setAnno(tastiera.nextInt());
		dipendente.setDataNascita(data);
		System.out.println("Inserisci anno assunzione");
		dipendente.setAnnoAssunzione(tastiera.nextInt());
		System.out.println("Inserisci livello retributivo");
		dipendente.setLivelloRetributivo(tastiera.nextInt());
		elencoDipendenti[i]=new Dipendente(dipendente);
	}
	
	//visualizzazione dipendenti
	for (int i = 0; i < elencoDipendenti.length; i++) 
	{
		System.out.println(elencoDipendenti[i].toString());
	}
			
	
	//guadagna di piu
		int maxStipendio=elencoDipendenti[0].stipendio();
		int posizionePiuRetribuito=0;
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if(elencoDipendenti[i].stipendio()>maxStipendio)
			{
				maxStipendio=elencoDipendenti[i].stipendio();
				posizionePiuRetribuito=i;
			}				
		}
		
		System.out.println("Il dipendente più retribuito è "+elencoDipendenti[posizionePiuRetribuito].toString());
		
	//piu' vecchio
		Dipendente vecchio=elencoDipendenti[0];
		int posizionePiuVecchio=0;
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if(vecchio.getDataNascita().compareData(elencoDipendenti[i].getDataNascita())==-1)
			{
				posizionePiuVecchio=i;
				vecchio=elencoDipendenti[i];
			}
		}
		System.out.println("Il dipendente meno giovane è "+vecchio.toString());

*/
