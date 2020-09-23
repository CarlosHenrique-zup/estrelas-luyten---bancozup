package zup.estrelas.luyten;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String nome;
	private int idade;

	public PessoaFisica(String cpf, String nome, int idade, String numeroDeConta, String agencia, String telefone,
			double limiteDeCheque, double limiteDeCredito) {
		super(numeroDeConta, agencia, telefone, limiteDeCheque, limiteDeCredito);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
}
