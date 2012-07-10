import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.innvent.queMinina.treinamento.Aluno;
import br.com.innvent.queMinina.treinamento.Matricula;
import br.com.innvent.queMinina.treinamento.Treinamento;
import br.com.innvent.queMinina.treinamento.Turma;


public class MatriculaTests {

	
	@Test
	public void deveSerPossivelCriarUmaMatriculaDadoUmAlunoETurma(){
		Treinamento cursoDeJava =  new Treinamento();
		Aluno jose = new Aluno("jose", "243042");
		Turma turma1 = new Turma(cursoDeJava, Calendar.getInstance(), Calendar.getInstance());
		Matricula matricula = new Matricula(jose,turma1,1000);
		//Matricula matricula = null;
		Assert.assertNotNull(matricula);
	}
	
}
