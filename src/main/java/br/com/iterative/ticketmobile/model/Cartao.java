package br.com.iterative.ticketmobile.model;

import java.util.Date;

public class Cartao {

	private String bin;
	private String numero;
	private String apelido;
	private double saldo;
	private Date proximoDeposito;

	public Cartao() {

	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getProximoDeposito() {
		return proximoDeposito;
	}

	public void setProximoDeposito(Date proximoDeposito) {
		this.proximoDeposito = proximoDeposito;
	}

}