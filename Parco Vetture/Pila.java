/*
# Java_Scuola

Java_Scuola


- Programma "Parco Vetture" - 2 Classi:
	{
		"Pila.java": Gestione parco vetture:
	}
	{
		"Vettura.java": Parco Vetture.
	}
*/
public class Pila
{
	private Vettura first;
	private int nnodi;
	public Pila()
	{
		nnodi=0;
	}
	public void push(String targa,int cil)
	{
		Vettura a=new Vettura(targa,cil);
		if(nnodi==0)
		{
			first=a;
			nnodi++;
		}
		else
		{
			a.setNext(first);
			first=a;
			nnodi++;
		}
	}
	public String pop()
	{
		Vettura p;
		if(nnodi==0)
		{
			return " Lista vuota ";
		}
		p=first;
		first=p.getNext();
		nnodi--;
		return p.getTarga();
	}
	public String toString()
	{
		String s="";
		Vettura p;
		p=first;
		if(p==null)
		{
			s=" Non ci sono vetture disponibili \n ";
		}
		else
		{
			while(p!=null)
			{
				s=s+p.getTarga()+" \t "+p.getCil()+" \n ";
				p=p.getNext();
			}
		}
		return s;
	}
}
