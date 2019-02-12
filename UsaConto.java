/*
	# Java_Scuola

	Java_Scuola


	Algoritmo "Ordinamento": Dato un array di int, ordinare gli elementi ed inserirli un un secondo array.


	Algoritmo composto da 2 classi
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

public class UsaConto
{
	public static void main ( String [] args )
	{
		ContoCorrente cc = new ContoCorrente (1000);
		cc . versa (700);
		if
		( cc . saldo >200 ) 
		{
			cc . preleva (200);
		}
		if
		( cc . saldo >200 )
		{
			cc . preleva (900);
		}
		System . out . println ( " Saldo finale : " + cc . saldo );
	}
}