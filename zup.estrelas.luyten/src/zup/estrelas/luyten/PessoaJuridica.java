package zup.estrelas.luyten;

public class PessoaJuridica extends Cliente {

	private String cnpj;
	private String[] nomeSocio;
	private String razaoSocial;
	private String nomeFantasia;

	public PessoaJuridica(String cnpj, String[] nomeSocio, String razaoSocial, String nomeFantasia,
			String numeroDeConta, String agencia, String telefone, double limiteDeCheque, double limiteDeCredito) {
		super(numeroDeConta, agencia, telefone, limiteDeCheque, limiteDeCredito);
		this.cnpj = cnpj;
		this.nomeSocio = new String[3];
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}

	public String[] getNomeSocio() {
		return nomeSocio;
	}

	public void setNomeSocio(String[] nomeSocio) {
		this.nomeSocio = nomeSocio;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

}
