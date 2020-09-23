package zup.estrelas.luyten;

public class Gerente {
	
	private int numeroDePessoasF;
	private int numeroDePessoasJ;
	
	private int numeroDeClientesAtuais;
	
	public Gerente(int numeroDePessoasF, int numeroDePessoasJ) {
		this.numeroDePessoasF = numeroDePessoasF;
		this.numeroDePessoasJ = numeroDePessoasJ;
	}
	
//	public Cliente[] clientes = new Cliente[numeroDeClientesAtuais];
//	public PessoaFisica[] pessoaFisica = new PessoaFisica[numeroDePessoasF];
//	public PessoaJuridica[] pessoaJuridica = new PessoaJuridica[numeroDePessoasJ];
	public Cliente[] clientes = new Cliente[10];
	public PessoaFisica[] pessoaFisica = new PessoaFisica[5];
	public PessoaJuridica[] pessoaJuridica = new PessoaJuridica[5];

//	public boolean cadastrarNovoCliente(String numeroDeConta, String agencia, String telefone, double saldoEmConta,
//			double limiteDeCheque, double limiteDeCredito) {
//
//		Cliente clienteArmazenado = new Cliente(numeroDeConta, agencia, telefone, saldoEmConta, limiteDeCheque,
//				limiteDeCredito);
//
//		for (int i = 0; i < clientes.length; i++) {
//			if (clientes[i] == null) {
//				clientes[i] = clienteArmazenado;
//				numeroDeClientes++;
//				return true;
//			}
//		}
//		return false;
//	}

	public boolean cadastrarPessoaFisica(String cpf, String nome, int idade, String numeroDeConta, String agencia,
			String telefone, double limiteDeCheque, double limiteDeCredito) {

		PessoaFisica pessoaFisicaArmazenada = new PessoaFisica(cpf, nome, idade, numeroDeConta, agencia, telefone,
				limiteDeCheque, limiteDeCredito);

		for (int i = 0; i < pessoaFisica.length; i++) {
			if (pessoaFisica[i] == null) {
				pessoaFisica[i] = pessoaFisicaArmazenada;
				clientes[numeroDeClientesAtuais] = pessoaFisica[i];
				numeroDePessoasF++;
				numeroDeClientesAtuais++;
				return true;
			}
		}
		return false;
	}

	public boolean cadastrarPessoaJuridica(String cnpj, String[] nomeSocio, String razaoSocial, String nomeFantasia,
			String numeroDeConta, String agencia, String telefone, double limiteDeCheque, double limiteDeCredito) {
		
		PessoaJuridica pessoaJuridicaArmazenada = new PessoaJuridica(cnpj, nomeSocio, razaoSocial, nomeFantasia,
				numeroDeConta, agencia, telefone, limiteDeCheque, limiteDeCredito);

		for (int i = 0; i < pessoaJuridica.length; i++) {
			if (pessoaJuridica[i] == null) {
				pessoaJuridica[i] = pessoaJuridicaArmazenada;
				clientes[numeroDeClientesAtuais] = pessoaJuridica[i];
				numeroDePessoasJ++;
				numeroDeClientesAtuais++;
				return true;
			}
		}
		return false;
	}

	public boolean removerClientes(String numeroDeConta) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDeConta)) {
				clientes[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean aumentarLimiteCheque(String numeroDaConta, double adicionalLimiteCheque) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDaConta)) {
				clientes[i].setLimiteDeCheque(clientes[i].getLimiteDeCheque() + adicionalLimiteCheque);
				return true;
			}
		}
		return false;
	}

	public boolean diminuirLimiteCheque(String numeroDaConta, double adicionalLimiteCheque) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDaConta)) {
				clientes[i].setLimiteDeCheque(clientes[i].getLimiteDeCheque() - adicionalLimiteCheque);
				return true;
			}
		}
		return false;
	}

	public boolean adicionarSaldo(String numeroDaConta, double valorAdicionado) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDaConta)) {
				clientes[i].setSaldoEmConta(clientes[i].getSaldoEmConta() + valorAdicionado);
				return true;
			}
		}
		return false;
	}

	public boolean verificaSaldoDaConta(String numeroContaSaida, double valor) {
		double somaSaldoCheque;

		for (int i = 0; i < clientes.length; i++) {

			somaSaldoCheque = clientes[i].getSaldoEmConta() + clientes[i].getLimiteDeCheque();

			if (clientes[i].getNumeroDeConta().equals(numeroContaSaida) && clientes[i].getSaldoEmConta() >= valor) {
				clientes[i].setSaldoEmConta(clientes[i].getSaldoEmConta() - valor);
				break;
			}

			if (clientes[i].getNumeroDeConta().equals(numeroContaSaida) && somaSaldoCheque >= valor) {
				double novoValorDoCheque = (clientes[i].getLimiteDeCheque() - (valor - clientes[i].getSaldoEmConta()));

				clientes[i].setSaldoEmConta(0);
				clientes[i].setLimiteDeCheque(novoValorDoCheque);
				return true;
			}

		}
		return false;
	}

	public boolean fazerTransferencia(String numeroContaEntrada, String numeroContaSaida, double valor) {
		for (int i = 0; i < clientes.length; i++) {

			if (verificaSaldoDaConta(numeroContaSaida, valor)
					&& clientes[i].getNumeroDeConta().equals(numeroContaEntrada)) {
				clientes[i].setSaldoEmConta(clientes[i].getSaldoEmConta() + valor);
				return true;
			}
		}
		return false;
	}

	public boolean aumentarLimiteCartao(String numeroDaConta, double adicionalLimiteCartao) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDaConta)) {
				clientes[i].setLimiteDeCredito(clientes[i].getLimiteDeCredito() + adicionalLimiteCartao);
				return true;
			}
		}
		return false;
	}

	public boolean diminuirLimiteCartao(String numeroDaConta, double adicionalLimiteCartao) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNumeroDeConta().equals(numeroDaConta)) {
				clientes[i].setLimiteDeCredito(clientes[i].getLimiteDeCredito() - adicionalLimiteCartao);
				return true;
			}
		}
		return false;
	}
	
	public void imprimirCliente() {
		System.out.println("PASSEI AQUI");
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i] != null) {
				System.out.println("NÚMERO DA CONTA: "+clientes[i].getNumeroDeConta());
				System.out.println("SALDO: "+ clientes[i].getSaldoEmConta());
				System.out.println("CHEQUE ESPECIAL: "+ clientes[i].getLimiteDeCheque());
			}
			else {
				System.out.println("CLIENTE INVÁLIDO!");
			}
			
		}
	}

	public void setNumeroDePessoasF(int numeroDePessoasF) {
		this.numeroDePessoasF = numeroDePessoasF;
	}

	public void setNumeroDePessoasJ(int numeroDePessoasJ) {
		this.numeroDePessoasJ = numeroDePessoasJ;
	}

}
