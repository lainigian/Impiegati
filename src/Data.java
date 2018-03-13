
public class Data 
{
	//Attributi
	private int giorno;
	private int mese;
	private int anno;
	
	public Data(int giorno, int mese, int anno)
	{
		setGiorno(giorno);
		setMese(mese);
		setAnno(anno);
	}
	
	public Data (Data data)
	{
		setGiorno(data.getGiorno());
		setMese(data.getMese());
		setAnno(data.getAnno());
	}
	
	public Data()
	{
		setGiorno(0);
		setMese(0);
		setAnno(0);
	}
	
	//getter e setter
	public int getGiorno() 
	{
		return giorno;
	}
	public void setGiorno(int giorno) 
	{
		this.giorno=1;
		if (giorno>1 && giorno<=31)
		this.giorno = giorno;
	}
	public int getMese() 
	{
		return mese;
	}
	public void setMese(int mese) 
	{
		this.mese=1;
		if (mese>1 && mese<=12)
			this.mese = mese;
	}
	public int getAnno() 
	{			
		return anno;
	}
	public void setAnno(int anno) 
	{
		this.anno=1900;
		if (anno>1900 && anno<2500)
			this.anno=anno;
		this.anno = anno;
	}
	
	public String toString()
	{
		return (getGiorno()+"\\"+getMese()+"\\"+getAnno());
	}
	
	public int compareData(Data d)
	{
		if (getAnno()<d.getAnno())
			return 1;
		else 
		{
			if (getAnno()==d.getAnno())
			{
				if (getMese()<d.getMese())
					return 1;
				else
				{
					if (getMese()==d.getMese())
					{
						if (getGiorno()<d.getGiorno())
							return 1;
						else if (getGiorno()==d.getGiorno())
							return 0;
						else
							return -1;
					}
					return -1;
				}
			}
			else
				return -1;
		}
	}
	
}
