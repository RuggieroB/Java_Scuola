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

import java.util.*;
public class main
{
	public static void main(String[] args)
	{
		int i,cil,serb;
		double res,rif;
		String marca,modello,targa;
		Scanner num=new Scanner(System.in);
		Pila p=new Pila();
		do
		{
			System.out.println(" \n 1. Inserisci \n 2. Estrai \n 3. Stampa \n 0. Esci \n \n \t Inserisci un numero: \t ");
			i=num.nextInt();
			switch(i)
			{
				case 1:
					System.out.println(" \n Inserisci la marca della vettura: \t ");
					marca=num.nextLine();
					marca=num.nextLine();
					System.out.println(" \n Inserisci il modello della vettura: \t ");
					modello=num.nextLine();
					System.out.println(" \n Inserisci la targa della vettura: \t ");
					targa=num.next();
					System.out.println(" \n Inserisci la cilindrata della vettura: \t ");
					cil=num.nextInt();
					System.out.println(" \n Inserisci la capacità del serbatoio carburante: \t ");
					serb=num.nextInt();
					System.out.println(" \n Inserisci la capacità residua del serbatoio carburante: \t ");
					res=num.nextDouble();
					p.push(marca,modello,targa,cil,serb,res);
					rif=((double)serb/100.0)*5.0;
					if(res<=rif)
					{
						System.out.println(" \n La capacità residua del serbatoio è inferiore al 5%: Rifornire la vettura! \n ");
					} /* NO 'else' FOR THIS 'if'! */
				break;
				case 2:
					System.out.println(" \n Eliminata vettura con targa \t "+p.pop());
				break;
				case 3:
					System.out.println(" \n "+(p));
				break;
			}
		}
		while(i!=0); 
	}
}