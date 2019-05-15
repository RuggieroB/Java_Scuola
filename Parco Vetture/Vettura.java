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
public class Vettura
{
	private String targa;
	private int cil;
	private Vettura next;
	public Vettura(String targa,int cil)
	{
		this.targa=targa;
		this.cil=cil;
		next=null;
	}
	public String getTarga()
	{
		return targa;
	}
	public int getCil()
	{
		return cil;
	}
	public Vettura getNext()
	{
		return next;
	}
	public void setNext(Vettura p)
	{
		next=p;
	}
}