import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.innvent.queMinina.treinamento.Treinamento;


public class TreinamentoTests {
	
	
	private Treinamento treinamento;

	@Before
	public void setUp(){
		treinamento = new Treinamento();
	}
	
	@Test
	public void deveSerPossivelDisponibilizarUmTreinamentoParaVenda(){
		
		//treinamento.setDisponivelParaVenda(true);
		treinamento.disponibilizarParaVenda(); // tell, don´t ask, conceito explícito
		Assert.assertEquals(true,treinamento.estaDisponivelParaVenda());
	}
	//Command Query Separation // Betrand Meyer
	
	@Test
	public void deveSerPossivelIndisponibilizarTreinamentosParaVenda(){
		treinamento.disponibilizarParaVenda();
		treinamento.indisponibilizarParaVenda();
		Assert.assertEquals(false,  treinamento.estaDisponivelParaVenda());
	}
	
	@Test
	public void deveSerPossivelAdicionarPreRequisitosParaTreinamento(){
		// Conhecimentos basicos de OO
		
		treinamento.adicionarPreRequisito("Conhecimento de OO");
		treinamento.adicionarPreRequisito("Conhecimento uma Linguagem");
		Assert.assertEquals(2, treinamento.getPreRequisitos().size());
		
		/*//Tell dont ask
		ArrayList<String> preRequisitos = new ArrayList<String>();
		preRequisitos.add("Conhecimentos basicos de OO");
		preRequisitos.add("Conhecimentos basicos de uma linguagem de programacao");
		
		treinamento.setPreRequisitos(preRequisitos);
		List<String> preRequisitosEsperados = treinamento.getPreRequisitos();
		*/
		
	}
}
