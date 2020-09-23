package br.com.zup.estrelas.luyten;

public class Gerente {

	private int maxClientes = 100;
	private Cliente[] clientes = new Cliente[maxClientes];
	private PessoaFisica[] pessoasFisicas = new PessoaFisica[maxClientes];
	private PessoaJuridica[] pessoasJuridicas = new PessoaJuridica[maxClientes];

	public boolean adicionaClientePessoaFisica(String conta, String agencia, String telefone,
			double limiteChequeEspecial, double limiteCartaoCredito, String cpf, String nome, int idade) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i] == null) {

				clientes[i] = new PessoaFisica(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito, cpf,
						nome, idade);

				pessoasFisicas[i] = new PessoaFisica(conta, agencia, telefone, limiteChequeEspecial,
						limiteCartaoCredito, cpf, nome, idade);
				return true;
			}
		}
		return false;
	}

	public boolean adicionaClientePessoaJuridica(String conta, String agencia, String telefone,
			double limiteChequeEspecial, double limiteCartaoCredito, String cnpj, String[] socios, String razaoSocial,
			String nomeFantasia) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i] == null) {

				clientes[i] = new PessoaJuridica(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito,
						cnpj, socios, razaoSocial, nomeFantasia);

				pessoasJuridicas[i] = new PessoaJuridica(conta, agencia, telefone, limiteChequeEspecial,
						limiteCartaoCredito, cnpj, socios, razaoSocial, nomeFantasia);
				return true;
			}
		}
		return false;
	}

	public boolean removeCliente(String conta) {

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getConta().equals(conta)) {
				clientes[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean aumentaLimiteChequeEspecial(String conta, double limiteAdicional) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].getConta().equals(conta)) {
				clientes[i].setLimiteChequeEspecial(clientes[i].getLimiteChequeEspecial() + limiteAdicional);
				return true;
			}
		}
		return false;
	}

	public boolean diminuiLimiteChequeEspecial(String conta, double limiteRecuado) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].getConta().equals(conta)) {
				clientes[i].setLimiteChequeEspecial(clientes[i].getLimiteChequeEspecial() - limiteRecuado);
				return true;
			}
		}
		return false;
	}

	public boolean aumentaLimiteCartaoCredito(String conta, double limiteAdicional) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].getConta().equals(conta)) {
				clientes[i].setLimiteCartaoCredito(clientes[i].getLimiteCartaoCredito() + limiteAdicional);
				return true;
			}
		}
		return false;
	}

	public boolean diminuiLimiteCartaoCredito(String conta, double limiteRecuado) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].getConta().equals(conta)) {
				clientes[i].setLimiteCartaoCredito(clientes[i].getLimiteCartaoCredito() - limiteRecuado);
				return true;
			}
		}
		return false;
	}

	public boolean adicionaSaldoEmConta(String conta, double saldoAdicional) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i].getConta().equals(conta)) {
				clientes[i].setSaldo(clientes[i].getSaldo() + saldoAdicional);
				return true;
			}
		}
		return false;
	}

	public boolean saldoEmContaSuficiente(String contaDeSaida, double valorDeSaida) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i] != null) {

				if (clientes[i].getConta().equals(contaDeSaida) && clientes[i].getSaldo() >= valorDeSaida) {
					clientes[i].setSaldo(clientes[i].getSaldo() - valorDeSaida);
					return true;
				}
			}
		}
		return false;
	}

	public boolean somaSaldoChequeEspecialSuficiente(String contaDeSaida, double valorDeSaida) {

		double somaSaldoChequeEspecial;

		for (int i = 0; i < clientes.length; i++) {

			somaSaldoChequeEspecial = clientes[i].getSaldo() + clientes[i].getLimiteChequeEspecial();

			if (clientes[i] != null) {

				if (clientes[i].getConta().equals(contaDeSaida) && somaSaldoChequeEspecial >= valorDeSaida) {
					clientes[i].setSaldo(clientes[i].getSaldo() - valorDeSaida);
					return true;
				}
			}
		}
		return false;
	}

	public boolean transfereEntreContas(String contaDeSaida, double valorDeSaida, String contaDeEntrada) {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i] != null) {

				if (clientes[i].getConta().equals(contaDeEntrada) && (saldoEmContaSuficiente(contaDeSaida, valorDeSaida)
						|| somaSaldoChequeEspecialSuficiente(contaDeSaida, valorDeSaida))) {

					clientes[i].setSaldo(clientes[i].getSaldo() + valorDeSaida);
					return true;
				}
			}
		}
		return false;
	}

	public void imprimeClientes() {

		for (int i = 0; i < clientes.length; i++) {

			if (clientes[i] != null) {
				System.out.printf("\n| AGÊNCIA: %s |\n| CONTA: %s |\n| SALDO: %s |\n| LIMITE CHEQUE ESPECIAL: %.2f |\n",
						clientes[i].getAgencia(), clientes[i].getConta(), clientes[i].getSaldo(),
						clientes[i].getLimiteChequeEspecial());
			}
		}
	}

	public void imprimeClientesPessoaFisica() {

		for (int i = 0; i < pessoasFisicas.length; i++) {

			if (pessoasFisicas[i] != null) {
				System.out.printf("\n| AGÊNCIA: %s |\n| CONTA: %s |\n| NOME: %s |\n| CPF: %s |\n| IDADE: %s |\n",
						pessoasFisicas[i].getAgencia(), pessoasFisicas[i].getConta(), pessoasFisicas[i].getNome(),
						pessoasFisicas[i].getCpf(), pessoasFisicas[i].getIdade());
			}
		}
	}

	public void imprimeClientesPessoaJuridica() {

		for (int i = 0; i < pessoasJuridicas.length; i++) {

			if (pessoasJuridicas[i] != null) {

				System.out.printf(
						"\n| AGÊNCIA: %s |\n| CONTA: %s |\n| RAZÃO SOCIAL: %s |\n| NOME FANTASIA: %s |\n| CNPJ: %s |\n",
						pessoasJuridicas[i].getAgencia(), pessoasJuridicas[i].getConta(),
						pessoasJuridicas[i].getRazaoSocial(), pessoasJuridicas[i].getNomeFantasia(),
						pessoasJuridicas[i].getCnpj());
			}
		}
	}
}