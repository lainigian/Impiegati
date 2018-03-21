
public class Azienda 
{
	private Dipendente[] elencoDipendenti;
	private final int MAX_NUM_DIPENDENTI=1000;
	
	public Azienda()
	{
		elencoDipendenti =new Dipendente[MAX_NUM_DIPENDENTI];	
	}

	public void setDipendente(Dipendente d)
	{
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]==null)
			{
				elencoDipendenti[i]=new Dipendente(d);
				return;
			}
				
		}
	}
		
	public Dipendente getDipendente (int matricola)
	{
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]!=null)
			{
				if (elencoDipendenti[i].getMatricola()==matricola)
					return elencoDipendenti[i];
			}
		}
		return null;	//se non viene individuato il dipendente cercato
	}
	
	public Dipendente[] dipendentiStipendio(int stipendio)
	{
		Dipendente[] elenco;
		int numeroDipendentiStipendio=0;
		
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]!=null)
			{
				if (elencoDipendenti[i].stipendio()==stipendio)
					numeroDipendentiStipendio++;
			}
				
		}
		
		elenco=new Dipendente[numeroDipendentiStipendio];
		int c=0;
		for (int i = 0; i < MAX_NUM_DIPENDENTI; i++) 
		{
			if (elencoDipendenti[i]!=null)
			{
				if (elencoDipendenti[i].stipendio()==stipendio)
				{
					elenco[c]=new Dipendente(elencoDipendenti[i]);
					c++;
				}
			}		
		}
		
		return elenco;
	}
	
	public Dipendente getPiuRetribuito()
	{
		int maxStipendio=elencoDipendenti[0].stipendio();
		int posizionePiuRetribuito=0;
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if(elencoDipendenti[i]!=null)
			{
				if(elencoDipendenti[i].stipendio()>maxStipendio)
				{
					maxStipendio=elencoDipendenti[i].stipendio();
					posizionePiuRetribuito=i;
				}	
			}					
		}
		return new Dipendente(elencoDipendenti[posizionePiuRetribuito]);
	}
	
	public Dipendente getPiuGiovane()
	{
		Dipendente giovane=elencoDipendenti[0];
		int posizionePiuGiovane=0;
		
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i]!=null)
			{
				if(giovane.getDataNascita().compareData(elencoDipendenti[i].getDataNascita())==1)
				{
					posizionePiuGiovane=i;
					giovane=elencoDipendenti[i];
				}
			}
		}
		return new Dipendente(giovane);
	}
	
	public String toString()
	{
		String risultato="";
		for (int i = 0; i < elencoDipendenti.length; i++) 
		{
			if (elencoDipendenti[i]!=null)
				risultato+=elencoDipendenti[i].toString()+"\n";
		}
		
		return risultato;
	}
	
}
