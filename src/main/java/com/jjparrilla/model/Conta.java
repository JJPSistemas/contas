package com.jjparrilla.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Conta extends GenericModel{
	
	@Column(nullable = false)
	private String nomeConta;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataCriacao;
    
	@Column(nullable = false, precision = 6, scale = 2)
	protected double saldo;
	
	public Conta() {
		
	}

	public Conta(Long id, String nomeConta, Date dataCriacao, double saldo, boolean status) {
		super();
		this.nomeConta = nomeConta;
		this.dataCriacao = dataCriacao;
		this.saldo = saldo;
	}

	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	

}
