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

public class cliente
{
	private String nome,sesso;
	private int eta;
	public cliente(String nome, String sesso, int eta)	
	{
		nome=this.nome;
		sesso=this.sesso;
		eta=this.eta;
	}
	public String ret_nome()
	{
		return nome;
	}
}
