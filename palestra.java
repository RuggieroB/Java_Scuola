/*
# Java_Scuola

Java_Scuola


- Programma "palestra": Calcolo costo abbonamento in base a sesso ed età del cliente.
*/
import java.util.*;
public class palestra
{
	private String nome;
	private char sesso;
	private int eta;
	public palestra(String nome, char sesso, int eta)	
	{
		nome=this.nome;
		sesso=this.sesso;
		eta=this.eta;
	}
	public String ret_nome()
	{
		return nome;
	}
	public static void main ( String [] args )
	{
		Scanner in=new Scanner(System.in);
		String nome;
		char sesso;
		int eta,c1=10;
		double c2=18.5;
		System.out.print("Inserire nome e cognome del cliente:\t");
		nome=in.nextLine();
		do{
			System.out.print("Inserire il sesso del cliente (insrerire \"m\" o \"M\" per il sesso maschile; inserire \"f\" o \"F\" per il sesso femminile)\t");
			sesso=in.next().charAt(0);
		}while(sesso!='m'&&sesso!='M'||sesso!='f'&&sesso!='F');
		System.out.print("Inserire l'età del cliente:\t");
		eta=in.nextInt();
		palestra client=new palestra(nome,sesso,eta);
		if(sesso=='m'||sesso=='M'){
			if(eta<=10||eta>75){
				System.out.println("\n"+client.ret_nome()+(": Abbonamento gratuito\n"));
			}
			else if((eta>=11&&eta<=64)||(eta>=65&&eta<=75)){
				System.out.println("\n"+client.ret_nome()+(": Costo abbonamento=\t"+c1));
			}
		}
		
	}
}
