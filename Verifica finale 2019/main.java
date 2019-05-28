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

import java.util.*;

public class main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int b,e,n_b;
		long p;
		System.out.print("\nInserire la base della potenza:\t");
		b=in.nextInt();
		System.out.print("\nInserire l'esponente della potenza:\t");
		e=in.nextInt();
		potenza p1=new potenza(b,e);
		p=p1.getPot();
		System.out.print("\n\nL'elevazione a potenza ha dato come risultato:\t"+p+("\n\n"));
	}
}