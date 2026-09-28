
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.*;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CounterTestCase 
{
	private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
@BeforeEach
	public void setUp() throws Exception 
	{
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

@Test
//cantidad de pares
	public void testEvenNumbers() 
	{
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
@Test
//multiplo existe
	public void testMultiploDe3y9()
	{
		int result = counter.multiplos(3, 9);
		assertEquals(result, 999);
	}


@Test
	public void testMayor4Pares()
	{
	 ArrayList<Integer> numeros = new ArrayList<Integer>();
	    numeros.add(5394128); // tiene 3 pares
	    numeros.add(2468);    // tiene 4 pares
	    numeros.add(13579);   // tiene 0 pares
	    int resultado = counter.mayorConPares(numeros);
	    assertEquals(resultado, 2468);
	}


}


