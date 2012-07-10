import java.util.Calendar;

import junit.framework.Assert;

import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Treinamento;
import br.com.innvent.queMinina.treinamento.Turma;

import org.junit.Before;
import org.junit.Test;


public class TurmaTests {

	private Turma turma;
	
	private Calendar dataInicio = Calendar.getInstance();
	private Calendar dataFim = Calendar.getInstance();
	private Treinamento cursoDeJava = new Treinamento();
		
		@Before
		public void setUp(){
			dataInicio.set(Calendar.DAY_OF_MONTH,1);
			dataInicio.set(Calendar.MONTH,1);
			dataInicio.set(Calendar.YEAR,2012);
			
			dataFim.set(Calendar.DAY_OF_MONTH,10);
			dataFim.set(Calendar.MONTH,1);
			dataFim.set(Calendar.YEAR,2012);
			
			cursoDeJava.setNome("Curso Java");
			//turma = new Turma();
		}
		
		@Test
		public void deveSerPossivelDefinirUmaQuantidadeMaximaDeAlunos(){
			Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
			turma.definirQuantidadeMaximaDeAlunos(10);
			Assert.assertEquals(10, turma.getQuantidadeMaximaDeAlunos());
		}
		
		@Test
		public void devePoderCriarTurma(){			
			Turma turma = new Turma(cursoDeJava,dataInicio,dataFim);
			//turma = null;
			Assert.assertNotNull(turma);
		}
		
		@Test
		public void naoDeveSerPossivelSobreporTurmas(){
			Turma primeiraTurma = new Turma(cursoDeJava, dataInicio, dataFim);
			Turma outraTurma = new Turma(cursoDeJava, dataInicio, dataFim);
			Assert.assertTrue(primeiraTurma.estaSobreposto(outraTurma));
		}
		
		@Test
		public void deveSerPossivelMatricularAlunoNaTurma(){
			Aluno jose = new Aluno("jose", "22298437403");
			Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
			turma.matricular(jose);
			Assert.assertEquals(1,turma.quantidadeDeMatriculas());
			
		}

		@Test(expected=IllegalStateException.class)
		public void naoDeveSerPossivelMatricularUmaAlunoCasaAQuantidadeMaximaSejaUltrapassada(){
			Aluno jose = new Aluno("jose", "22298437403");
			Aluno paulin = new Aluno("paulin", "23298437403");
			Aluno maria = new Aluno("maria", "22254437403");
			Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
			turma.definirQuantidadeMaximaDeAlunos(2);
			turma.matricular(jose);
			turma.matricular(paulin);
			turma.matricular(maria);
		}
		
		@Test
		public void naoDeveChecarQuantidadeMaximaSeEstaNaoForDefinida(){
			Aluno jose = new Aluno("jose", "22298437403");
			Aluno paulin = new Aluno("paulin", "23298437403");
			Aluno maria = new Aluno("maria", "22254437403");
			Turma turma = new Turma(cursoDeJava, dataInicio, dataFim);
			turma.matricular(jose);
			turma.matricular(paulin);
			turma.matricular(maria);
		}
		
		@Test
		public void devePoderColocarInicio(){
		}
		
		@Test
		public void devePodeColocarFim(){
		}
		
		@Test
		public void deveAtribuirTreinamento(){
		}
		

}
