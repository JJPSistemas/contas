package com.jjparrilla.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name="fisica")
public class Fisica extends GenericModel {
	
	@Column(length = 14, nullable = false)
	private String cpf;
	
	@Column(length = 50, nullable = false)
	private String nomeCompleto;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(nullable = false, precision = 6, scale = 2)
    private double saldo;	
	
	private boolean status;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Conta conta;
	
	public Fisica() {
		
	}

	public Fisica(Long idPessoaFisica, String cpf, String nomeCompleto, Date dataNascimento, double saldo,
			boolean status, Conta conta) {
		super();
		this.cpf = cpf;
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.saldo = saldo;
		this.status = status;
		this.conta = conta;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Conta getConta() {
		return conta;
	}


	public void setConta(Conta conta) {
		this.conta = conta;
	}


	public String status() {
	    if (this.status == true) {
	        String msg = "Id da conta: " + this.conta + "\nStatus da conta: " + this.status;
	        return msg;
	    } else {
	        String msg = "Conta não encontrada!";
	        return msg;
	    }
	}
	
	public String abrirConta() {
	    if (this.status == false) {
	        this.status = true;
	        String msg = "Conta criada com Sucesso!";
	        return msg;
	    } else {
	        String msg = "Conta já ativa.";
	        return msg;
	    }
	}
	
	public String encerrarConta() {
	    if (this.status == true && this.saldo == 0) {
	        this.status = false;
	        String msg = "Conta encerrada com Sucesso!";
	        return msg;
	    } else {
	        String msg = "Conta inexistente ou com saldo positivo/devedor";
	        return msg;
	    }
	}
	
	public String depositar(double deposito) {
	    if (this.status = true)
	    {
	        this.saldo +=  deposito;
	        String msg = "Deposito efetuado com sucesso!";
	        return msg;
	    }else {
	        String msg = "Conta inexistente!";
	        return msg;
	    }
	}
	
	public double verificarsaldo() {
		   return this.getSaldo();
	}
	
	public String sacar(double saque) {
	     if (this.status = true)
	    {
	        if(this.saldo >= saque){            
	        this.saldo = this.saldo - saque;
	        String msg = "Saque efetuado com sucesso!";
	        return msg;
	        }
	        else{
	            String msg = "Saldo insuficiente!";
	            return msg;
	        }
	    }else {
	        String msg = "Conta inexistente!";
	        return msg;
	    }
	}
	
	public void transfere(Conta favorecido, double valor) {
		if (this.status == true)
		{
			if(this.saldo >= valor) {
		    this.saldo = this.saldo - valor;
		    favorecido.saldo = favorecido.saldo + valor;
			}
			else{
	            System.out.println("Saldo insuficiente!");
	        }
		}
	}
	

}
