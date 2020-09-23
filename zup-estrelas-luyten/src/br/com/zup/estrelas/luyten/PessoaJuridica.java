package br.com.zup.estrelas.luyten;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String[] socios;
	private String razaoSocial;
	private String nomeFantasia;
	
	public PessoaJuridica (String conta, String agencia, String telefone, 
						  double limiteChequeEspecial, double limiteCartaoCredito,
						  String cnpj, String[] socios, String razaoSocial, String nomeFantasia) {
		
		super(conta, agencia, telefone, limiteChequeEspecial, limiteCartaoCredito);
		
		this.cnpj = cnpj;
		this.socios = socios;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public String[] getSocios() {
		return socios;
	}
	
	public String getRazaoSocial() {
		return this.razaoSocial;
	}
	
	public String getNomeFantasia() {
		return this.nomeFantasia;
	}
}