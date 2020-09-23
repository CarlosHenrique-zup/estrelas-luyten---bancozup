package br.com.zup.estrelas.luyten;

public class Cliente {

	private String conta;
	private String agencia;
	private String telefone;
	private double saldo = 0;
	private double limiteChequeEspecial;
	private double limiteCartaoCredito;

	public Cliente(String conta, String agencia, String telefone, double limiteChequeEspecial,
			double limiteCartaoCredito) {

		this.conta = conta;
		this.agencia = agencia;
		this.telefone = telefone;
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.limiteCartaoCredito = limiteCartaoCredito;
	}

	public String getConta() {
		return this.conta;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getLimiteCartaoCredito() {
		return this.limiteCartaoCredito;
	}

	public void setLimiteCartaoCredito(double limiteCartaoCredito) {
		this.limiteCartaoCredito = limiteCartaoCredito;
	}
}