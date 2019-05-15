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
import java.util.*;
public class main
{
	public static void main(String[] args)
	{
		int i,cil;
		String targa;
		Scanner num=new Scanner(System.in);
		Pila p=new Pila();
		do
		{
			System.out.println(" 1. Inserisci \n 2. Estrai \n 3. Stampa \n 0. Esci \n \n \t Inserisci un numero: \t ");
			i=num.nextInt();
			switch(i)
			{
				case 1:
					System.out.println(" \n Inserisci la targa della vettura: \t ");
					targa=num.next();
					System.out.println(" \n Inserisci la cilindrata della vettura: \t ");
					cil=num.nextInt();
					p.push(targa,cil);
				break;
				case 2:
					System.out.println(" \n Eliminata la vettura con targa \t "+p.pop());
				break;
				case 3:
					System.out.println(" \n "+(p));
				break;
			}
		}
		while(i!=0); 
	}
}