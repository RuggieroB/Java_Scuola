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