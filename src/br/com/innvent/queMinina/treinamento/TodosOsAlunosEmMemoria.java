package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

public class TodosOsAlunosEmMemoria implements TodosOsAlunos{

		private List<Aluno> alunos = new ArrayList<Aluno>();
		
		@Override
		public Aluno getAlunoPorNome(String nome) {
			for(Aluno aluno : this.turmas){
				if (turma.getNome().equals(nome)){
					return turma;
				}
			}
			return null;
		}
	
}
