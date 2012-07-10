import junit.framework.Assert;

import org.junit.Test;


public class CalculadoraTests {

	@Test
	public void deveRetornarUmNumero20NaSomaDe10e10(){
		
			Calculadora c = new Calculadora();
			int valorDaSoma = c.somar(10, 10);
			Assert.assertEquals(20, valorDaSoma);
			
	}
		
	@Test
	public void deveRetornar4QuandoMultiplicar2e2(){
			
		Calculadora c = new Calculadora();
		Assert.assertEquals(4, c.multiplicar(2,2));
			
	}
	
	@Test
	public void deveRetornar10QuandoMuliplicar2e5(){
		Calculadora c = new Calculadora();
		Assert.assertEquals(10, c.multiplicar(2,5));
	}
}
