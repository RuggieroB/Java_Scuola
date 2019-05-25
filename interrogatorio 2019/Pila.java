/*

	# Java_Scuola

	Java_Scuola
	
	# Interrogtorio 2019
	
	Interrogatorio 2019


			- Programma "Interrogtorio 2019" - 3 Classi:
				{
					"Pila.java": Gestione parco vetture:
				}
				{
					"Vettura.java": Parco Vetture.
				}
				{
					"main.java": Main.
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
	public void push(String marca,String modello, String targa,int cil,int imm,int serb,double res,long km)
	{
		Vettura a=new Vettura(marca,modello,targa,cil,imm,serb,res,km);
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
