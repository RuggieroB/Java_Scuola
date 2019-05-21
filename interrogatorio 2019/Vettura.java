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

public class Vettura
{
	private String marca,modello,targa;
	private int cil,serb;
	private double res;
	private Vettura next;
	public Vettura(String marca,String modello,String targa,int cil,int serb,double res)
	{
		this.marca=marca;
		this.modello=modello;
		this.targa=targa;
		this.cil=cil;
		this.serb=serb;
		this.res=res;
		next=null;
	}
	public String getMarca()
	{
		return marca;
	}
	public String getModello()
	{
		return modello;
	}
	public String getTarga()
	{
		return targa;
	}
	public int getCil()
	{
		return cil;
	}
	public int getSerb()
	{
		return serb;
	}
	public double getRes()
	{
		return res;
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