package com.jjparrilla.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Entity
public class Juridica extends GenericModel {
	
	@Column(length = 19, nullable = false)
	private String cnpj;
	
	@Column(length = 80, nullable = false)
	private String razaoSocial;
	
	@Column(length = 80, nullable = false)
	private String nomeFantasia;
	
	@Column(nullable = false, precision = 6, scale = 2)
	protected double saldo;	
	
	private boolean status;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Conta conta;
	
	
	public Juridica() {
		
	}


	public Juridica(Long idPessoaJuridica, String cnpj, String razaoSocial, String nomeFantasia, double saldo,
			boolean status, Conta conta) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.saldo = saldo;
		this.status = status;
		this.conta = conta;
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
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
	

}
