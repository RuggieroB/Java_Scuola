/*
# Java_Scuola

Java_Scuola


- Programma "palestra" - Una directory, una classe ed un main":
	{
		"cliente.java": Dati cliente.
	}
	{
		"main": Calcolo costo abbonamento in base a sesso ed età del cliente.
	}

*/
import java.util.*;
//class palestra
{
	public static void main ( String [] args )
	{
		Scanner in=new Scanner(System.in);
		String nome,sesso;
		int eta,c1=10;
		double c2=18.5;
		System.out.print("Inserire nome e cognome del cliente:\t");
		nome=in.nextLine();
		do
		{
			System.out.print("Inserire il sesso del cliente (insrerire \"m\" o \"M\" per il sesso maschile; inserire \"f\" o \"F\" per il sesso femminile)\t");
			sesso=in.next();
		}
		while(sesso=='m'||sesso=='M'||sesso=='f'||sesso=='F');
		System.out.print("Inserire l'età del cliente:\t");
		eta=in.nextInt();
		cliente client=new cliente(nome,sesso,eta);
		if(sesso=='m'||sesso=='M')
		{
			if(eta<=10)||eta>75)
			{
				System.out.println("\n"+nome.ret_nome()+(": Abbonamento gratuito\n");
			}
		}
		else
		{
		}
	}
//}
	