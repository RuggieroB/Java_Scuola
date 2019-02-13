/*
	# Java_Scuola

	Java_Scuola


	Algoritmo "Conto Corrente (CC) - 1" composto da 2 classi
	{
		"UsaConto": Crea un nuovo conto corrente inizializzato a 1000 €;
		Versa 700 €;
		Fa 2 prelievi controllando il saldo:
			Prelievo 1: Preleva 200 €, se il saldo è maggiore di 200 €;
			Prelievo 2: Preleva 900 €, se il saldo è maggiore di 200 €.
	}
	{
		"ContoCorrente":
			- "saldo": Variabile che memorizza lo stato del conto;
			- "ContoCorrente": Costruttore della classe;
			- "versa": Metodo per il versamento di somme;
			- "preleva": Metodo per il prelievo di somme.
	}
*/

public class ContoCorrente
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