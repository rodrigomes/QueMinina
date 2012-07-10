package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Turma {

	private String nome;
	private Calendar dataInicio, dataFim;
	private int quantidadeMaximaDeAlunos;
	private Treinamento treinamento;
	private List<Matricula> matriculas;
	
	
	public Turma(Treinamento treinamento, Calendar dataInicio, Calendar dataFim, String nome){
		this.dataFim = dataFim;
		this.dataInicio = dataInicio;
		this.treinamento = treinamento;
		this.matriculas = new ArrayList<Matricula>();
		this.nome = nome;
	}


	public boolean estaSobreposto(Turma outraTurma) {
		// TODO Auto-generated method stub
		return !(this.dataInicio.after(outraTurma.dataFim) || this.dataFim.before(outraTurma.dataInicio));
	}


	public int getQuantidadeMaximaDeAlunos() {
		return this.quantidadeMaximaDeAlunos;
		
	}
	
	public void definirQuantidadeMaximaDeAlunos(int i) {
		this.quantidadeMaximaDeAlunos = i;
		
	}
	
	public Matricula matricular(Aluno aluno){
		if (this.haVagas()){
			Matricula matricula = criarMatricula(aluno);
			return matricula;
		}else{
			throw new IllegalStateException("Quantidade maxima alcancada");
		}
	}


	private Matricula criarMatricula(Aluno aluno) {
		double valor = 0;
		//descobrir o valor a ser utilizado no treinamento
		valor = this.treinamento.getValorMatricula();
		Matricula matricula = new Matricula(aluno, this, valor);
		this.matriculas.add(matricula);
		return matricula;
	}
	
	private boolean haVagas(){
		return ((this.quantidadeDeMatriculas() < this.quantidadeMaximaDeAlunos) || (this.quantidadeMaximaDeAlunos == 0));
	}


	public int quantidadeDeMatriculas() {
		// TODO Auto-generated method stub
		return this.matriculas.size();
	}
	
	public String getNome(){
		return this.nome;
	}

}
