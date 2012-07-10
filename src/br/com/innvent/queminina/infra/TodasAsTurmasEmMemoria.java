package br.com.innvent.queminina.infra;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.treinamento.TodasAsTurmas;
import br.com.innvent.queMinina.treinamento.Turma;

public class TodasAsTurmasEmMemoria implements TodasAsTurmas {

	private List<Turma> turmas = new ArrayList<Turma>();
	
	@Override
	public Turma getTurmaPorNome(String nome) {
		for(Turma turma : this.turmas){
			if (turma.getNome().equals(nome)){
				return turma;
			}
		}
		return null;
	}
	
}
