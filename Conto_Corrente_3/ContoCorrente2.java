/*
# Java_Scuola


Java_Scuola




- Algoritmo "Conto Corrente (CC) - "3" composto da 2 classi
	{
		"ContoCorrente1": Crea un nuovo conto corrente inizializzato a 3200 €;
		Chiede all'utente se desideri prelevare o versare danaro e preleva o versa la somma inserita dall'utente;
		Stampa il saldo finale;
		Stampa il numero di conto corrente.
	}
	{
		"ContoCorrente2":
			- "saldo": Variabile che memorizza lo stato del conto;
			- "ContoCorrente": Costruttore della classe;
			- "versa": Metodo per il versamento di somme;
			- "preleva": Metodo per il prelievo di somme.
	}
*/

public class ContoCorrente2
{
	private double saldo;
	private int numero;
	public ContoCorrente2 ( double saldoIniziale , int numeroConto )
	{
		saldo = saldoIniziale ;
		numero = numeroConto;
	}
	public void versa ( double somma )
	{
		saldo += somma ;
	}
	public void preleva ( double somma )
	{
		saldo -= somma ;
	}
	public double OttieniSaldo()
		{
			return saldo;
		}
	public int OttieniNumeroConto()
		{
			return numero;
		}
}