package zup.estrelas.luyten;

import java.util.Scanner;

public class ProgramaPrincipal {

//	public static int numeroDePessoasF;
//	public static int numeroDePessoasJ;
	
	
//	public static void imprimeMenuQtdMenu(Scanner sc) {
//		System.out.println("===================================");
//		System.out.println("            |GERENTE|");
//		System.out.println("===================================");
//		System.out.println("GERENTE, DIGITE ");
//		System.out.println("QUANTIDADE DE PESSOAS FÍSICAS: ");
//		numeroDePessoasF = sc.nextInt();
//		System.out.println("QUANTIDADE DE PESSOAS JURIDICAS: ");
//		numeroDePessoasJ = sc.nextInt();
//		
//	}
//	
	private static Gerente gerente = new Gerente(5, 5);
		
	public static void imprimeMenuPrincipal() {
		System.out.println("===================================");
		System.out.println("            |BANCO-ZUP|");
		System.out.println("===================================");
		System.out.println("      [BY: ESTRELAS-LYUTEN]");
		System.out.println("===================================");
		System.out.println("[1] - CADASTRAR CLIENTE: ");
		System.out.println("[2] - AUMENTAR LIMITE: ");
		System.out.println("[3] - DIMINUIR LIMITE:");
		System.out.println("[4] - TRANSFERIR ENTRE CLIENTES: ");
		System.out.println("[5] - ADICIONAR SALDO: ");
		System.out.println("[6] - REMOVER CLIENTE: ");
		System.out.println("[7] - IMPRIMIR CLIENTES: ");
		System.out.println("[0] - SAIR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");
	}

	public static void imprimeMenuPessoa() {
		System.out.println("===================================");
		System.out.println("[1] - PESSOA FÍSICA: ");
		System.out.println("[2] - PESSOA JURICA: ");
		System.out.println("[0] - VOLTAR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");

	}

	public static void cadastrarPessoaFisica(Scanner sc) {

		System.out.println("=============================");
		System.out.println("         |CADASTRO|");
		System.out.println("=============================");
		System.out.println("       |PESSOA FÍSICA|");
		System.out.println("=============================");
		System.out.print("NOME: ");
		String nome = sc.next();
		System.out.print("IDADE: ");
		int idade = sc.nextInt();
		System.out.print("TELEFONE: ");
		String telefone = sc.next();
		System.out.print("CPF: ");
		String cpf = sc.next();
		System.out.print("NUMERO DE CONTA: ");
		String numeroDeConta = sc.next();
		System.out.print("AGENCIA: ");
		String agencia = sc.next();
		System.out.print("LIMITE DE CHEQUE: ");
		double limiteDeCheque = sc.nextDouble();
		System.out.print("LIMITE DE CREDITO: ");
		double limiteDeCredito = sc.nextDouble();

		gerente.cadastrarPessoaFisica(cpf, nome, idade, numeroDeConta, agencia, telefone, limiteDeCheque,
				limiteDeCredito);
	}

	public static String[] cadastraQuantidadeDeSocios(Scanner sc) {
		int qtdSocios = 0;
		qtdSocios = sc.nextInt();

		String[] nomeSocio = new String[qtdSocios];

		if (qtdSocios > 0 && qtdSocios <= 3) {
			for (int i = 0; i < nomeSocio.length; i++) {
				System.out.println("NOME DO SÓCIO: ");
				String nomeSocios = sc.next();
				nomeSocio[i] = nomeSocios;
			}
		}
		return nomeSocio;// Se der pau no nome socio a gente já sabe o que deu merda
	}

	public static void cadastrarPessoaJuridica(Scanner sc) {

		System.out.println("=============================");
		System.out.println("         |CADASTRO|");
		System.out.println("=============================");
		System.out.println("      |PESSOA JURIDICA|");
		System.out.println("=============================");
		System.out.print("NOME FANTASIA: ");
		String nomeFantasia = sc.next();
		System.out.print("RAZÃO SOCIAL: ");
		String razaoSocial = sc.next();
		System.out.println("- NOME SÓCIO - ");
		System.out.print("QUANTIDADE DE SÓCIOS: ");
		String[] nomeSocio = cadastraQuantidadeDeSocios(sc);
		System.out.print("CNPJ: ");
		String cnpj = sc.next();
		System.out.print("TELEFONE:");
		String telefone = sc.next();
		System.out.print("NUMERO DE CONTA: ");
		String numeroDeConta = sc.next();
		System.out.print("AGENCIA: ");
		String agencia = sc.next();
		System.out.print("LIMITE DE CHEQUE: ");
		double limiteDeCheque = sc.nextDouble();
		System.out.print("LIMITE DE CREDITO: ");
		double limiteDeCredito = sc.nextDouble();

		gerente.cadastrarPessoaJuridica(cnpj, nomeSocio, razaoSocial, nomeFantasia, numeroDeConta, agencia, telefone,
				limiteDeCheque, limiteDeCredito);
	}

	public static void imprimeMenuLimite() {
		System.out.println("===================================");
		System.out.println("          |QUAL LIMITE?|");
		System.out.println("===================================");
		System.out.println("[1] - LIMITE DE CHEQUE ESPECIAL");
		System.out.println("[2] - LIMITE DE CARTÃO DE CREDITO ");
		System.out.println("[0] - VOLTAR");
		System.out.println("===================================");
	}

	public static void aumentarLimiteCheque(Scanner sc) {
		System.out.println("=============================");
		System.out.println(" |AUMENTAR LIMITE DE CHEQUE|");
		System.out.println("=============================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NUMERO DA CONTA: ");
		String numeroDaConta = sc.next();
		System.out.print("O AUMENTO DO LIMITE: ");
		double aumentoLimite = sc.nextDouble();

		gerente.aumentarLimiteCheque(numeroDaConta, aumentoLimite);
	}

	public static void aumentarLimiteCartao(Scanner sc) {
		System.out.println("=============================");
		System.out.println(" |AUMENTAR LIMITE DO CARTÃO|");
		System.out.println("=============================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NUMERO DA CONTA: ");
		String numeroDaConta = sc.next();
		System.out.print("O AUMENTO DO LIMITE: ");
		double aumentoLimite = sc.nextDouble();

		gerente.aumentarLimiteCartao(numeroDaConta, aumentoLimite);
	}

	public static void transferirEntreClientes(Scanner sc) {
		System.out.println("=============================");
		System.out.println(" |TRANSFERIR ENTRE CLIENTES|");
		System.out.println("=============================");
		System.out.print("NÚMERO CONTA DE SAÍDA: ");
		String numeroContaSaida = sc.next();
		System.out.print("VALOR: ");
		double valor = sc.nextDouble();
		System.out.print("NÚMERO CONTA DE ENTRADA: ");
		String numeroContaEntrada = sc.next();

		gerente.fazerTransferencia(numeroContaEntrada, numeroContaSaida, valor);
	}

	public static void diminuirLimiteCartao(Scanner sc) {
		System.out.println("=============================");
		System.out.println(" |DIMINUIR LIMITE DO CARTÃO|");
		System.out.println("=============================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NUMERO DA CONTA: ");
		String numeroDaConta = sc.next();
		System.out.print("DIMINUIR LIMITE EM: ");
		double diminuirLimite = sc.nextDouble();

		gerente.diminuirLimiteCartao(numeroDaConta, diminuirLimite);
	}

	public static void diminuirLimiteCheque(Scanner sc) {
		System.out.println("=============================");
		System.out.println(" |DIMINUIR LIMITE DO CHEQUE|");
		System.out.println("=============================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NUMERO DA CONTA: ");
		String numeroDaConta = sc.next();
		System.out.print("DIMINUIR LIMITE EM: ");
		double diminuirLimite = sc.nextDouble();

		gerente.diminuirLimiteCheque(numeroDaConta, diminuirLimite);
	}

	public static void adicionarSaldo(Scanner sc) {
		System.out.println("=================================");
		System.out.println("        |ADICIONAR SALDO|");
		System.out.println("=================================");
		System.out.print("NUMERO DE CONTA: ");
		String numeroDaConta = sc.next();
		System.out.print("SALDO: ");
		double adicionarSaldo = sc.nextDouble();

		gerente.adicionarSaldo(numeroDaConta, adicionarSaldo);
	}

	public static void removerPessoa(Scanner sc) {
		System.out.println("=============================");
		System.out.println("          |REMOVER|");
		System.out.println("=============================");
		System.out.print("NÚMERO DA CONTA: ");
		String numeroDeConta = sc.next();

		if (gerente.removerClientes(numeroDeConta)) {
			System.out.println("CLIENTE REMOVIDO COM SUCESSO!");
		} else {
			System.out.println("CLIENTE NÃO ENCONTRADO, TENTE NOVAMENTE!");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		int opcaoPessoa;
		int opcaoAumentarLimite;
		int opcaoDiminuirLimite;
		
//		imprimeMenuQtdMenu(sc);
		
		do {
			
			imprimeMenuPrincipal();
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				do {
					imprimeMenuPessoa();
					opcaoPessoa = sc.nextInt();
					switch (opcaoPessoa) {
					case 1:
						cadastrarPessoaFisica(sc);
						break;

					case 2:
						cadastrarPessoaJuridica(sc);
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}
				} while (opcaoPessoa != 0);
				break;
			case 2:
				imprimeMenuLimite();
				opcaoAumentarLimite = sc.nextInt();

				do {
					switch (opcaoAumentarLimite) {

					case 1:
						aumentarLimiteCheque(sc);
						break;

					case 2:
						aumentarLimiteCartao(sc);
						break;

					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}
				} while (opcaoAumentarLimite != 0);

				break;

			case 3:

				imprimeMenuLimite();
				opcaoDiminuirLimite = sc.nextInt();
				do {
					switch (opcaoDiminuirLimite) {
					case 1:
						diminuirLimiteCartao(sc);
						break;
					case 2:
						diminuirLimiteCheque(sc);
						break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}

				} while (opcaoDiminuirLimite != 0);
				break;
			case 4:
				transferirEntreClientes(sc);
				break;
			case 5:
				adicionarSaldo(sc);
				break;
			case 6:
				removerPessoa(sc);
				break;
			case 7:
				gerente.imprimirCliente();
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA!");
			}

		} while (opcao != 0);

		sc.close();
	}

}
