package br.com.innvent.queMinina.treinamento;

import br.com.innvent.queMinina.instrutores.Instrutor;

public class Curso extends Treinamento{
	
	public Curso(String nome,double preco, Instrutor instrutor) {
		super(nome, preco, instrutor);
		// TODO Auto-generated constructor stub
	}

	public double getPreco(){
		return this.getInstrutor().getValorHora() * this.getCargaHoraria() * 1.1 ;
	}

}
