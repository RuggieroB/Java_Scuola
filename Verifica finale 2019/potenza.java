/*

	# Java_Scuola

		Java_Scuola
					
	# Verifica finale 2019 - Prof.ssa F. Esposito Faraone
					
		Verifica finale 2019 - Prof.ssa F. Esposito Faraone
					
				
			-  Programma "Verifica finale 2019" - Prof.ssa F. Esposito Faraone - 2 Classi:
				{
					"potenza.java": Calcolo della potenza dati in input la base e l'esponente. La base può essere variata con il metodo "cambiabase()".
				}
				{
					"main.java": Main.
				}
				
*/

public class potenza
{
	private int base,esponente;
	public potenza(int base,int esponente)
	{
		this.base=base;
		this.esponente=esponente;
	}
	public int getBase()
	{
		return base;
	}
	public int getEsponente()
	{
		return esponente;
	}
	public long getPot()
	{
		return (long)Math.pow(base,esponente);
	}
}