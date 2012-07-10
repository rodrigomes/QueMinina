package br.com.innvent.treinamentos.aplicacao;

import br.com.innvent.queMinina.treinamento.TodasAsTurmas;
import br.com.innvent.queMinina.treinamento.Turma;

public class MatricularAlunos {
	
	private String nomeDoAluno;
	private String nomeDaTurma;
	private TodasAsTurmas todasAsTurmas;
	private TodosOsAlunos todosOsAlunosPorNome;
	
	public  MatricularAlunos (String nomeDoAluno, String nomeDaTurma){
		this.nomeDoAluno = nomeDoAluno;
		this.nomeDaTurma = nomeDaTurma;
	}
	
	public void execute(){
		Turma turma = this.todasAsTurmas.getTurmaPorNome(this.nomeDaTurma);
		Aluno aluno = this.todosOsAlunosPorNome
		Matricula matricula = turma.matricular(aluno);
		//todasAsMatricuals.add(matricula);
	}
}
