package br.com.zup.estrelas.luyten;

import java.util.Scanner;

public class ProgramaPrincipal {

	private static Gerente gerente = new Gerente();

	public static void imprimeMenuPrincipal() {
		System.out.println("\n===================================");
		System.out.println("            |BANCO-ZUP|");
		System.out.println("===================================");
		System.out.println("      [BY: ESTRELAS-LYUTEN]");
		System.out.println("===================================");
		System.out.println("[1] - CADASTRAR CLIENTE ");
		System.out.println("[2] - AUMENTAR LIMITE ");
		System.out.println("[3] - DIMINUIR LIMITE");
		System.out.println("[4] - TRANSFERIR ENTRE CLIENTES ");
		System.out.println("[5] - ADICIONAR SALDO ");
		System.out.println("[6] - REMOVER CLIENTE ");
		System.out.println("[7] - IMPRIMIR CLIENTES ");
		System.out.println("[0] - SAIR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");
	}

	public static void imprimeMenuAdicionaCliente() {
		System.out.println("\n===================================");
		System.out.println("[1] - PESSOA FÍSICA ");
		System.out.println("[2] - PESSOA JURICA ");
		System.out.println("[0] - VOLTAR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");
	}
	
	public static void adicionaClientePessoaFisica(Scanner teclado) {

		System.out.println("\n===================================");
		System.out.println("             |CADASTRO|");
		System.out.println("===================================");
		System.out.println("          |PESSOA FÍSICA|");
		System.out.println("===================================");

		teclado.nextLine();
		
		System.out.print("AGÊNCIA: ");
		String agencia = teclado.next();

		System.out.print("NÚMERO DE CONTA: ");
		String conta = teclado.next();

		System.out.print("NOME: ");
		String nome = teclado.next();

		System.out.print("IDADE: ");
		int idade = teclado.nextInt();

		System.out.print("CPF: ");
		String cpf = teclado.next();

		System.out.print("TELEFONE: ");
		String telefone = teclado.next();

		System.out.print("LIMITE DE CHEQUE: ");
		double limiteChequeEspecial = teclado.nextDouble();

		System.out.print("LIMITE DE CRÉDITO: ");
		double limiteCartaoCredito = teclado.nextDouble();

		gerente.adicionaClientePessoaFisica(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito, cpf,
				nome, idade);
	}

	public static String[] registraQtdSocios(Scanner teclado) {

		int qtdSocios = 0;
		qtdSocios = teclado.nextInt();

		String[] socios = new String[qtdSocios];

		if (qtdSocios > 0 && qtdSocios <= 3) {

			for (int i = 0; i < socios.length; i++) {
				System.out.print("NOME DO SÓCIO: ");
				String nomeSocio = teclado.next();
				socios[i] = nomeSocio;
			}
		}
		return socios;
	}

	public static void adicionaClientePessoaJuridica(Scanner teclado) {

		System.out.println("\n===================================");
		System.out.println("            |CADASTRO|");
		System.out.println("===================================");
		System.out.println("         |PESSOA JURÍDICA|");
		System.out.println("===================================");

		teclado.nextLine();
		
		System.out.print("AGÊNCIA: ");
		String agencia = teclado.next();

		System.out.print("NÚMERO DE CONTA: ");
		String conta = teclado.next();

		System.out.print("RAZÃO SOCIAL: ");
		String razaoSocial = teclado.next();

		System.out.print("NOME FANTASIA: ");
		String nomeFantasia = teclado.next();

		System.out.print("QUANTOS SÓCIOS TERÃO: ");
		String socios[] = registraQtdSocios(teclado);

		System.out.print("CNPJ: ");
		String cnpj = teclado.next();

		System.out.print("TELEFONE: ");
		String telefone = teclado.next();

		System.out.print("LIMITE DE CHEQUE: ");
		double limiteChequeEspecial = teclado.nextDouble();

		System.out.print("LIMITE DE CRÉDITO: ");
		double limiteCartaoCredito = teclado.nextDouble();

		gerente.adicionaClientePessoaJuridica(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito, cnpj,
				socios, razaoSocial, nomeFantasia);
	}

	public static void imprimeMenuLimite() {
		System.out.println("\n===================================");
		System.out.println("          |QUAL LIMITE?|");
		System.out.println("===================================");
		System.out.println("[1] - LIMITE DE CHEQUE ESPECIAL");
		System.out.println("[2] - LIMITE DE CARTÃO DE CREDITO ");
		System.out.println("[0] - VOLTAR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");
	}
	
	public static void aumentaLimiteChequeEspecial(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("    |AUMENTA LIMITE DE CHEQUE|");
		System.out.println("===================================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NÚMERO DA CONTA: ");
		String conta = teclado.next();
		System.out.print("VALOR DO AUMENTO DO LIMITE: ");
		double limiteAdicional = teclado.nextDouble();
		
		gerente.aumentaLimiteChequeEspecial(conta, limiteAdicional);
	}
	
	public static void diminuiLimiteChequeEspecial(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("    |DIMINUI LIMITE DO CHEQUE|");
		System.out.println("===================================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NÚMERO DA CONTA: ");
		String conta = teclado.next();
		System.out.print("VALOR DO DIMINUTO DO LIMITE: ");
		double limiteAdicional = teclado.nextDouble();
		
		gerente.diminuiLimiteChequeEspecial(conta, limiteAdicional);
	}
	
	public static void aumentaLimiteCartaoCredito(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("    |AUMENTA LIMITE DO CARTÃO|");
		System.out.println("===================================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NÚMERO DA CONTA: ");
		String conta = teclado.next();
		System.out.print("VALOR DO AUMENTO DO LIMITE: ");
		double limiteAdicional = teclado.nextDouble();
		
		gerente.aumentaLimiteCartaoCredito(conta, limiteAdicional);
	}
	
	public static void diminuiLimiteCartaoCredito(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("  |DIMINUI LIMITE DO CHEQUE|");
		System.out.println("===================================");
		System.out.println("GERENTE, DIGITE ");
		System.out.print("NÚMERO DA CONTA: ");
		String conta = teclado.next();
		System.out.print("VALOR DO DIMINUTO DO LIMITE: ");
		double limiteAdicional = teclado.nextDouble();
		
		gerente.diminuiLimiteCartaoCredito(conta, limiteAdicional);
	}
	
	public static void transferirEntreClientes(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("   |TRANSFERIR ENTRE CLIENTES|");
		System.out.println("===================================");
		System.out.print("NÚMERO CONTA DE SAÍDA: ");
		String contaDeSaida = teclado.next();
		System.out.print("VALOR DE SAÍDA: R$ ");
		double valorDeSaida = teclado.nextDouble();
		System.out.print("NÚMERO CONTA DE ENTRADA: ");
		String contaDeEntrada = teclado.next();

		gerente.transfereEntreContas(contaDeSaida, valorDeSaida, contaDeEntrada);
	}
	
	public static void adicionaSaldo(Scanner teclado) {

		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("         |ADICIONAR SALDO|");
		System.out.println("===================================");
		System.out.print("NÚMERO DE CONTA: ");
		String conta = teclado.next();
		System.out.print("SALDO ADICIONAL: R$ ");
		double saldoAdicional = teclado.nextDouble();

		gerente.adicionaSaldoEmConta(conta, saldoAdicional);
	}
	
	public static void imprimeMenuClientes() {
		System.out.println("\n===================================");
		System.out.println("[1] - TODOS OS CLIENTES");
		System.out.println("[2] - PESSOAS FÍSICAS ");
		System.out.println("[3] - PESSOAS JURICAS ");
		System.out.println("[0] - VOLTAR");
		System.out.println("===================================");
		System.out.print("\nOPÇÃO: ");
	}
	
	public static void imprimeTodosOsClientes() {
		gerente.imprimeClientes();
	}
	
	public static void imprimeClientesPessoaFisica() {
		gerente.imprimeClientesPessoaFisica();
	}
	
	public static void imprimeClientesPessoaJuridica() {
		gerente.imprimeClientesPessoaJuridica();
	}

	public static void removeCliente(Scanner teclado) {
		
		teclado.nextLine();
		
		System.out.println("\n===================================");
		System.out.println("             |REMOVER|");
		System.out.println("===================================");
		System.out.print("NÚMERO DA CONTA: ");
		String conta = teclado.next();

		gerente.removeCliente(conta);
	}
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		int opcaoPessoa;
		int opcaoAumentaLimite;
		int opcaoDiminuiLimite;
		int opcaoImprimeCliente;
		
		do {
			
			imprimeMenuPrincipal();
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				
				do {
					imprimeMenuAdicionaCliente();
					opcaoPessoa = teclado.nextInt();
					switch (opcaoPessoa) {
					
					case 1:
						adicionaClientePessoaFisica(teclado);
						break;

					case 2:
						adicionaClientePessoaJuridica(teclado);
						break;
					
					case 0:
						break;
						
					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}
					
				} while (opcaoPessoa != 0);
				
				break;
			
			case 2:	
				
				do {
					imprimeMenuLimite();
					opcaoAumentaLimite = teclado.nextInt();
					switch (opcaoAumentaLimite) {

					case 1:
						aumentaLimiteChequeEspecial(teclado);
						break;

					case 2:
						aumentaLimiteCartaoCredito(teclado);
						break;
						
					case 0:
						break;

					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}
					
				} while (opcaoAumentaLimite != 0);

				break;

			case 3:
				
				do {
					imprimeMenuLimite();
					opcaoDiminuiLimite = teclado.nextInt();
					switch (opcaoDiminuiLimite) {
					
					case 1:
						diminuiLimiteChequeEspecial(teclado);
						break;
					
					case 2:
						diminuiLimiteCartaoCredito(teclado);
						break;
						
					case 0:
						break;
					
					default:
						System.out.println("OPÇÃO INVÁLIDA!");
					}

				} while (opcaoDiminuiLimite != 0);
				
				break;
			
			case 4:
				transferirEntreClientes(teclado);
				break;
			
			case 5:
				adicionaSaldo(teclado);
				break;
			
			case 6:
				removeCliente(teclado);
				break;
			
			case 7:
				
				do {
					imprimeMenuClientes();
					opcaoImprimeCliente = teclado.nextInt();
					switch (opcaoImprimeCliente) {
					
					case 1:
						imprimeTodosOsClientes();
						break;
						
					case 2:
						imprimeClientesPessoaFisica();
						break;
						
					case 3:
						imprimeClientesPessoaJuridica();
						break;
						
					case 0:
						break;
					}
				} while (opcaoImprimeCliente != 0);
				
				break;
				
			case 0:
				System.out.println("ATÉ A PRÓXIMA, GERENTE (:");
				break;

			default:
				System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
			}

		} while (opcao != 0);

		teclado.close();
	}
}