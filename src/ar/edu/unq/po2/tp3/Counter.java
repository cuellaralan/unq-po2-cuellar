package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> contador; 
	//ArrayList<Integer> contador
	public Counter() {
		super();
		this.contador = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getContador() {
		return contador;
	}

	public void setContador(ArrayList<Integer> contador) {
		this.contador = contador;
	}
	
	public void addNumber(int n)
	{
		this.contador.add(n);
	}
	
	public int getEvenOcurrences()
	{
		return (int) this.contador.stream()
                .filter(n -> n % 2 == 0)
                .count(); 
	}
	
	public int multiplos(int x, int y)
	{
		int retorno = -1;
		for (int i = 1000; i > 0 ; i--)
		{
			if(i%x == 0 && i%y == 0)
			{
				return i;
			}
			
		}
		return retorno;
	}
}