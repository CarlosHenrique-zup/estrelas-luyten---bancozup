package br.com.zup.estrelas.luyten;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String nome;
	private int idade;
	
	public PessoaFisica (String conta, String agencia, String telefone, 
						 double limiteChequeEspecial, double limiteCartaoCredito,
						 String cpf, String nome, int idade) {
		
		super(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito);
		
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
}