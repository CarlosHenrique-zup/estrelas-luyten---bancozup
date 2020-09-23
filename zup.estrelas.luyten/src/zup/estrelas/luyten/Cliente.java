package zup.estrelas.luyten;

public class Cliente {

	private String numeroDeConta;
	private String agencia;
	private String telefone;
	private double saldoEmConta = 0;
	private double limiteDeCheque;
	private double limiteDeCredito;

	public Cliente(String numeroDeConta, String agencia, String telefone, double limiteDeCheque,
			double limiteDeCredito) {
		this.numeroDeConta = numeroDeConta;
		this.agencia = agencia;
		this.telefone = telefone;
		this.limiteDeCheque = limiteDeCheque;
		this.limiteDeCredito = limiteDeCredito;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldoEmConta() {
		return saldoEmConta;
	}

	public void setSaldoEmConta(double saldoEmConta) {
		this.saldoEmConta = saldoEmConta;
	}

	public double getLimiteDeCheque() {
		return limiteDeCheque;
	}

	public void setLimiteDeCheque(double limiteDeCheque) {
		this.limiteDeCheque = limiteDeCheque;
	}

	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}

	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}

	public String getNumeroDeConta() {
		return numeroDeConta;
	}

}
