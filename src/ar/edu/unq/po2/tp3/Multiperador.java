package ar.edu.unq.po2.tp3;
import java.util.ArrayList;

public class Multiperador 
{
	private ArrayList<Integer> operandos;

	public Multiperador() {
		super();
		this.operandos = new ArrayList<Integer>();
	}
	
	public int sumarTodos()
	{
		return (int) this.operandos.stream()
				.mapToInt(n -> n)
				.sum();
				
	}
	public int restarTodos()
	{
		return (int) this.operandos.stream()
				.mapToInt(n -> n)
				.reduce(0, (a, b)-> a - b);
		
	}
	
}
