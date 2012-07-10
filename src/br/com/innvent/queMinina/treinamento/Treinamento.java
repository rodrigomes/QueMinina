package br.com.innvent.queMinina.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.innvent.queMinina.instrutores.Instrutor;

public abstract class Treinamento {
	//Wrappers Integer = new Integer(10);
	// boxing
	// Integer x = 10;
	
	private boolean disponivelParaVenda;
	private String nome;
	private int cargaHoraria;
	private double preco;
	private List<String> preRequisitos;
	private TipoDeTrainamento tipo;
	private Instrutor instrutor;
	private double valorMatricula;
	
	public Treinamento(String nome, double preco, Instrutor instrutor){ //criado pronto pra uso
		this.preRequisitos = new ArrayList<String>();
		this.preco = preco;
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<String> getPreRequisitos() {
		return new ArrayList<String>(this.preRequisitos);
	}

	public void disponibilizarParaVenda() {
		// TODO Auto-generated method stub
		this.disponivelParaVenda = true;
	}

	public boolean estaDisponivelParaVenda() {
		// TODO Auto-generated method stub
		return this.disponivelParaVenda;
	}

	public void indisponibilizarParaVenda() {
		// TODO Auto-generated method stub
		this.disponivelParaVenda = false;
	}

	public void adicionarPreRequisito(String preRequisitos) {
		// TODO Auto-generated method stub
		this.preRequisitos.add(preRequisitos);
	}
	
	public void definirTipo(TipoDeTrainamento tipo){
		this.tipo = tipo;
	}
	
	public TipoDeTrainamento getTipoDeTreinamento(){
		return this.tipo;
	}
	
	public void definirInstrutor(Instrutor instrutor){
		this.instrutor = instrutor;
	}
	
	public Instrutor getInstrutor(){
		return this.instrutor;
	}
	
	/*
	public double getPreco(){
		if (this.tipo == TipoDeTrainamento.CURSO){
			return (this.instrutor.getValorHora() * this.cargaHoraria * 1.1);
		}else if (this.tipo == TipoDeTrainamento.WORKSHOP ){
			return (500 * 1.1);
		}else{
			return this.preco;
		}
	}*/
	public abstract double getPreco();
	
}
