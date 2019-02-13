/*
	# Java_Scuola

	Java_Scuola


	Algoritmo "Conto Corrente (CC) -2" composto da 2 classi
		{
			"UsaConto": Crea un nuovo conto corrente inizializzato a 3200 €;
			Chiede all'utente se desideri prelevare o versare danaro e preleva o versa la somma inserita dall'utente;
			Stampa il saldo finale.
		}
		{
			"ContoCorrente":
				- "saldo": Variabile che memorizza lo stato del conto;
				- "ContoCorrente": Costruttore della classe;
				- "versa": Metodo per il versamento di somme;
				- "preleva": Metodo per il prelievo di somme.
		}
*/

public class CC2
{
	public double saldo;
	public ContoCorrente ( double saldoIniziale )
	{
		saldo = saldoIniziale ;
	}
	public void versa ( double somma )
	{
		saldo += somma ;
	}
	public void preleva ( double somma )
	{
		saldo -= somma ;
	}
}