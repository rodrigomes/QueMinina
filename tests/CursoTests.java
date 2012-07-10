import org.junit.Test;

import junit.framework.Assert;
import br.com.innvent.queMinina.instrutores.Instrutor;
import br.com.innvent.queMinina.treinamento.Curso;
import br.com.innvent.queMinina.treinamento.Treinamento;


public class CursoTests {

	@Test
	public void deveRetornar1100QuandoACagaHorariaFor10HorasEHoraDoInstrutorFor100reais(){
		
		Instrutor paulim = new Instrutor("Paulim",100);
		Treinamento cursoDeJava = new Curso("Curso de Java", 10, paulim);
		Assert.assertEquals(1100.0, cursoDeJava.getPreco());
		
	}
	
}
