/*
# Java_Scuola


Java_Scuola




- Algoritmo "Ordinamento": Dato un array di int, ordinare gli elementi ed inserirli un un secondo array.
*/

import java.util.*;
public class Ordinamento
{
	public static void main(String[] args)
	{
		int N,i,j,temp,min;
		Scanner in = new Scanner(System.in);
		do
		{
			System.out.println("Dichiarare la dimensione dell'array: \t ");
			N = in.nextInt();
			}
			while ( N <= 0 || N > 100 );
		int [] A1 = new int [N];
		int [] A2 = new int [N];
		System.out.println(" \n Inserire gli elementi dell'array: \n ");
		for
		( i = 0; i < N; i++ )
		{
			A1 [i] = in.nextInt();
		}
		System.out.println(" \n Gli elementi inseriti sono: \n ");
		for
		( i = 0; i < N; i++ )
		{
			System.out.println(" "+A1 [i]);
		}
		for
		( i = 0; i < N - 1; i++ )
		{
			min = i;
			for ( j = i + 1; j < N; j++ )
			{
				if
				( A1 [i] > A1 [j] )
				{
					min = j;
					temp = A1 [min];
					A1 [min] = A1 [i];
					A1 [i] = temp;
				}
			}
		}
		for
		( i = 0; i < N; i++ )
		{
			A2 [i] = A1 [i];
		}
		System.out.println("  \n  \n  Gli elementi ordinati in ordine crescente sono: \t ");
		for
		( i = 0; i < N; i++ )
		{
			System.out.println(" "+A2 [i]);
		}
	}
}